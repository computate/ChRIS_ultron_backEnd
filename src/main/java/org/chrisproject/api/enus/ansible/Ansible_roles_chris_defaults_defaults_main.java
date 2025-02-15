package org.chrisproject.api.enus.ansible;

/**
 * ContentType: text/plain
 * DisplayName.enUS: ChRIS_ultron_backEnd/ansible/roles/chris_defaults/defaults/main.yml
 * Map.hackathonLabel: create_defaults
 * Map.hackathonMission: define the default Ansible variables to use
 * Map.hackathonTitle: define the default Ansible variables to use
 * Map.hackathonColumn: Automate ChRIS install
 * Map.hackathonLabels: ansible,yml
 * enUS: Define the main application variables. 
 * enUS: Define the pman application variables. 
 * enUS: Define the pfcon application variables. 
 * enUS: Define the dev application variables. 
 * enUS: Define the dev database application variables. 
 * enUS: Define the store database application variables. 
 * enUS: Define the swift storage application variables. 
 * enUS: Define the RabbitMQ queue application variables. 
 * enUS: Define the ChRIS store application variables. 
 * enUS: Define the scheduler application variables. 
 * enUS: Define the worker periodic application variables. 
 * enUS: Define the worker application variables. 
 * enUS: Define the ChRIS UI application variables. 
 * enUS: Define the Podman TCP related application variables. 
 * enUS: Define other Ansible related application variables. 
 */
public class Ansible_roles_chris_defaults_defaults_main {

	/**
	 * DisplayName.enUS: Define the main application variables. 
	 * enUS: Create a new file: /usr/local/src/ChRIS_ultron_backEnd/ansible/roles/chris_defaults/defaults/main.yml
	 * enUS: 
	 * enUS: 
	 */
	public void part1() {
//---
//# Define the main application variables. 
//APP_NAME: ChRIS
//APP_POD: "{{ APP_NAME }}_pod"
//APP_NETWORK: "ChRIS"
//APP_PYTHON: "{{ '/usr/bin/python' if lookup('file', '/usr/bin/python', errors='ignore') else '/usr/bin/python3' }}"
//APP_SRC: "/usr/local/src/ChRIS_ultron_backEnd"
//APP_OPT: "/opt/{{ APP_NAME }}"
//APP_VAR: "/var/{{ APP_NAME }}"
//APP_DATA: "{{ APP_VAR }}/data"
//APP_DEV_DB_DATA: "{{ APP_SRC }}/chris_dev_db_data"
//APP_STORE_DB_DATA: "{{ APP_SRC }}/chris_store_db_data"
//APP_SWIFT_DATA: "{{ APP_SRC }}/swift_storage_dev"
//APP_QUEUE_DATA: "{{ APP_SRC }}/queue_data"
//APP_BACKEND_DATA: "{{ APP_SRC }}/chris_backend"
//APP_CONF: "{{ APP_OPT }}/conf/zoo.cfg"
//APP_REPO: "https://github.com/FNNDSC/ChRIS_ultron_backEnd.git"
//APP_VERSION: 
//APP_TAG: ""
//APP_USER: "root"
//APP_SECRET_KEY: "w1kxu^l=@pnsf!5piqz6!!5kdcdpo79y6jebbp+2244yjm*#+k"
//APP_SUPER_USER_NAME: rudolph
//APP_SUPER_USER_PASSWORD: rudolph1234
//APP_SUPER_USER_EMAIL: rudolph.pienaar@gmail.com
	}

	/**
	 * DisplayName.enUS: Define the pman application variables. 
	 * enUS: 
	 */
	public void part2() {
//
//# Define the pman application variables. 
//PMAN_NAME: "{{ APP_NAME }}_pman"
//PMAN_POD: "{{ APP_NAME }}_pod"
//PMAN_HOSTNAME: "localhost"
//PMAN_IMAGE: "docker.io/computate/pman"
//PMAN_VERSION: "latest"
//PMAN_SERVICE: "{{ PMAN_NAME }}"
//PMAN_SYSTEMD: "/usr/lib/systemd/system/{{ PMAN_SERVICE }}.service"
//PMAN_SRC: "/usr/local/src/pman"
//PMAN_REPO: "git@github.com:FNNDSC/pman.git"
//PMAN_PORT: "5010"
	}

