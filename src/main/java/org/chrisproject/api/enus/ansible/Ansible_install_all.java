package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/install_all.yml
 * Map.hackathonLabel: create_java_class_Ansible_install_all
 * Map.hackathonMission: Define the playbook to run locally. 
 * Map.hackathonTitle: create an Ansible Playbook to setup everything. 
 * Map.hackathonColumn: Automate ChRIS install
 * Map.hackathonLabels: ansible,yml
 * enUS: Define the playbook to run locally. 
 * enUS: Call the main chris role. 
 */
public class Ansible_install_all {

	/**
	 * DisplayName.enUS: Define the playbook to run locally. 
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/install_all.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//# Define the playbook to run locally. 
//- name: Install the ChRIS containers locally in podman with Ansible
//  connection: local
//  hosts: localhost
	}

	/**
	 * DisplayName.enUS: Call the main chris role. 
	 * enUS: 
	 */
	public void part2() {
//
//  # Call the main chris role. 
//  roles:
//    - chris
	}
}
