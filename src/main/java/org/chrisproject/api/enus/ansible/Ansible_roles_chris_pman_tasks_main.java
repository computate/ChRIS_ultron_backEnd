package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_pman/tasks/main.yml
 * Map.hackathonLabel: create_pman_tasks
 * Map.hackathonMission: define the Ansible tasks to setup the pman application as a container in podman
 * Map.hackathonTitle: define the Ansible tasks to setup the pman application as a container in podman
 * Map.hackathonColumn: Automate pman
 * Map.hackathonLabels: ansible,yml
 * enUS: automate the setup of the ChRIS pman source code repository. 
 * enUS: Automate the deployment of ChRIS pman as a Podman container running as a Systemd service. 
 */
public class Ansible_roles_chris_pman_tasks_main {

	/**
	 * DisplayName.enUS: automate the setup of the ChRIS pman source code repository. 
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_pman/tasks/main.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//# automate the setup of the ChRIS pman source code repository. 
//- name: Check for the {{ PMAN_NAME }} README file
//  stat:
//    path: "{{ PMAN_SRC }}/README.rst"
//  register: PMAN_README
//- name: Create the {{ PMAN_NAME }} source directory {{ PMAN_SRC }}
//  file:
//    name: "{{ PMAN_SRC }}"
//    state: directory
//    owner: "{{ USER_NAME }}"
//  when: not PMAN_README.stat.exists
//  become: true
//- name: Clone the {{ PMAN_REPO }} source code into {{ PMAN_SRC }}
//  git:
//    repo: "{{ PMAN_REPO }}"
//    dest: "{{ PMAN_SRC }}"
//  when: not PMAN_README.stat.exists
//- name: set SELinux permissions on {{ PMAN_SRC }}
//  sefcontext:
//    target: "{{ PMAN_SRC }}(/.*)?"
//    setype: container_file_t
//  become: true
//  vars:
//    ansible_python_interpreter: "{{ APP_PYTHON }}"
//- name: reload SELinux policy to ensure that {{ APP_NAME }} is executable
//  command: "restorecon -irv {{ PMAN_SRC }}"
//  become: true
	}

	/**
	 * DisplayName.enUS: Automate the deployment of ChRIS pman as a Podman container running as a Systemd service. 
	 * enUS: 
	 */
	public void part2() {
//
//# Automate the deployment of ChRIS pman as a Podman container running as a Systemd service. 
//- name: Create the {{ PMAN_NAME }} systemd service {{ PMAN_SYSTEMD }}. 
//  template:
//    src: chris_pman.service
//    dest: "{{ PMAN_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Reload the services. 
//  systemd:
//    daemon_reload: true
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ PMAN_SERVICE }} service. 
//  service:
//    name: "{{ PMAN_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
	}
}
