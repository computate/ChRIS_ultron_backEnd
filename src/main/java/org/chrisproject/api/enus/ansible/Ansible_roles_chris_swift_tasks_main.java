package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_swift/tasks/main.yml
 * Map.hackathonLabel: create_java_class_Ansible_roles_chris_swift_tasks_main
 * Map.hackathonMission: Setup the Swift data directory. 
 * Map.hackathonTitle: define the Ansible tasks to install the pfcon application as a container in podman. 
 * Map.hackathonColumn: Automate pfcon
 * Map.hackathonLabels: ansible,yml
 * enUS: Setup the Swift data directory. 
 * enUS: Automate the deployment of Swift as a Podman container running as a Systemd service. 
 */
public class Ansible_roles_chris_swift_tasks_main {

	/**
	 * DisplayName.enUS: Setup the Swift data directory. 
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_swift/tasks/main.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//# Setup the Swift data directory. 
//- name: Create the {{ APP_NAME }} data directory {{ APP_SWIFT_DATA }}. 
//  file:
//    name: "{{ APP_SWIFT_DATA }}"
//    state: directory
//    owner: "{{ APP_USER }}"
//    mode: 0777
//  become: true
//- name: set SELinux permissions on {{ APP_SWIFT_DATA }}
//  sefcontext:
//    target: "{{ APP_SWIFT_DATA }}(/.*)?"
//    setype: container_file_t
//  become: true
//  vars:
//    ansible_python_interpreter: "{{ APP_PYTHON }}"
//- name: reload SELinux policy to ensure that {{ APP_NAME }} is executable
//  command: "restorecon -irv {{ APP_SWIFT_DATA }}"
//  become: true
	}

	/**
	 * DisplayName.enUS: Automate the deployment of Swift as a Podman container running as a Systemd service. 
	 * enUS: 
	 */
	public void part2() {
//
//# Automate the deployment of Swift as a Podman container running as a Systemd service. 
//- name: Create the {{ SWIFT_NAME }} systemd service {{ SWIFT_SYSTEMD }}. 
//  template:
//    src: chris_swift.service
//    dest: "{{ SWIFT_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Reload the services. 
//  systemd:
//    daemon_reload: true
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ SWIFT_SERVICE }} service. 
//  service:
//    name: "{{ SWIFT_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
	}
}
