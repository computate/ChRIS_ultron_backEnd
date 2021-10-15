package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_worker_periodic/templates/chris_worker_periodic.service
 * Map.hackathonLabel: create_worker_periodic_service_template
 * Map.hackathonMission: Ansible script
 * Map.hackathonTitle: define the ChRIS worker periodic systemd service file.  
 * Map.hackathonColumn: Automate worker periodic
 * Map.hackathonLabels: ansible,yml
 */
public class Ansible_roles_chris_worker_periodic_templates_chris_worker_periodic {

	/**
	 * DisplayName.enUS: create the code
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_worker_periodic/templates/chris_worker_periodic.service
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
//ExecStart=/usr/bin/podman run --name {{ WORKER_PERIODIC_NAME }}{% if APP_POD_NETWORK is defined %} --pod {{ WORKER_PERIODIC_POD }}{% endif %}{% if APP_CONTAINER_NETWORK is defined %} --network {{ APP_CONTAINER_NETWORK }}{% endif %} -v {{ APP_BACKEND_DATA }}:/home/localuser/chris_backend --rm -e "DJANGO_SETTINGS_MODULE=config.settings.local" -e "DJANGO_DB_MIGRATE=off" -e "DJANGO_COLLECTSTATIC=off" -e "SWIFT_HOSTNAME={{ SWIFT_HOSTNAME }}" -e "STORE_HOSTNAME={{ STORE_HOSTNAME }}" -e "PFCON_HOSTNAME={{ PFCON_HOSTNAME }}" -e "QUEUE_HOSTNAME={{ QUEUE_HOSTNAME }}" -e "DEV_DB_HOSTNAME={{ DEV_DB_HOSTNAME }}" {{ WORKER_PERIODIC_IMAGE }}:{{ WORKER_PERIODIC_VERSION }} celery -A core worker -c 1 -l DEBUG -Q periodic
//ExecStop=/usr/bin/podman rm {{ WORKER_PERIODIC_NAME }} -f
//Restart=on-failure
//
//[Install]
//WantedBy=multi-user.target
	}
}
