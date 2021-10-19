package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_podman_tcp/tasks/main.yml
 * Map.hackathonLabel: create_podman_tcp_tasks
 * Map.hackathonMission: define the Ansible tasks to install the Podman TCP application as a container in podman
 * Map.hackathonTitle: Create the file ChRIS_ultron_backEnd/ansible/roles/chris_podman_tcp/tasks/main.yml
 * Map.hackathonColumn: Automate ChRIS install
 * Map.hackathonLabels: ansible,yml
 * enUS: Automate the deployment of ChRIS podman socket service and TCP service as a Podman container running as a Systemd service. 
 */
public class Ansible_roles_chris_podman_tcp_tasks_main {

	/**
	 * DisplayName.enUS: Automate the deployment of ChRIS podman socket service and TCP service as a Podman container running as a Systemd service. 
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_podman_tcp/tasks/main.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//# Automate the deployment of ChRIS podman socket service and TCP service as a Podman container running as a Systemd service. 
//- name: Create the {{ PODMAN_TCP_NAME }} systemd service {{ PODMAN_TCP_SYSTEMD }}. 
//  template:
//    src: chris_podman_tcp.service
//    dest: "{{ PODMAN_TCP_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Reload the services. 
//  systemd:
//    daemon_reload: true
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the podman.socket service. 
//  service:
//    name: "podman.socket"
//    enabled: true
//    state: started
//  become: true
//- name: Start and enable the {{ PODMAN_TCP_SERVICE }} service. 
//  service:
//    name: "{{ PODMAN_TCP_SERVICE }}"
//    enabled: false
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
	}
}
