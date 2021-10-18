package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/chris_worker.yml
 * Map.hackathonLabel: create_java_class_Ansible_chris_worker
 * Map.hackathonMission: define the playbook to run locally
 * Map.hackathonTitle: create an Ansible Playbook to setup the worker periodic container locally. 
 * Map.hackathonColumn: Automate worker periodic
 * Map.hackathonLabels: ansible,yml
 * enUS: define the playbook to run locally
 * enUS: Run the chris_defaults role to load the ChRIS related variables. 
 * enUS: Now run the chris_worker_periodic role to install the worker_periodic container to podman. 
 */
public class Ansible_chris_worker {

	/**
	 * DisplayName.enUS: define the playbook to run locally
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/chris_worker.yml
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
//    # Now run the chris_worker_periodic role to install the worker_periodic container to podman. 
//    - chris_worker_periodic
	}
}
