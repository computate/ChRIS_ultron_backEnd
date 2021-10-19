package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_queue/templates/chris_queue.service
 * Map.hackathonLabel: create_queue_service_template
 * Map.hackathonMission: define the ChRIS RabbitMQ queue systemd service file
 * Map.hackathonTitle: define the ChRIS RabbitMQ queue systemd service file
 * Map.hackathonColumn: Automate queue
 * Map.hackathonLabels: ansible,yml
 */
public class Ansible_roles_chris_queue_templates_chris_queue {

	/**
	 * DisplayName.enUS: create the code
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_queue/templates/chris_queue.service
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
//ExecStart=/usr/bin/podman run --name {{ QUEUE_NAME }}{% if APP_POD_NETWORK is defined %} --pod {{ QUEUE_POD }}{% endif %}{% if APP_CONTAINER_NETWORK is defined %} --network {{ APP_CONTAINER_NETWORK }}{% endif %} -v {{ APP_QUEUE_DATA }}:/var/lib/rabbitmq --rm {{ QUEUE_IMAGE }}:{{ QUEUE_VERSION }}
//ExecStop=/usr/bin/podman rm {{ QUEUE_NAME }} -f
//Restart=on-failure
//
//[Install]
//WantedBy=multi-user.target
	}
}
