package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/chris_ui.yml
 * Map.hackathonLabel: create_java_class_Ansible_chris_ui
 * Map.hackathonMission: create an Ansible Playbook to setup the ui container locally
 * Map.hackathonTitle: Create the file ChRIS_ultron_backEnd/ansible/chris_ui.yml
 * Map.hackathonColumn: Automate ui
 * Map.hackathonLabels: ansible,yml
 * enUS: define the playbook to run locally
 * enUS: Run the chris_defaults role to load the ChRIS related variables. 
 * enUS: Now run the chris_ui role to install the ui container to podman. 
 */
public class Ansible_chris_ui {

	/**
	 * DisplayName.enUS: define the playbook to run locally
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/chris_ui.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//# define the playbook to run locally
//- name: Install the ChRIS containers locally in podman with Ansible
//  connection: local
//  hosts: localhost
	}

	/**
	 * DisplayName.enUS: Run the chris_defaults role to load the ChRIS related variables. 
	 * enUS: 
	 */
	public void part2() {
//
//  # Run the chris_defaults role to load the ChRIS related variables. 
//  roles:
//    - chris_defaults
//    # Now run the chris_ui role to install the ui container to podman. 
//    - chris_ui
	}
}
