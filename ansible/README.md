# Install the complete ChRIS system locally with Ansible and Podman

## Install dependencies on Linux

```bash
sudo yum install -y git python3 python3-pip python3-virtualenv python3-libselinux python3-libsemanage python3-policycoreutils
```

## Install dependencies on MacOSX

For MacOS, install gnu-tar and add it to the system PATH  
https://stackoverflow.com/questions/54528115/unable-to-extract-tar-file-though-ansible-unarchive-module-in-macos

```bash
brew install git python maven gnu-tar
```

## Install the latest Python and setup a new Python virtualenv

```bash
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

### Create a directory for the ChRIS_ultron_backEnd repository and clone it

```bash
install -d -o $USER -g $USER /usr/local/src/ChRIS_ultron_backEnd
git clone git@github.com:team19hackathon2021/ChRIS_ultron_backEnd.git /usr/local/src/ChRIS_ultron_backEnd
```

## Run the Ansible automation to install the ChRIS system

```bash
cd /usr/local/src/ChRIS_ultron_backEnd
ansible-playbook -K install_all.yml
```

# Troubleshooting

## Creating a PostgreSQL user with privileges for ChRIS in an existing local PostgreSQL instance

```bash
psql -h localhost -U $USER -W
create user chris password 'Chris1234';
alter user chris superuser;
alter user chris createdb;
```

