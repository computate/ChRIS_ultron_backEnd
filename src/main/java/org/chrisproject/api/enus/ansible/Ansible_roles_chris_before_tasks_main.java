package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_before/tasks/main.yml
 * Map.hackathonLabel: create_before_tasks
 * Map.hackathonMission: Automate the installation of ChRIS dependencies. 
 * Map.hackathonTitle: define the beginning Ansible tasks to install ChRIS to podman locally.
 * Map.hackathonColumn: Automate ChRIS install
 * Map.hackathonLabels: ansible,yml
 * enUS: Automate the installation of ChRIS dependencies. 
 * enUS: Check the system podman version to determine network settings. 
 * enUS: Allow Podman to run containers as systemd services for better logging, starting, stopping and enabling services. 
 * enUS: Automate the deployment of a shared podman pod for the ChRIS applications on a shared network. 
 * enUS: Setup the ChRIS data directory. 
 */
public class Ansible_roles_chris_before_tasks_main {

	/**
	 * DisplayName.enUS: Automate the installation of ChRIS dependencies. 
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_before/tasks/main.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//# Automate the installation of ChRIS dependencies. 
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
	}

	/**
	 * DisplayName.enUS: Check the system podman version to determine network settings. 
	 * enUS: 
	 */
	public void part2() {
//
//# Check the system podman version to determine network settings. 
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
	}

	/**
	 * DisplayName.enUS: Allow Podman to run containers as systemd services for better logging, starting, stopping and enabling services. 
	 * enUS: 
	 */
	public void part3() {
//
//# Allow Podman to run containers as systemd services for better logging, starting, stopping and enabling services. 
//- name: Set container_manage_cgroup flag on to run podman containers as systemd services and keep it persistent across reboots
//  ansible.posix.seboolean:
//    name: container_manage_cgroup
//    state: true
//    persistent: true
//  become: true
//  vars:
//    ansible_python_interpreter: "{{ APP_PYTHON }}"
	}

	/**
	 * DisplayName.enUS: Automate the deployment of a shared podman pod for the ChRIS applications on a shared network. 
	 * enUS: 
	 */
	public void part4() {
//
//# Automate the deployment of a shared podman pod for the ChRIS applications on a shared network. 
//- name: Create a podman pod {{ APP_POD }} with network {{ APP_POD_NETWORK }}
//  containers.podman.podman_pod:
//    name: "{{ APP_POD }}"
//    network: "{{ APP_POD_NETWORK }}"
//    publish:
//      - "{{ PFCON_PORT }}:30005"
//      - "{{ PMAN_PORT }}:5010"
//      - "{{ DEV_DB_PORT }}:5432"
//      - "{{ SWIFT_PORT }}:8080"
//      - "{{ DEV_PORT }}:8000"
//      - "{{ STORE_PORT }}:8010"
//      - "{{ UI_PORT }}:3000"
//      - "6900-6905:6900-6905"
//    state: started
//  become: true
//  when: APP_POD_NETWORK is defined
	}

	/**
	 * DisplayName.enUS: Setup the ChRIS data directory. 
	 * enUS: 
	 */
	public void part5() {
//
//# Setup the ChRIS data directory. 
//- name: Create the {{ APP_NAME }} data directory {{ APP_DATA }}. 
//  file:
//    name: "{{ APP_DATA }}"
//    state: directory
//    owner: "{{ APP_USER }}"
//    mode: 0777
//  become: true
//- name: set SELinux permissions on {{ APP_DATA }}
//  sefcontext:
//    target: "{{ APP_DATA }}(/.*)?"
//    setype: container_file_t
//  become: true
//  vars:
//    ansible_python_interpreter: "{{ APP_PYTHON }}"
//- name: reload SELinux policy to ensure that {{ APP_NAME }} is executable
//  command: "restorecon -irv {{ APP_DATA }}"
//  become: true
	}
}
