package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/install_plugins.yml
 * Map.hackathonLabel: create_java_class_Ansible_install_plugins
 * Map.hackathonMission: Define the playbook to run locally. 
 * Map.hackathonTitle: create an Ansible Playbook to setup the main ChRIS plugins. 
 * Map.hackathonColumn: Automate ChRIS install
 * Map.hackathonLabels: ansible,yml
 * enUS: Define the playbook to run locally. 
 * enUS: Run the chris_plugins role to load the main ChRIS plugins. 
 */
public class Ansible_install_plugins {

	/**
	 * DisplayName.enUS: Define the playbook to run locally. 
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/install_plugins.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//# Define the playbook to run locally. 
//- name: Install only the ChRIS plugins locally in podman with Ansible
//  connection: local
//  hosts: localhost
	}

	/**
	 * DisplayName.enUS: Run the chris_plugins role to load the main ChRIS plugins. 
	 * enUS: 
	 */
	public void part2() {
//
//  # Run the chris_plugins role to load the main ChRIS plugins. 
//  roles:
//    - chris_plugins
	}
}
