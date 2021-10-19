package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/chris_worker_periodic.yml
 * Map.hackathonLabel: create_java_class_Ansible_chris_worker_periodic
 * Map.hackathonMission: create an Ansible Playbook to setup the worker container locally
 * Map.hackathonTitle: Create the file ChRIS_ultron_backEnd/ansible/chris_worker_periodic.yml
 * Map.hackathonColumn: Automate worker
 * Map.hackathonLabels: ansible,yml
 * enUS: define the playbook to run locally
 * enUS: Run the chris_defaults role to load the ChRIS related variables. 
 * enUS: Now run the chris_worker role to install the worker container to podman. 
 */
public class Ansible_chris_worker_periodic {

	/**
	 * DisplayName.enUS: define the playbook to run locally
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/chris_worker_periodic.yml
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
//    # Now run the chris_worker role to install the worker container to podman. 
//    - chris_worker
	}
}
