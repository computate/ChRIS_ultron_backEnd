package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_dev_db/tasks/main.yml
 * Map.hackathonLabel: create_dev_db_tasks
 * Map.hackathonMission: define the Ansible tasks to install the dev PostgreSQL database application as a container in podman
 * Map.hackathonTitle: Create the file ChRIS_ultron_backEnd/ansible/roles/chris_dev_db/tasks/main.yml
 * Map.hackathonColumn: Automate dev database
 * Map.hackathonLabels: ansible,yml
 * enUS: Automate the setup of the ChRIS DB data directory. 
 * enUS: Automate the deployment of ChRIS DB as a Podman container running as a Systemd service. 
 * enUS: Hold until the PostgreSQL database is up and running. 
 * enUS: Setup ChRIS database objects. 
 */
public class Ansible_roles_chris_dev_db_tasks_main {

	/**
	 * DisplayName.enUS: Automate the setup of the ChRIS DB data directory. 
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_dev_db/tasks/main.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//# Automate the setup of the ChRIS DB data directory. 
//- name: Create the {{ APP_NAME }} data directory {{ APP_DEV_DB_DATA }}. 
//  file:
//    name: "{{ APP_DEV_DB_DATA }}"
//    state: directory
//    owner: "{{ APP_USER }}"
//    mode: 0777
//  become: true
//- name: set SELinux permissions on {{ APP_DEV_DB_DATA }}
//  sefcontext:
//    target: "{{ APP_DEV_DB_DATA }}(/.*)?"
//    setype: container_file_t
//  become: true
//  vars:
//    ansible_python_interpreter: "{{ APP_PYTHON }}"
//- name: reload SELinux policy to ensure that {{ APP_NAME }} is executable
//  command: "restorecon -irv {{ APP_DEV_DB_DATA }}"
//  become: true
	}

	/**
	 * DisplayName.enUS: Automate the deployment of ChRIS DB as a Podman container running as a Systemd service. 
	 * enUS: 
	 */
	public void part2() {
//
//# Automate the deployment of ChRIS DB as a Podman container running as a Systemd service. 
//- name: Create the {{ DEV_DB_NAME }} systemd service {{ DEV_DB_SYSTEMD }}. 
//  template:
//    src: chris_dev_db.service
//    dest: "{{ DEV_DB_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Reload the services. 
//  systemd:
//    daemon_reload: true
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ DEV_DB_SERVICE }} service. 
//  service:
//    name: "{{ DEV_DB_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
	}

	/**
	 * DisplayName.enUS: Hold until the PostgreSQL database is up and running. 
	 * enUS: 
	 */
	public void part3() {
//
//# Hold until the PostgreSQL database is up and running. 
//- name: hold until Postgresql is up and running at {{ DEV_DB_HOSTNAME }}:{{DEV_DB_PORT }}
//  wait_for:
//    host: "{{ DEV_DB_HOSTNAME }}"
//    port: "{{ DEV_DB_PORT }}"
	}

	/**
	 * DisplayName.enUS: Setup ChRIS database objects. 
	 * enUS: 
	 */
	public void part4() {
//
//# Setup ChRIS database objects. 
//- name: Create dev database user
//  postgresql_user:
//    name: "{{ DEV_DB_USER }}"
//    password: "{{ DEV_DB_PASSWORD }}"
//    login_user: "{{ DEV_DB_BECOME_USER }}"
//    login_password: "{{ DEV_DB_BECOME_PASSWORD }}"
//    port: "{{ DEV_DB_PORT }}"
//    login_host: "{{ DEV_DB_HOSTNAME }}"
//    db: postgres
//  vars:
//    ansible_python_interpreter: "{{ APP_PYTHON }}"
//- name: Create store database user
//  postgresql_user:
//    name: "{{ STORE_DB_USER }}"
//    password: "{{ STORE_DB_PASSWORD }}"
//    login_user: "{{ DEV_DB_BECOME_USER }}"
//    login_password: "{{ DEV_DB_BECOME_PASSWORD }}"
//    port: "{{ DEV_DB_PORT }}"
//    login_host: "{{ DEV_DB_HOSTNAME }}"
//    db: postgres
//  vars:
//    ansible_python_interpreter: "{{ APP_PYTHON }}"
//- name: Create dev database
//  community.postgresql.postgresql_db:
//    name: "{{ DEV_DB_DATABASE }}"
//    owner: "{{ DEV_DB_USER }}"
//    login_user: "{{ DEV_DB_BECOME_USER }}"
//    login_password: "{{ DEV_DB_BECOME_PASSWORD }}"
//    port: "{{ DEV_DB_PORT }}"
//    login_host: "{{ DEV_DB_HOSTNAME }}"
//    db: postgres
//  vars:
//    ansible_python_interpreter: "{{ APP_PYTHON }}"
//- name: Create store database
//  community.postgresql.postgresql_db:
//    name: "{{ STORE_DB_DATABASE }}"
//    owner: "{{ STORE_DB_USER }}"
//    login_user: "{{ DEV_DB_BECOME_USER }}"
//    login_password: "{{ DEV_DB_BECOME_PASSWORD }}"
//    port: "{{ DEV_DB_PORT }}"
//    login_host: "{{ DEV_DB_HOSTNAME }}"
//    db: postgres
//  vars:
//    ansible_python_interpreter: "{{ APP_PYTHON }}"
	}
}
