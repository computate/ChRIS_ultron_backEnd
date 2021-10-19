package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_podman_tcp/templates/chris_podman_tcp.service
 * Map.hackathonLabel: create_podman_tcp_service_template
 * Map.hackathonMission: define the ChRIS Podman TCP systemd service file
 * Map.hackathonTitle: define the ChRIS Podman TCP systemd service file
 * Map.hackathonColumn: Automate ChRIS install
 * Map.hackathonLabels: ansible,yml
 */
public class Ansible_roles_chris_podman_tcp_templates_chris_podman_tcp {

	/**
	 * DisplayName.enUS: create the code
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_podman_tcp/templates/chris_podman_tcp.service
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//Description=Podman TCP API Service
//After=network.service
//StartLimitIntervalSec=0
//
//[Service]
//Type=exec
//KillMode=process
//Environment=LOGGING="--log-level=info"
//{% if (PODMAN_MAJOR_VERSION | int) > 1 %}
//ExecStart=/usr/bin/podman $LOGGING system service tcp:{{ PODMAN_IP_ADDRESS }}:{{ PODMAN_TCP_PORT }} -t 0
//{% else %}
//ExecStart=/usr/bin/podman varlink tcp:{{ PODMAN_IP_ADDRESS }}:{{ PODMAN_TCP_PORT }} -t 0
//{% endif %}
//
//[Install]
//WantedBy=multi-user.target
	}
}
