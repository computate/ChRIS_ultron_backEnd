package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_worker/tasks/main.yml
 * Map.hackathonLabel: create_worker_tasks
 * Map.hackathonMission: define the Ansible tasks to install the worker application as a container in podman
 * Map.hackathonTitle: Create the file ChRIS_ultron_backEnd/ansible/roles/chris_worker/tasks/main.yml
 * Map.hackathonColumn: Automate worker
 * Map.hackathonLabels: ansible,yml
 * enUS: Automate the deployment of ChRIS worker as a Podman container running as a Systemd service. 
 */
public class Ansible_roles_chris_worker_tasks_main {

	/**
	 * DisplayName.enUS: Automate the deployment of ChRIS worker as a Podman container running as a Systemd service. 
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_worker/tasks/main.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//# Automate the deployment of ChRIS worker as a Podman container running as a Systemd service. 
//- name: Create the {{ WORKER_NAME }} systemd service {{ WORKER_SYSTEMD }}. 
//  template:
//    src: chris_worker.service
//    dest: "{{ WORKER_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Reload the services. 
//  systemd:
//    daemon_reload: true
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ WORKER_SERVICE }} service. 
//  service:
//    name: "{{ WORKER_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
	}
}
