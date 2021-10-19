package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/chris_queue.yml
 * Map.hackathonLabel: create_java_class_Ansible_chris_queue
 * Map.hackathonMission: create an Ansible Playbook to setup the queue container locally
 * Map.hackathonTitle: create an Ansible Playbook to setup the queue container locally
 * Map.hackathonColumn: Automate queue
 * Map.hackathonLabels: ansible,yml
 * enUS: define the playbook to run locally
 * enUS: Run the chris_defaults role to load the ChRIS related variables. 
 * enUS: Now run the chris_queue role to install the queue container to podman. 
 */
public class Ansible_chris_queue {

	/**
	 * DisplayName.enUS: define the playbook to run locally
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/chris_queue.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//# define the playbook to run locally
//- name: Install the ChRIS containers locally in podman with Ansible
//  connection: local
//  hosts: localhost
//  
//
//  # Run the chris_defaults role to load the ChRIS related variables. 
//  roles:
//    - chris_defaults
//    # Now run the chris_queue role to install the queue container to podman. 
//    - chris_queue
	}
}
