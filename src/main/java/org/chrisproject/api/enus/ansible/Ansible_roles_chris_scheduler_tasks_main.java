package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_scheduler/tasks/main.yml
 * Map.hackathonLabel: create_java_class_Ansible_roles_chris_scheduler_tasks_main
 * Map.hackathonMission: Automate the deployment of ChRIS scheduler as a Podman container running as a Systemd service. 
 * Map.hackathonTitle: define the Ansible tasks to install the pfcon application as a container in podman. 
 * Map.hackathonColumn: Automate pfcon
 * Map.hackathonLabels: ansible,yml
 * enUS: Automate the deployment of ChRIS scheduler as a Podman container running as a Systemd service. 
 */
public class Ansible_roles_chris_scheduler_tasks_main {

	/**
	 * DisplayName.enUS: Automate the deployment of ChRIS scheduler as a Podman container running as a Systemd service. 
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_scheduler/tasks/main.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//# Automate the deployment of ChRIS scheduler as a Podman container running as a Systemd service. 
//- name: Create the {{ SCHEDULER_NAME }} systemd service {{ SCHEDULER_SYSTEMD }}. 
//  template:
//    src: chris_scheduler.service
//    dest: "{{ SCHEDULER_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Reload the services. 
//  systemd:
//    daemon_reload: true
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ SCHEDULER_SERVICE }} service. 
//  service:
//    name: "{{ SCHEDULER_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
	}
}
