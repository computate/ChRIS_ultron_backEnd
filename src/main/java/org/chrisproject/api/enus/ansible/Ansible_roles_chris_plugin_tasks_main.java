package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_plugin/tasks/main.yml
 * Map.hackathonLabel: create_plugin_tasks
 * Map.hackathonMission: define the Ansible tasks to setup ChRIS plugins
 * Map.hackathonTitle: define the Ansible tasks to setup ChRIS plugins
 * Map.hackathonColumn: Automate plugins
 * Map.hackathonLabels: ansible,yml
 */
public class Ansible_roles_chris_plugin_tasks_main {

	/**
	 * DisplayName.enUS: create the code
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_plugin/tasks/main.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//- name: Pull the plugin image {{ APP_PLUGIN.CONTAINER_REPO }}/{{ APP_PLUGIN.CONTAINER_IMAGE }}
//  containers.podman.podman_image:
//    name: "{{ APP_PLUGIN.CONTAINER_REPO }}/{{ APP_PLUGIN.CONTAINER_IMAGE }}"
//    state: present
//  become: true
//- name: Gather facts on a specific container {{ APP_PLUGIN.CONTAINER_REPO }}/{{ APP_PLUGIN.CONTAINER_IMAGE }}
//  containers.podman.podman_image_info:
//    name: "{{ APP_PLUGIN.CONTAINER_REPO }}/{{ APP_PLUGIN.CONTAINER_IMAGE }}"
//  register: CONTAINER_IMAGE_INFO
//  become: true
//- name: "Obtain the PLUGIN_REP for the ChRIS plugin: sudo podman run --rm {{ APP_PLUGIN.CONTAINER_REPO }}/{{ APP_PLUGIN.CONTAINER_IMAGE }} {{ CONTAINER_IMAGE_INFO.images[0].Config.Cmd[0] }} --json"
//  shell: "/usr/bin/podman run --rm {{ APP_PLUGIN.CONTAINER_REPO }}/{{ APP_PLUGIN.CONTAINER_IMAGE }} {{ CONTAINER_IMAGE_INFO.images[0].Config.Cmd[0] }} --json"
//  register: PLUGIN_REP_INFO
//  become: true
//- name: "Add the plugin to the ChRIS store {{ APP_PLUGIN.CONTAINER_REPO }}/{{ APP_PLUGIN.CONTAINER_IMAGE }}"
//  shell: /usr/bin/podman exec {{ STORE_NAME }} python plugins/services/manager.py add "{{ APP_PLUGIN.CONTAINER_IMAGE }}" "{{ APP_SUPER_USER_NAME }}" https://github.com/FNNDSC "{{ APP_PLUGIN.CONTAINER_REPO }}/{{ APP_PLUGIN.CONTAINER_IMAGE }}" --descriptorstring '{{ PLUGIN_REP_INFO.stdout | to_json | from_json }}'
//  register: PLUGIN_REP_INFO
//  become: true
//  ignore_errors: true
//- name: "Add the ENV to ChRIS dev {{ APP_PLUGIN.CONTAINER_REPO }}/{{ APP_PLUGIN.CONTAINER_IMAGE }}^{{ APP_PLUGIN.CONTAINER_ENVIRONMENT | default('host') }}"
//  shell: /usr/bin/podman exec {{ DEV_NAME }} python plugins/services/manager.py add "{{ APP_PLUGIN.CONTAINER_ENVIRONMENT | default('host') }}" "http://{{ PFCON_HOSTNAME }}:{{ PFCON_PORT }}/api/v1/" --description "{{ APP_PLUGIN.CONTAINER_ENVIRONMENT | default('host') }} Description"
//  register: PLUGIN_ADD_ENV_INFO
//  become: true
//  ignore_errors: true
//- name: "Register the ENV to ChRIS dev {{ APP_PLUGIN.CONTAINER_REPO }}/{{ APP_PLUGIN.CONTAINER_IMAGE }}^{{ APP_PLUGIN.CONTAINER_ENVIRONMENT | default('host') }}"
//  shell: /usr/bin/podman exec {{ DEV_NAME }} python plugins/services/manager.py register "{{ APP_PLUGIN.CONTAINER_ENVIRONMENT | default('host') }}" --pluginname "{{ APP_PLUGIN.CONTAINER_IMAGE }}"
//  register: PLUGIN_ADD_ENV_INFO
//  become: true
//  ignore_errors: true
	}
}
