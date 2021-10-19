package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_pfcon/templates/chris_pfcon.service
 * Map.hackathonLabel: create_pfcon_service_template
 * Map.hackathonMission: define the ChRIS pfcon systemd service file.  
 * Map.hackathonTitle: define the ChRIS pfcon systemd service file.  
 * Map.hackathonColumn: Automate pfcon
 * Map.hackathonLabels: ansible,yml
 */
public class Ansible_roles_chris_pfcon_templates_chris_pfcon {

	/**
	 * DisplayName.enUS: create the code
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_pfcon/templates/chris_pfcon.service
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
//ExecStart=/usr/bin/podman run --name {{ PFCON_NAME }}{% if APP_POD_NETWORK is defined %} --pod {{ PFCON_POD }}{% endif %}{% if APP_CONTAINER_NETWORK is defined %} --network {{ APP_CONTAINER_NETWORK }}{% endif %} -v {{ APP_DATA }}:/home/localuser/storeBase:Z -v {{ PFCON_SRC }}:/home/localuser/pfcon --rm -e "SECRET_KEY={{ APP_SECRET_KEY }}" -e "COMPUTE_SERVICE_URL=http://{{ PMAN_HOSTNAME }}:5010/api/v1/" {{ PFCON_IMAGE }}:{{ PFCON_VERSION }} gunicorn -w 5 -b 0.0.0.0:30005 -t 200 pfcon.wsgi:application
//ExecStop=/usr/bin/podman rm {{ PFCON_NAME }} -f
//Restart=on-failure
//
//[Install]
//WantedBy=multi-user.target
	}
}
