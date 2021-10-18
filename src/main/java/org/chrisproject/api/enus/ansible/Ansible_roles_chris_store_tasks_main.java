package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_store/tasks/main.yml
 * Map.hackathonLabel: create_store_tasks
 * Map.hackathonMission: Automate the deployment of ChRIS store as a Podman container running as a Systemd service. 
 * Map.hackathonTitle: define the Ansible tasks to install the store application as a container in podman. 
 * Map.hackathonColumn: Automate store
 * Map.hackathonLabels: ansible,yml
 * enUS: Automate the deployment of ChRIS store as a Podman container running as a Systemd service. 
 */
public class Ansible_roles_chris_store_tasks_main {

	/**
	 * DisplayName.enUS: Automate the deployment of ChRIS store as a Podman container running as a Systemd service. 
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_store/tasks/main.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//# Automate the deployment of ChRIS store as a Podman container running as a Systemd service. 
//- name: Create the {{ STORE_NAME }} systemd service {{ STORE_SYSTEMD }}. 
//  template:
//    src: chris_store.service
//    dest: "{{ STORE_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Reload the services. 
//  systemd:
//    daemon_reload: true
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ STORE_SERVICE }} service. 
//  service:
//    name: "{{ STORE_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
	}
}
