package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_dev/templates/chris_dev.service
 * Map.hackathonLabel: create_dev_service_template
 * Map.hackathonMission: define the ChRIS dev systemd service file
 * Map.hackathonTitle: Create the file ChRIS_ultron_backEnd/ansible/roles/chris_dev/templates/chris_dev.service
 * Map.hackathonColumn: Automate dev
 * Map.hackathonLabels: ansible,yml
 */
public class Ansible_roles_chris_dev_templates_chris_dev {

	/**
	 * DisplayName.enUS: create the code
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_dev/templates/chris_dev.service
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//[Unit]
//Description=
//After=network.service
//
//[Service]
//Type=simple
//User={{ APP_USER }}
//ExecStart=/usr/bin/podman run --name {{ DEV_NAME }}{% if APP_POD_NETWORK is defined %} --pod {{ DEV_POD }}{% endif %}{% if APP_CONTAINER_NETWORK is defined %} --network {{ APP_CONTAINER_NETWORK }}{% endif %} -v {{ APP_SRC }}/chris_backend:/home/localuser/chris_backend --rm -e "DJANGO_SETTINGS_MODULE=config.settings.local" -e "DJANGO_DB_MIGRATE=on" -e "DJANGO_COLLECTSTATIC=off" -e "SWIFT_HOSTNAME={{ SWIFT_HOSTNAME }}" -e "STORE_HOSTNAME={{ STORE_HOSTNAME }}" -e "PFCON_HOSTNAME={{ PFCON_HOSTNAME }}" -e "QUEUE_HOSTNAME={{ QUEUE_HOSTNAME }}" -e "DEV_DB_HOSTNAME={{ DEV_DB_HOSTNAME }}" {{ DEV_IMAGE }}:{{ DEV_VERSION }} python manage.py runserver 0.0.0.0:{{ DEV_PORT }}
//ExecStop=/usr/bin/podman rm {{ DEV_NAME }} -f
//Restart=on-failure
//
//[Install]
//WantedBy=multi-user.target
	}
}
