package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_scheduler/templates/chris_scheduler.service
 * Map.hackathonLabel: create_scheduler_service_template
 * Map.hackathonMission: define the ChRIS scheduler systemd service file.  
 * Map.hackathonTitle: Create the file ChRIS_ultron_backEnd/ansible/roles/chris_scheduler/templates/chris_scheduler.service
 * Map.hackathonColumn: Automate scheduler
 * Map.hackathonLabels: ansible,yml
 */
public class Ansible_roles_chris_scheduler_templates_chris_scheduler {

	/**
	 * DisplayName.enUS: create the code
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_scheduler/templates/chris_scheduler.service
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
//ExecStart=/usr/bin/podman run --name {{ SCHEDULER_NAME }}{% if APP_POD_NETWORK is defined %} --pod {{ SCHEDULER_POD }}{% endif %}{% if APP_CONTAINER_NETWORK is defined %} --network {{ APP_CONTAINER_NETWORK }}{% endif %} -v {{ APP_BACKEND_DATA }}:/home/localuser/chris_backend --rm -e "DJANGO_SETTINGS_MODULE=config.settings.local" -e "DJANGO_DB_MIGRATE=off" -e "DJANGO_COLLECTSTATIC=off" -e "SWIFT_HOSTNAME={{ SWIFT_HOSTNAME }}" -e "STORE_HOSTNAME={{ STORE_HOSTNAME }}" -e "PFCON_HOSTNAME={{ PFCON_HOSTNAME }}" -e "QUEUE_HOSTNAME={{ QUEUE_HOSTNAME }}" -e "DEV_DB_HOSTNAME={{ DEV_DB_HOSTNAME }}" {{ SCHEDULER_IMAGE }}:{{ SCHEDULER_VERSION }} celery -A core beat -l info --pidfile /home/localuser/celerybeat.pid --scheduler django_celery_beat.schedulers:DatabaseScheduler
//ExecStop=/usr/bin/podman rm {{ SCHEDULER_NAME }} -f
//Restart=on-failure
//
//[Install]
//WantedBy=multi-user.target
	}
}
