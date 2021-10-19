package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_queue/tasks/main.yml
 * Map.hackathonLabel: create_queue_tasks
 * Map.hackathonMission: define the Ansible tasks to install the queue application as a container in podman
 * Map.hackathonTitle: Create the file ChRIS_ultron_backEnd/ansible/roles/chris_queue/tasks/main.yml
 * Map.hackathonColumn: Automate queue
 * Map.hackathonLabels: ansible,yml
 * enUS: Setup the RabbitMQ data directory. 
 * enUS: Automate the deployment of RabbitMQ as a Podman container running as a Systemd service. 
 */
public class Ansible_roles_chris_queue_tasks_main {

	/**
	 * DisplayName.enUS: Setup the RabbitMQ data directory. 
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_queue/tasks/main.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//# Setup the RabbitMQ data directory. 
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
	}

	/**
	 * DisplayName.enUS: Automate the deployment of RabbitMQ as a Podman container running as a Systemd service. 
	 * enUS: 
	 */
	public void part2() {
//
//# Automate the deployment of RabbitMQ as a Podman container running as a Systemd service. 
//- name: Create the {{ QUEUE_NAME }} systemd service {{ QUEUE_SYSTEMD }}. 
//  template:
//    src: chris_queue.service
//    dest: "{{ QUEUE_SYSTEMD }}"
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Reload the services. 
//  systemd:
//    daemon_reload: true
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
//- name: Start and enable the {{ QUEUE_SERVICE }} service. 
//  service:
//    name: "{{ QUEUE_SERVICE }}"
//    enabled: true
//    state: restarted
//  become: true
//  when: ansible_pkg_mgr != 'homebrew'
	}
}
