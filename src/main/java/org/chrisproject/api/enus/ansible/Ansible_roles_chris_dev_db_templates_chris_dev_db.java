package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_dev_db/templates/chris_dev_db.service
 * Map.hackathonLabel: create_dev_db_service_template
 * Map.hackathonMission: define the ChRIS dev database systemd service file
 * Map.hackathonTitle: define the ChRIS dev database systemd service file
 * Map.hackathonColumn: Automate dev database
 * Map.hackathonLabels: ansible,yml
 */
public class Ansible_roles_chris_dev_db_templates_chris_dev_db {

	/**
	 * DisplayName.enUS: create the code
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_dev_db/templates/chris_dev_db.service
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
//ExecStart=/usr/bin/podman run --name {{ DEV_DB_NAME }}{% if APP_POD_NETWORK is defined %} --pod {{ DEV_DB_POD }}{% endif %}{% if APP_CONTAINER_NETWORK is defined %} --network {{ APP_CONTAINER_NETWORK }}{% endif %} -v {{ APP_DEV_DB_DATA }}:/var/lib/postgresql/data --rm -e "POSTGRES_DB={{ DEV_DB_DATABASE }}" -e "POSTGRES_USER={{ DEV_DB_BECOME_USER }}" -e "POSTGRES_PASSWORD={{ DEV_DB_BECOME_PASSWORD }}" {{ DEV_DB_IMAGE }}:{{ DEV_DB_VERSION }}
//ExecStop=/usr/bin/podman rm {{ DEV_DB_NAME }} -f
//Restart=on-failure
//
//[Install]
//WantedBy=multi-user.target
	}
}
