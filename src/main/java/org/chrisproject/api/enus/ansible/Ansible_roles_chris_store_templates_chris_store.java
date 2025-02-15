package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_store/templates/chris_store.service
 * Map.hackathonLabel: create_store_service_template
 * Map.hackathonMission: define the ChRIS store systemd service file.  
 * Map.hackathonTitle: define the ChRIS store systemd service file.  
 * Map.hackathonColumn: Automate store
 * Map.hackathonLabels: ansible,yml
 */
public class Ansible_roles_chris_store_templates_chris_store {

	/**
	 * DisplayName.enUS: create the code
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_store/templates/chris_store.service
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
//ExecStart=/usr/bin/podman run --name {{ STORE_NAME }}{% if APP_POD_NETWORK is defined %} --pod {{ STORE_POD }}{% endif %}{% if APP_CONTAINER_NETWORK is defined %} --network {{ APP_CONTAINER_NETWORK }}{% endif %} --rm -e "DJANGO_SETTINGS_MODULE=config.settings.production" -e "DJANGO_DB_MIGRATE=on" -e "DJANGO_ALLOWED_HOSTS=*" -e 'DJANGO_SECRET_KEY={{ APP_SECRET_KEY }}' -e "DJANGO_CORS_ORIGIN_ALLOW_ALL=true" -e "DJANGO_CORS_ORIGIN_WHITELIST=babymri.org" -e "DJANGO_SECURE_PROXY_SSL_HEADER=" -e "DJANGO_USE_X_FORWARDED_HOST=false" -e "DATABASE_HOST={{ STORE_HOSTNAME }}" -e "DATABASE_PORT={{ DEV_DB_PORT }}" -e "SWIFT_AUTH_URL=http://{{ SWIFT_HOSTNAME }}:{{ SWIFT_PORT }}/auth/v1.0" -e "POSTGRES_DB={{ STORE_DB_DATABASE }}" -e "POSTGRES_USER={{ STORE_DB_USER }}" -e "POSTGRES_PASSWORD={{ STORE_DB_PASSWORD }}" -e "SWIFT_USERNAME={{ SWIFT_USERNAME }}" -e "SWIFT_KEY={{ SWIFT_KEY }}" -e "SWIFT_CONTAINER_NAME=store_users" {{ STORE_IMAGE }}:{{ STORE_VERSION }} python manage.py runserver 0.0.0.0:{{ STORE_PORT }}
//ExecStop=/usr/bin/podman rm {{ STORE_NAME }} -f
//Restart=on-failure
//
//[Install]
//WantedBy=multi-user.target
	}
}
