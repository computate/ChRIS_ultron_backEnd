package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_ui/tasks/main.yml
 * Map.hackathonLabel: create_java_class_Ansible_roles_chris_ui_tasks_main
 * Map.hackathonMission: Automomate the setup of the ChRIS UI source code repository. 
 * Map.hackathonTitle: define the Ansible tasks to install the pfcon application as a container in podman. 
 * Map.hackathonColumn: Automate pfcon
 * Map.hackathonLabels: ansible,yml
 * enUS: Automomate the setup of the ChRIS UI source code repository. 
 * enUS: Automate the setup of the ChRIS UI data directory. 
 * enUS: Automate the deployment of ChRIS UI as a Podman container running as a Systemd service. 
 */
public class Ansible_roles_chris_ui_tasks_main {

	/**
	 * DisplayName.enUS: Automomate the setup of the ChRIS UI source code repository. 
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_ui/tasks/main.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//# Automomate the setup of the ChRIS UI source code repository. 
//- name: Check for the {{ UI_NAME }} README file
//  stat:
//    path: "{{ UI_SRC }}/README.md"
//  register: UI_README
//- name: Create the {{ UI_NAME }} source directory {{ UI_SRC }}
//  file:
//    name: "{{ UI_SRC }}"
//    state: directory
//    owner: "{{ USER_NAME }}"
//  when: not UI_README.stat.exists
//  become: true
//- name: Clone the {{ UI_REPO }} source code into {{ UI_SRC }}
//  git:
//    repo: "{{ UI_REPO }}"
//    dest: "{{ UI_SRC }}"
//  when: not UI_README.stat.exists
	}

	/**
	 * DisplayName.enUS: Automate the setup of the ChRIS UI data directory. 
	 * enUS: 
	 */
	public void part2() {
//
//# Automate the setup of the ChRIS UI data directory. 
//- name: Create the {{ APP_NAME }} data directory {{ UI_DATA }}. 
//  file:
//    name: "{{ UI_DATA }}"
//    state: directory
//    owner: "{{ APP_USER }}"
//    mode: 0777
//  become: true
//- name: set SELinux permissions on {{ UI_DATA }}
//  sefcontext:
//    target: "{{ UI_DATA }}(/.*)?"
//    setype: container_file_t
//  become: true
//  vars:
//    ansible_python_interpreter: "{{ APP_PYTHON }}"
//- name: reload SELinux policy to ensure that {{ APP_NAME }} is executable
//  command: "restorecon -irv {{ UI_DATA }}"
//  become: true
	}

	/**
	 * DisplayName.enUS: Automate the deployment of ChRIS UI as a Podman container running as a Systemd service. 
	 * enUS: 
	 */
	public void part3() {
//
//# Automate the deployment of ChRIS UI as a Podman container running as a Systemd service. 
//- name: Create the {{ UI_NAME }} systemd service {{ UI_SYSTEMD }}. 
//  template:
//    src: chris_ui.service
//    dest: "{{ UI_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Reload the services. 
//  systemd:
//    daemon_reload: true
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ UI_SERVICE }} service. 
//  service:
//    name: "{{ UI_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
	}
}
