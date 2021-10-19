package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/install_all.yml
 * Map.hackathonLabel: create_java_class_Ansible_install_all
 * Map.hackathonMission: create an Ansible Playbook to setup everything
 * Map.hackathonTitle: create an Ansible Playbook to setup everything
 * Map.hackathonColumn: Automate ChRIS install
 * Map.hackathonLabels: ansible,yml
 * enUS: Define the playbook to run locally. 
 * enUS: Call the all the  ChRIS Ansible roles. 
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
	 * DisplayName.enUS: Call the all the  ChRIS Ansible roles. 
	 * enUS: 
	 */
	public void part2() {
//
//  # Call the all the  ChRIS Ansible roles. 
//  roles:
//    - chris_defaults
//    - chris_before
//    - chris_dev_db
//    - chris_pman
//    - chris_pfcon
//    - chris_podman_tcp
//    - chris_queue
//    - chris_scheduler
//    - chris_swift
//    - chris_worker
//    - chris_worker_periodic
//    - chris_dev
//    - chris_ui
//    - chris_store
//    - chris_after
//    - chris_plugins
	}
}