	/**
	 * DisplayName.enUS: Define the pfcon application variables. 
	 * enUS: 
	 */
	public void part3() {
//
//# Define the pfcon application variables. 
//PFCON_NAME: "{{ APP_NAME }}_pfcon"
//PFCON_POD: "{{ APP_NAME }}_pod"
//PFCON_HOSTNAME: "localhost"
//PFCON_IMAGE: "fnndsc/pfcon"
//PFCON_VERSION: "latest"
//PFCON_SERVICE: "{{ PFCON_NAME }}"
//PFCON_SYSTEMD: "/usr/lib/systemd/system/{{ PFCON_SERVICE }}.service"
//PFCON_SRC: "/usr/local/src/pfcon"
//PFCON_REPO: "git@github.com:FNNDSC/pfcon.git"
//PFCON_PORT: "30005"
	}

	/**
	 * DisplayName.enUS: Define the dev application variables. 
	 * enUS: 
	 */
	public void part4() {
//
//# Define the dev application variables. 
//DEV_NAME: "{{ APP_NAME }}_dev"
//DEV_POD: "{{ APP_NAME }}_pod"
//DEV_HOSTNAME: "localhost"
//DEV_IMAGE: "fnndsc/chris"
//DEV_VERSION: "dev"
//DEV_SERVICE: "{{ DEV_NAME }}"
//DEV_SYSTEMD: "/usr/lib/systemd/system/{{ DEV_SERVICE }}.service"
//DEV_PORT: "8000"
	}

	/**
	 * DisplayName.enUS: Define the dev database application variables. 
	 * enUS: 
	 */
	public void part5() {
//
//# Define the dev database application variables. 
//DEV_DB_NAME: "{{ APP_NAME }}_dev_db"
//DEV_DB_POD: "{{ APP_NAME }}_pod"
//DEV_DB_HOSTNAME: "localhost"
//DEV_DB_IMAGE: "postgres"
//DEV_DB_VERSION: "13"
//DEV_DB_SERVICE: "{{ DEV_DB_NAME }}"
//DEV_DB_SYSTEMD: "/usr/lib/systemd/system/{{ DEV_DB_SERVICE }}.service"
//DEV_DB_PORT: "5432"
//DEV_DB_DATABASE: "chris_dev"
//DEV_DB_USER: "chris"
//DEV_DB_PASSWORD: "Chris1234"
//DEV_DB_BECOME_USER: "{{ DEV_DB_USER }}"
//DEV_DB_BECOME_PASSWORD: "{{ DEV_DB_PASSWORD }}"
	}

	/**
	 * DisplayName.enUS: Define the store database application variables. 
	 * enUS: 
	 */
	public void part6() {
//
//# Define the store database application variables. 
//STORE_DB_DATABASE: "chris_store"
//STORE_DB_USER: "chris"
//STORE_DB_PASSWORD: "Chris1234"
	}

	/**
	 * DisplayName.enUS: Define the swift storage application variables. 
	 * enUS: 
	 */
	public void part7() {
//
//# Define the swift storage application variables. 
//SWIFT_NAME: "{{ APP_NAME }}_swift"
//SWIFT_POD: "{{ APP_NAME }}_pod"
//SWIFT_HOSTNAME: "localhost"
//SWIFT_IMAGE: "fnndsc/docker-swift-onlyone"
//SWIFT_VERSION: "latest"
//SWIFT_SERVICE: "{{ SWIFT_NAME }}"
//SWIFT_SYSTEMD: "/usr/lib/systemd/system/{{ SWIFT_SERVICE }}.service"
//SWIFT_USERNAME: "chris:chris1234"
//SWIFT_KEY: "testing"
//SWIFT_PORT: "8080"
	}

	/**
	 * DisplayName.enUS: Define the RabbitMQ queue application variables. 
	 * enUS: 
	 */
	public void part8() {
//
//# Define the RabbitMQ queue application variables. 
//QUEUE_NAME: "{{ APP_NAME }}_queue"
//QUEUE_POD: "{{ APP_NAME }}_pod"
//QUEUE_HOSTNAME: "localhost"
//QUEUE_IMAGE: "rabbitmq"
//QUEUE_VERSION: "3"
//QUEUE_SERVICE: "{{ QUEUE_NAME }}"
//QUEUE_SYSTEMD: "/usr/lib/systemd/system/{{ QUEUE_SERVICE }}.service"
	}

