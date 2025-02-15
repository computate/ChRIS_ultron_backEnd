package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_pfcon/tasks/main.yml
 * Map.hackathonLabel: create_pfcon_tasks
 * Map.hackathonMission: define the Ansible tasks to install the pfcon application as a container in podman
 * Map.hackathonTitle: define the Ansible tasks to install the pfcon application as a container in podman
 * Map.hackathonColumn: Automate pfcon
 * Map.hackathonLabels: ansible,yml
 * enUS: automate the setup of the ChRIS pfcon source code repository. 
 * enUS: Automate the deployment of ChRIS pfcon as a Podman container running as a Systemd service. 
 */
public class Ansible_roles_chris_pfcon_tasks_main {

	/**
	 * DisplayName.enUS: automate the setup of the ChRIS pfcon source code repository. 
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_pfcon/tasks/main.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//# automate the setup of the ChRIS pfcon source code repository. 
//- name: Check for the {{ PFCON_NAME }} README file
//  stat:
//    path: "{{ PFCON_SRC }}/README.rst"
//  register: PFCON_README
//- name: Create the {{ PFCON_NAME }} source directory {{ PFCON_SRC }}
//  file:
//    name: "{{ PFCON_SRC }}"
//    state: directory
//    owner: "{{ USER_NAME }}"
//  when: not PFCON_README.stat.exists
//  become: true
//- name: Clone the {{ PFCON_REPO }} source code into {{ PFCON_SRC }}
//  git:
//    repo: "{{ PFCON_REPO }}"
//    dest: "{{ PFCON_SRC }}"
//  when: not PFCON_README.stat.exists
//- name: set SELinux permissions on {{ PFCON_SRC }}
//  sefcontext:
//    target: "{{ PFCON_SRC }}(/.*)?"
//    setype: container_file_t
//  become: true
//  vars:
//    ansible_python_interpreter: "{{ APP_PYTHON }}"
//- name: reload SELinux policy to ensure that {{ APP_NAME }} is executable
//  command: "restorecon -irv {{ PFCON_SRC }}"
//  become: true
	}

	/**
	 * DisplayName.enUS: Automate the deployment of ChRIS pfcon as a Podman container running as a Systemd service. 
	 * enUS: 
	 */
	public void part2() {
//
//# Automate the deployment of ChRIS pfcon as a Podman container running as a Systemd service. 
//- name: Create the {{ PFCON_NAME }} systemd service {{ PFCON_SYSTEMD }}. 
//  template:
//    src: chris_pfcon.service
//    dest: "{{ PFCON_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Reload the services. 
//  systemd:
//    daemon_reload: true
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ PFCON_SERVICE }} service. 
//  service:
//    name: "{{ PFCON_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
	}
}
