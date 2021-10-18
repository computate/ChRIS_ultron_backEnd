package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_dev/tasks/main.yml
 * Map.hackathonLabel: create_dev_tasks
 * Map.hackathonMission: Automate the deployment of ChRIS dev as a Podman container running as a Systemd service. 
 * Map.hackathonTitle: define the Ansible tasks to install the ChRIS dev application as a container in podman. 
 * Map.hackathonColumn: Automate dev
 * Map.hackathonLabels: ansible,yml
 * enUS: Automate the deployment of ChRIS dev as a Podman container running as a Systemd service. 
 */
public class Ansible_roles_chris_dev_tasks_main {

	/**
	 * DisplayName.enUS: Automate the deployment of ChRIS dev as a Podman container running as a Systemd service. 
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_dev/tasks/main.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//# Automate the deployment of ChRIS dev as a Podman container running as a Systemd service. 
//- name: Create the {{ DEV_NAME }} systemd service {{ DEV_SYSTEMD }}. 
//  template:
//    src: chris_dev.service
//    dest: "{{ DEV_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Reload the services. 
//  systemd:
//    daemon_reload: true
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ DEV_SERVICE }} service.
//  service:
//    name: "{{ DEV_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
	}
}
