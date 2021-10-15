package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_plugins/tasks/main.yml
 * Map.hackathonLabel: create_plugins_tasks
 * Map.hackathonMission: Ansible script
 * Map.hackathonTitle: define the Ansible tasks to setup all the main ChRIS plugins. 
 * Map.hackathonColumn: Automate ChRIS install
 * Map.hackathonLabels: ansible,yml
 */
public class Ansible_roles_chris_plugins_tasks_main {

	/**
	 * DisplayName.enUS: create the code
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_plugins/tasks/main.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//- name: "Add the superuser to the ChRIS store container"
//  shell: /usr/bin/podman exec {{ STORE_NAME }} python manage.py createsuperuser --noinput --username '{{ APP_SUPER_USER_NAME }}' --email '{{ APP_SUPER_USER_EMAIL }}'
//  become: true
//  ignore_errors: true
//- name: "Set the superuser password to the ChRIS store container"
//  shell: /usr/bin/podman exec {{ STORE_NAME }} python manage.py shell -c "from django.contrib.auth.models import User; user=User.objects.get(username='{{ APP_SUPER_USER_NAME }}'); user.set_password('{{ APP_SUPER_USER_PASSWORD }}'); user.save(); "
//  become: true
//- name: "Install ChRIS plugins"
//  include_role:
//    name: chris_plugin
//  loop: "{{ APP_PLUGINS }}"
//  loop_control:
//    loop_var: APP_PLUGIN
	}
}
