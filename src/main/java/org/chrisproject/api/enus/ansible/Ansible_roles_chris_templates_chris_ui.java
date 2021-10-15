package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris/templates/chris_ui.service
 * Map.hackathonLabel: create_ui_service_template
 * Map.hackathonMission: Ansible script
 * Map.hackathonTitle: define the ChRIS UI systemd service file.  
 * Map.hackathonColumn: Automate UI
 * Map.hackathonLabels: ansible,yml
 */
public class Ansible_roles_chris_templates_chris_ui {

	/**
	 * DisplayName.enUS: create the code
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris/templates/chris_ui.service
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
//ExecStart=/usr/bin/podman run --name {{ UI_NAME }}{% if APP_POD_NETWORK is defined %} --pod {{ DEV_DB_POD }}{% endif %}{% if APP_CONTAINER_NETWORK is defined %} --network {{ APP_CONTAINER_NETWORK }}{% endif %} -v {{ UI_DATA }}:/home/localuser --rm {{ UI_IMAGE }}:{{ UI_VERSION }}
//ExecStop=/usr/bin/podman rm {{ UI_NAME }} -f
//Restart=on-failure
//
//[Install]
//WantedBy=multi-user.target
	}
}
