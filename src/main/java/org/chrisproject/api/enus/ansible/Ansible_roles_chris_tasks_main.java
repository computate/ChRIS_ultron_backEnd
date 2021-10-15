package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris/tasks/main.yml
 * Map.hackathonLabel: create_main_chris_tasks
 * Map.hackathonMission: Ansible script
 * Map.hackathonTitle: define the main Ansible tasks to install ChRIS to podman locally. 
 * Map.hackathonColumn: Automate ChRIS install
 * Map.hackathonLabels: ansible,yml
 */
public class Ansible_roles_chris_tasks_main {

	/**
	 * DisplayName.enUS: create the code
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris/tasks/main.yml
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
//
//####################
//# Install ChRIS UI #
//####################
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
//
//################
//# Install PMAN #
//################
//
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
//
//#################
//# Install PFCON #
//#################
//
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
//
//##########################
//# Setup Data Directories #
//##########################
//
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
//
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
//
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
//
//- name: Create the {{ APP_NAME }} data directory {{ APP_QUEUE_DATA }}. 
//  file:
//    name: "{{ APP_QUEUE_DATA }}"
//    state: directory
//    owner: "{{ APP_USER }}"
//    mode: 0777
//  become: true
//- name: set SELinux permissions on {{ APP_QUEUE_DATA }}
//  sefcontext:
//    target: "{{ APP_QUEUE_DATA }}(/.*)?"
//    setype: container_file_t
//  become: true
//  vars:
//    ansible_python_interpreter: "{{ APP_PYTHON }}"
//- name: reload SELinux policy to ensure that {{ APP_NAME }} is executable
//  command: "restorecon -irv {{ APP_QUEUE_DATA }}"
//  become: true
//
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
//
//##########
//# Podman #
//##########
//
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
//
//###########################
//# Create Systemd Services #
//###########################
//
//- name: Create the {{ PMAN_NAME }} systemd service {{ PMAN_SYSTEMD }}. 
//  template:
//    src: chris_pman.service
//    dest: "{{ PMAN_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Create the {{ PFCON_NAME }} systemd service {{ PFCON_SYSTEMD }}. 
//  template:
//    src: chris_pfcon.service
//    dest: "{{ PFCON_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Create the {{ DEV_DB_NAME }} systemd service {{ DEV_DB_SYSTEMD }}. 
//  template:
//    src: chris_dev_db.service
//    dest: "{{ DEV_DB_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Create the {{ SWIFT_NAME }} systemd service {{ SWIFT_SYSTEMD }}. 
//  template:
//    src: chris_swift.service
//    dest: "{{ SWIFT_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Create the {{ QUEUE_NAME }} systemd service {{ QUEUE_SYSTEMD }}. 
//  template:
//    src: chris_queue.service
//    dest: "{{ QUEUE_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Create the {{ DEV_NAME }} systemd service {{ DEV_SYSTEMD }}. 
//  template:
//    src: chris_dev.service
//    dest: "{{ DEV_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Create the {{ STORE_NAME }} systemd service {{ STORE_SYSTEMD }}. 
//  template:
//    src: chris_store.service
//    dest: "{{ STORE_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Create the {{ SCHEDULER_NAME }} systemd service {{ SCHEDULER_SYSTEMD }}. 
//  template:
//    src: chris_scheduler.service
//    dest: "{{ SCHEDULER_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Create the {{ WORKER_PERIODIC_NAME }} systemd service {{ WORKER_PERIODIC_SYSTEMD }}. 
//  template:
//    src: chris_worker_periodic.service
//    dest: "{{ WORKER_PERIODIC_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Create the {{ WORKER_NAME }} systemd service {{ WORKER_SYSTEMD }}. 
//  template:
//    src: chris_worker.service
//    dest: "{{ WORKER_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Create the {{ UI_NAME }} systemd service {{ UI_SYSTEMD }}. 
//  template:
//    src: chris_ui.service
//    dest: "{{ UI_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Create the {{ PODMAN_TCP_NAME }} systemd service {{ PODMAN_TCP_SYSTEMD }}. 
//  template:
//    src: chris_podman_tcp.service
//    dest: "{{ PODMAN_TCP_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//
//- name: Reload the services. 
//  systemd:
//    daemon_reload: true
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//
//##########################
//# Start Systemd Services #
//##########################
//
//- name: Start and enable the podman.socket service. 
//  service:
//    name: "podman.socket"
//    enabled: true
//    state: started
//  become: true
//
//- name: Start and enable the {{ PMAN_SERVICE }} service. 
//  service:
//    name: "{{ PMAN_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//- name: Start and enable the {{ PFCON_SERVICE }} service. 
//  service:
//    name: "{{ PFCON_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ DEV_DB_SERVICE }} service. 
//  service:
//    name: "{{ DEV_DB_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: hold until Postgresql is up and running at {{ DEV_DB_HOSTNAME }}:{{DEV_DB_PORT }}
//  wait_for:
//    host: "{{ DEV_DB_HOSTNAME }}"
//    port: "{{ DEV_DB_PORT }}"
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
//- name: Start and enable the {{ SWIFT_SERVICE }} service. 
//  service:
//    name: "{{ SWIFT_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ QUEUE_SERVICE }} service. 
//  service:
//    name: "{{ QUEUE_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ DEV_SERVICE }} service.
//  service:
//    name: "{{ DEV_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ STORE_SERVICE }} service. 
//  service:
//    name: "{{ STORE_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ SCHEDULER_SERVICE }} service. 
//  service:
//    name: "{{ SCHEDULER_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ WORKER_PERIODIC_SERVICE }} service. 
//  service:
//    name: "{{ WORKER_PERIODIC_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ WORKER_SERVICE }} service. 
//  service:
//    name: "{{ WORKER_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ UI_SERVICE }} service. 
//  service:
//    name: "{{ UI_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ PODMAN_TCP_SERVICE }} service. 
//  service:
//    name: "{{ PODMAN_TCP_SERVICE }}"
//    enabled: false
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//
//- name: Create the {{ APP_NAME }} launchd service.
//  template:
//    src: solr_launchd_service.j2
//    dest: "~/Library/LaunchAgents/org.solr.plist"
//  when: ansible_pkg_mgr == 'homebrew'
//- name: Load the {{ APP_NAME }} launchd service.
//  shell: launchctl load ~/Library/LaunchAgents/org.solr.plist
//  when: ansible_pkg_mgr == 'homebrew'
//- name: Start the {{ APP_NAME }} launchd service.
//  shell: launchctl start org.solr
//  when: ansible_pkg_mgr == 'homebrew'
//  changed_when: false
	}
}