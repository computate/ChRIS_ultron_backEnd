# Install the complete ChRIS system locally with Ansible and Podman

## Install the latest Python and setup a new Python virtualenv

```bash
sudo yum install -y git python3 python3-pip python3-virtualenv python3-libselinux python3-libsemanage python3-policycoreutils
virtualenv-3 ~/python
source ~/python/bin/activate
echo "source ~/python/bin/activate" | tee -a ~/.bashrc
```

## Install the latest Ansible

```bash
pip install setuptools_rust wheel
pip install --upgrade pip
pip install ansible selinux setools
```

## Clone the ChRIS_ultron_backEnd repository

### Create a directory for the ChRIS_ultron_backEnd repository

```bash
install -d /usr/local/src/ChRIS_ultron_backEnd
```

## Run the Ansible automation to install the ChRIS system

```bash
cd /usr/local/src/ChRIS_ultron_backEnd
ansible-playbook -K install.yml
```

# Troubleshooting

## Creating a PostgreSQL user with privileges for ChRIS in an existing local PostgreSQL instance

```bash
psql -h localhost -U $USER -W
create user chris password 'Chris1234';
alter user chris superuser;
alter user chris createdb;
```

