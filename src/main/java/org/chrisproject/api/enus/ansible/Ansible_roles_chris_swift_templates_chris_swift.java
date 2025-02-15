package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_swift/templates/chris_swift.service
 * Map.hackathonLabel: create_swift_service_template
 * Map.hackathonMission: define the ChRIS Swift storage systemd service file.  
 * Map.hackathonTitle: define the ChRIS Swift storage systemd service file.  
 * Map.hackathonColumn: Automate swift
 * Map.hackathonLabels: ansible,yml
 */
public class Ansible_roles_chris_swift_templates_chris_swift {

	/**
	 * DisplayName.enUS: create the code
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_swift/templates/chris_swift.service
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
//ExecStart=/usr/bin/podman run --name {{ SWIFT_NAME }}{% if APP_POD_NETWORK is defined %} --pod {{ SWIFT_POD }}{% endif %}{% if APP_CONTAINER_NETWORK is defined %} --network {{ APP_CONTAINER_NETWORK }}{% endif %} -v {{ APP_SWIFT_DATA }}:/srv --rm -e "SWIFT_USERNAME={{ SWIFT_USERNAME }}" -e "SWIFT_KEY={{ SWIFT_KEY }}" {{ SWIFT_IMAGE }}:{{ SWIFT_VERSION }}
//ExecStop=/usr/bin/podman rm {{ SWIFT_NAME }} -f
//Restart=on-failure
//
//[Install]
//WantedBy=multi-user.target
	}
}
