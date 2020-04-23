
from django.conf import settings
from rest_framework import serializers

import swiftclient

from collectionjson.fields import ItemLinkField
from core.utils import get_file_resource_link

from .models import PACS, PACSFile


class PACSSerializer(serializers.HyperlinkedModelSerializer):

    class Meta:
        model = PACS
        fields = ('url', 'id', 'identifier')


class PACSFileSerializer(serializers.HyperlinkedModelSerializer):
    file_resource = ItemLinkField('get_file_link')
    path = serializers.CharField(write_only=True)
    fname = serializers.FileField(use_url=False, required=False)
    pacs_identifier = serializers.ReadOnlyField(source='pacs.identifier')
    pacs_name = serializers.CharField(write_only=True)
    name = serializers.CharField(required=False)

    class Meta:
        model = PACSFile
        fields = ('url', 'id', 'creation_date', 'fname', 'path', 'name', 'PatientID',
                  'PatientName', 'StudyInstanceUID', 'StudyDescription',
                  'SeriesInstanceUID', 'SeriesDescription', 'pacs_identifier',
                  'pacs_name', 'file_resource')

    def get_file_link(self, obj):
        """
        Custom method to get the hyperlink to the actual file resource.
        """
        return get_file_resource_link(self, obj)

    def create(self, validated_data):
        """
        Overriden to associate a Swift storage path with the newly created pacs file.
        """
        # remove path as it is not part of the model and then compute fname
        path = validated_data.pop('path')
        pacs_file = super(PACSFileSerializer, self).create(validated_data)
        pacs_file.fname.name = path
        pacs_file.save()
        return pacs_file

    def validate_pacs_name(self, pacs_name):
        """
        Overriden to check whether the provided PACS name is a valid PACS identifier.
        """
        try:
            PACS.objects.get(identifier=pacs_name)
        except PACS.DoesNotExist:
            # validate new PACS identifier
            pacs_serializer = PACSSerializer(data={'identifier': pacs_name})
            try:
                pacs_serializer.is_valid(raise_exception=True)
            except serializers.ValidationError as e:
                raise serializers.ValidationError(e.detail['identifier'])
        return pacs_name

    def validate_path(self, path):
        """
        Overriden to check whether the provided path is under SERVICES/PACS/ path.
        """
        path = path.strip(' ').strip('/')
        if not path.startswith('SERVICES/PACS/'):
            raise serializers.ValidationError(
                ["File path must start with 'SERVICES/PACS/'."])
        # verify that the file is indeed already in Swift
        conn = swiftclient.Connection(user=settings.SWIFT_USERNAME,
                                      key=settings.SWIFT_KEY,
                                      authurl=settings.SWIFT_AUTH_URL)
        object_list = conn.get_container(settings.SWIFT_CONTAINER_NAME, prefix=path)[1]
        if not object_list:
            raise serializers.ValidationError(["Could not find this path."])
        return path

    def validate(self, data):
        """
        Overriden to validate calculated API descriptors from the provided and check
        whether the provided path is already registered.
        """
        # compute file's name
        path = data.get('path')
        path_parts = path.split('/')
        name = path_parts[-1]
        # remove pacs_name as it is not part of the model and then compute pacs
        pacs_name = data.pop('pacs_name')
        (pacs, tf) = PACS.objects.get_or_create(identifier=pacs_name)
        # verify that the file has not already been registered
        search_data = {'PatientID': data.get('PatientID'),
                       'StudyInstanceUID': data.get('StudyInstanceUID'),
                       'SeriesInstanceUID': data.get('SeriesInstanceUID'),
                       'name': name,
                       'pacs': pacs}
        try:
            PACSFile.objects.get(**search_data)
        except PACSFile.DoesNotExist:
            pass
        else:
            error_msg = "File has already been registered."
            raise serializers.ValidationError({'path': [error_msg]})
        # update validated data
        data.update({'name': name, 'pacs': pacs})
        return data
