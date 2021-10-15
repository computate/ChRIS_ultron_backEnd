package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_before/tasks/main.yml
 * Map.hackathonLabel: create_before_tasks
 * Map.hackathonMission: Ansible script
 * Map.hackathonTitle: define the beginning Ansible tasks to install ChRIS to podman locally.
 * Map.hackathonColumn: Automate ChRIS install
 * Map.hackathonLabels: ansible,yml
 */
public class Ansible_roles_chris_before_tasks_main {

	/**
	 * DisplayName.enUS: create the code
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_before/tasks/main.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//- name: "install podman dependency"
//  package:
//    name:
//      - python3
//      - python3-pip
//      - libselinux-python
//      - libsemanage-python
//      - podman
//    state: present
//  become: true
//  when: ansible_pkg_mgr != 'homebrew' and APP_PYTHON == '/usr/bin/python'
//  vars:
//    ansible_python_interpreter: "{{ APP_PYTHON }}"
//- name: "install podman dependency"
//  package:
//    name:
//      - python3
//      - python3-pip
//      - python3-libselinux
//      - python3-libsemanage
//      - podman
//    state: present
//  become: true
//  when: ansible_pkg_mgr != 'homebrew' and APP_PYTHON == '/usr/bin/python3'
//  vars:
//    ansible_python_interpreter: "{{ APP_PYTHON }}"
//- name: "install python pip dependencies"
//  pip:
//    name: psycopg2-binary
//    state: present
//  become: true
//  when: ansible_pkg_mgr != 'homebrew' and APP_PYTHON == '/usr/bin/python3'
//  vars:
//    ansible_python_interpreter: "{{ APP_PYTHON }}"
//- name: "install podman dependency"
//  package:
//    name:
//      - python3
//      - python3-pip
//      - python3-libselinux
//      - python3-libsemanage
//      - podman
//    state: present
//  become: true
//  when: ansible_pkg_mgr != 'homebrew' and APP_PYTHON == '/usr/bin/python3'
//  vars:
//    ansible_python_interpreter: "{{ APP_PYTHON }}"
//
//- name: Check podman version
//  shell: "podman -v | cut -d ' ' -f3 | cut -d '.' -f1"
//  register: PODMAN_MAJOR_VERSION_SHELL
//- name: Set podman major version
//  set_fact:
//    PODMAN_MAJOR_VERSION: "{{ PODMAN_MAJOR_VERSION_SHELL.stdout }}"
//- debug:
//    var: PODMAN_MAJOR_VERSION
//- name: Set network vars
//  set_fact:
//    APP_POD_NETWORK: "{{ (APP_NETWORK if (PODMAN_MAJOR_VERSION | int) > 1) | default(omit) }}"
//    APP_CONTAINER_NETWORK: "{{ ('host' if (PODMAN_MAJOR_VERSION | int) <= 1) | default(omit) }}"
//- debug:
//    var: APP_POD_NETWORK
//- debug:
//    var: APP_CONTAINER_NETWORK
//- name: Create a podman network {{ APP_NETWORK }}
//  containers.podman.podman_network:
//    name: "{{ APP_NETWORK }}"
//    state: present
//  become: true
//  when: APP_POD_NETWORK is defined
//
//- name: Set container_manage_cgroup flag on to run podman containers as systemd services and keep it persistent across reboots
//  ansible.posix.seboolean:
//    name: container_manage_cgroup
//    state: true
//    persistent: true
//  become: true
//  vars:
//    ansible_python_interpreter: "{{ APP_PYTHON }}"
	}
}
