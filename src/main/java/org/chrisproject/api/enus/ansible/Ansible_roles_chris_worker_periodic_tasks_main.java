package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_worker_periodic/tasks/main.yml
 * Map.hackathonLabel: create_java_class_Ansible_roles_chris_worker_periodic_tasks_main
 * Map.hackathonMission: Automate the deployment of ChRIS worker periodic as a Podman container running as a Systemd service. 
 * Map.hackathonTitle: define the Ansible tasks to install the pfcon application as a container in podman. 
 * Map.hackathonColumn: Automate pfcon
 * Map.hackathonLabels: ansible,yml
 * enUS: Automate the deployment of ChRIS worker periodic as a Podman container running as a Systemd service. 
 */
public class Ansible_roles_chris_worker_periodic_tasks_main {

	/**
	 * DisplayName.enUS: Automate the deployment of ChRIS worker periodic as a Podman container running as a Systemd service. 
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_worker_periodic/tasks/main.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//# Automate the deployment of ChRIS worker periodic as a Podman container running as a Systemd service. 
//- name: Create the {{ WORKER_PERIODIC_NAME }} systemd service {{ WORKER_PERIODIC_SYSTEMD }}. 
//  template:
//    src: chris_worker_periodic.service
//    dest: "{{ WORKER_PERIODIC_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Reload the services. 
//  systemd:
//    daemon_reload: true
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ WORKER_PERIODIC_SERVICE }} service. 
//  service:
//    name: "{{ WORKER_PERIODIC_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
	}
}
