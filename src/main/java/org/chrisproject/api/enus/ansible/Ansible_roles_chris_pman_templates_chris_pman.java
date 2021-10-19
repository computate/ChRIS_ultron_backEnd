package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_pman/templates/chris_pman.service
 * Map.hackathonLabel: create_pman_service_template
 * Map.hackathonMission: define the ChRIS pman systemd service file.  
 * Map.hackathonTitle: define the ChRIS pman systemd service file.  
 * Map.hackathonColumn: Automate pman
 * Map.hackathonLabels: ansible,yml
 */
public class Ansible_roles_chris_pman_templates_chris_pman {

	/**
	 * DisplayName.enUS: create the code
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_pman/templates/chris_pman.service
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
//ExecStart=/usr/bin/podman run --name {{ PMAN_NAME }}{% if APP_POD_NETWORK is defined %} --pod {{ PMAN_POD }}{% endif %}{% if APP_CONTAINER_NETWORK is defined %} --network {{ APP_CONTAINER_NETWORK }}{% endif %} -v {{ PMAN_SRC }}:/home/localuser/pman --rm -e "STOREBASE={{ APP_DATA }}" -e "SECRET_KEY={{ APP_SECRET_KEY }}" -e "CONTAINER_ENV=podman" -e 'PODMAN_IP_ADDRESS={{ PODMAN_IP_ADDRESS }}' {{ PMAN_IMAGE }}:{{ PMAN_VERSION }}
//ExecStop=/usr/bin/podman rm {{ PMAN_NAME }} -f
//Restart=on-failure
//
//[Install]
//WantedBy=multi-user.target
	}
}
