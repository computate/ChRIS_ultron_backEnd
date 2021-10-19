package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_worker/templates/chris_worker.service
 * Map.hackathonLabel: create_worker_service_template
 * Map.hackathonMission: define the ChRIS worker systemd service file.  
 * Map.hackathonTitle: define the ChRIS worker systemd service file.  
 * Map.hackathonColumn: Automate worker
 * Map.hackathonLabels: ansible,yml
 */
public class Ansible_roles_chris_worker_templates_chris_worker {

	/**
	 * DisplayName.enUS: create the code
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_worker/templates/chris_worker.service
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
//ExecStart=/usr/bin/podman run --name {{ WORKER_NAME }}{% if APP_POD_NETWORK is defined %} --pod {{ WORKER_POD }}{% endif %}{% if APP_CONTAINER_NETWORK is defined %} --network {{ APP_CONTAINER_NETWORK }}{% endif %} -v {{ APP_BACKEND_DATA }}:/home/localuser/chris_backend --rm -e "DJANGO_SETTINGS_MODULE=config.settings.local" -e "DJANGO_DB_MIGRATE=off" -e "DJANGO_COLLECTSTATIC=off" -e "CELERY_RDB_HOST=0.0.0.0" -e "CELERY_RDB_PORT=6900" -e "SWIFT_HOSTNAME={{ SWIFT_HOSTNAME }}" -e "STORE_HOSTNAME={{ STORE_HOSTNAME }}" -e "PFCON_HOSTNAME={{ PFCON_HOSTNAME }}" -e "QUEUE_HOSTNAME={{ QUEUE_HOSTNAME }}" {{ WORKER_IMAGE }}:{{ WORKER_VERSION }} celery -A core worker -c 3 -l DEBUG -Q main1,main2
//ExecStop=/usr/bin/podman rm {{ WORKER_NAME }} -f
//Restart=on-failure
//
//[Install]
//WantedBy=multi-user.target
	}
}
