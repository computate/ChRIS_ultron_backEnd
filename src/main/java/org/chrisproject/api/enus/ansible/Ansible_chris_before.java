package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/chris_before.yml
 * Map.hackathonLabel: create_java_class_Ansible_chris_before
 * Map.hackathonMission: define the playbook to run locally
 * Map.hackathonTitle: create an Ansible Playbook to setup the initial ChRIS prerequisites. 
 * Map.hackathonColumn: Automate ChRIS install
 * Map.hackathonLabels: ansible,yml
 * enUS: define the playbook to run locally
 * enUS: Run the chris_defaults role to load the ChRIS related variables. 
 * enUS: Now run the chris_before role to do the prerequisite steps to installing the other applications. 
 */
public class Ansible_chris_before {

	/**
	 * DisplayName.enUS: define the playbook to run locally
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/chris_before.yml
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
	}

	/**
	 * DisplayName.enUS: Now run the chris_before role to do the prerequisite steps to installing the other applications. 
	 * enUS: 
	 */
	public void part3() {
//
//    # Now run the chris_before role to do the prerequisite steps to installing the other applications. 
//    - chris_before
	}
}
