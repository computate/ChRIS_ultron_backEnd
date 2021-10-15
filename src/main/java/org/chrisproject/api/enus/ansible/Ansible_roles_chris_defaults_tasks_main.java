package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_defaults/tasks/main.yml
 * Map.hackathonLabel: create_java_class_Ansible_roles_chris_defaults_tasks_main
 * Map.hackathonMission: Ansible script
 * Map.hackathonTitle: Create the file ChRIS_ultron_backEnd/ansible/roles/chris_defaults/tasks/main.yml
 * Map.hackathonColumn: 
 * Map.hackathonLabels: 
 */
public class Ansible_roles_chris_defaults_tasks_main {

	/**
	 * DisplayName.enUS: create the code
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_defaults/tasks/main.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//- name: Check podman version
//  shell: "podman -v | cut -d ' ' -f3 | cut -d '.' -f1"
//  register: PODMAN_MAJOR_VERSION_SHELL
//- name: Set podman major version
//  set_fact:
//    PODMAN_MAJOR_VERSION: "{{ PODMAN_MAJOR_VERSION_SHELL.stdout }}"
//- debug:
//    var: PODMAN_MAJOR_VERSION
//- name: Set network vars
//  set_fact:
//    APP_POD_NETWORK: "{{ (APP_NETWORK if (PODMAN_MAJOR_VERSION | int) > 1) | default(omit) }}"
//    APP_CONTAINER_NETWORK: "{{ ('host' if (PODMAN_MAJOR_VERSION | int) <= 1) | default(omit) }}"
//- debug:
//    var: APP_POD_NETWORK
//- debug:
//    var: APP_CONTAINER_NETWORK
	}
}