	/**
	 * DisplayName.enUS: Define the ChRIS store application variables. 
	 * enUS: 
	 */
	public void part9() {
//
//# Define the ChRIS store application variables. 
//STORE_NAME: "{{ APP_NAME }}_store"
//STORE_POD: "{{ APP_NAME }}_pod"
//STORE_HOSTNAME: "localhost"
//STORE_IMAGE: "fnndsc/chris_store"
//STORE_VERSION: "latest"
//STORE_SERVICE: "{{ STORE_NAME }}"
//STORE_SYSTEMD: "/usr/lib/systemd/system/{{ STORE_SERVICE }}.service"
//STORE_PORT: "8010"
	}

	/**
	 * DisplayName.enUS: Define the scheduler application variables. 
	 * enUS: 
	 */
	public void part10() {
//
//# Define the scheduler application variables. 
//SCHEDULER_NAME: "{{ APP_NAME }}_scheduler"
//SCHEDULER_POD: "{{ APP_NAME }}_pod"
//SCHEDULER_HOSTNAME: "localhost"
//SCHEDULER_IMAGE: "fnndsc/chris"
//SCHEDULER_VERSION: "dev"
//SCHEDULER_SERVICE: "{{ SCHEDULER_NAME }}"
//SCHEDULER_SYSTEMD: "/usr/lib/systemd/system/{{ SCHEDULER_SERVICE }}.service"
	}

	/**
	 * DisplayName.enUS: Define the worker periodic application variables. 
	 * enUS: 
	 */
	public void part11() {
//
//# Define the worker periodic application variables. 
//WORKER_PERIODIC_NAME: "{{ APP_NAME }}_worker_periodic"
//WORKER_PERIODIC_POD: "{{ APP_NAME }}_pod"
//WORKER_PERIODIC_HOSTNAME: "localhost"
//WORKER_PERIODIC_IMAGE: "fnndsc/chris"
//WORKER_PERIODIC_VERSION: "dev"
//WORKER_PERIODIC_SERVICE: "{{ WORKER_PERIODIC_NAME }}"
//WORKER_PERIODIC_SYSTEMD: "/usr/lib/systemd/system/{{ WORKER_PERIODIC_SERVICE }}.service"
	}

	/**
	 * DisplayName.enUS: Define the worker application variables. 
	 * enUS: 
	 */
	public void part12() {
//
//# Define the worker application variables. 
//WORKER_NAME: "{{ APP_NAME }}_worker"
//WORKER_POD: "{{ APP_NAME }}_pod"
//WORKER_HOSTNAME: "localhost"
//WORKER_IMAGE: "fnndsc/chris"
//WORKER_VERSION: "dev"
//WORKER_SERVICE: "{{ WORKER_NAME }}"
//WORKER_SYSTEMD: "/usr/lib/systemd/system/{{ WORKER_SERVICE }}.service"
	}

	/**
	 * DisplayName.enUS: Define the ChRIS UI application variables. 
	 * enUS: 
	 */
	public void part13() {
//
//# Define the ChRIS UI application variables. 
//UI_NAME: "ChRIS_ui"
//UI_REPO: "git@github.com:FNNDSC/ChRIS_ui.git"
//UI_SRC: "/usr/local/src/{{ UI_NAME }}"
//UI_POD: "{{ APP_NAME }}_pod"
//UI_HOSTNAME: "localhost"
//UI_IMAGE: "fnndsc/chris_ui"
//UI_VERSION: "dev"
//UI_SERVICE: "{{ UI_NAME }}"
//UI_SYSTEMD: "/usr/lib/systemd/system/{{ UI_SERVICE }}.service"
//UI_PORT: "3000"
//UI_DATA: "{{ UI_SRC }}"
	}

	/**
	 * DisplayName.enUS: Define the Podman TCP related application variables. 
	 * enUS: 
	 */
	public void part14() {
//
//# Define the Podman TCP related application variables. 
//##############
//# Podman TCP #
//##############
//
//PODMAN_TCP_NAME: "podman_tcp"
//PODMAN_TCP_SERVICE: "{{ PODMAN_TCP_NAME }}"
//PODMAN_TCP_SYSTEMD: "/usr/lib/systemd/system/{{ PODMAN_TCP_SERVICE }}.service"
//PODMAN_IP_ADDRESS: "{{ lookup('env', 'HOSTNAME') }}"
//PODMAN_TCP_PORT: 5000
	}

	/**
	 * DisplayName.enUS: Define other Ansible related application variables. 
	 * enUS: 
	 */
	public void part15() {
//
//
//# Define other Ansible related application variables. 
//####################
//# Ansible defaults #
//####################
//
//# Add to an ansible-vault the username of your user on your computer (echo $HOSTNAME). 
//USER_NAME: "{{ lookup('env', 'USER') }}"
	}
}
