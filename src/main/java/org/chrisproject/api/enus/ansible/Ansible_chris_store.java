package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/chris_store.yml
 * Map.hackathonLabel: create_java_class_Ansible_chris_store
 * Map.hackathonMission: create an Ansible Playbook to setup the store container locally
 * Map.hackathonTitle: create an Ansible Playbook to setup the store container locally
 * Map.hackathonColumn: Automate store
 * Map.hackathonLabels: ansible,yml
 * enUS: define the playbook to run locally
 * enUS: Run the chris_defaults role to load the ChRIS related variables. 
 * enUS: Now run the chris_store role to install the store container to podman. 
 */
public class Ansible_chris_store {

	/**
	 * DisplayName.enUS: define the playbook to run locally
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/chris_store.yml
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
//    # Now run the chris_store role to install the store container to podman. 
//    - chris_store
	}
}
