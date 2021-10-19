package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/chris_pfcon.yml
 * Map.hackathonLabel: create_java_class_Ansible_chris_pfcon
 * Map.hackathonMission: create an Ansible Playbook to setup the podman_tcp container locally
 * Map.hackathonTitle: create an Ansible Playbook to setup the podman_tcp container locally
 * Map.hackathonColumn: Automate podman_tcp
 * Map.hackathonLabels: ansible,yml
 * enUS: define the playbook to run locally
 * enUS: Run the chris_defaults role to load the ChRIS related variables. 
 * enUS: Now run the chris_podman_tcp role to install the podman_tcp container to podman. 
 */
public class Ansible_chris_pfcon {

	/**
	 * DisplayName.enUS: define the playbook to run locally
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/chris_pfcon.yml
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
//    # Now run the chris_podman_tcp role to install the podman_tcp container to podman. 
//    - chris_podman_tcp
	}
}
