#!/bin/bash
#
# NAME
#
#   unmake.sh
#
# SYNPOSIS
#
#   unmake.sh                     [-h]
#                                 [-O <swarm|kubernetes>]
#                                 [-V <3.7|3.0>]
#                                 [-S <storeBase>]
#
#
# DESC
#
#   'unmake.sh' destroys a chris development instance with remote ancillary services
#   pfcon/pman running on Swarm or Kubernetes.
#
# TYPICAL CASES:
#
#   Destroy chris_dev instance with remote ancillary services running on Swarm:
#
#       unmake.sh
#
#   Destroy chris_dev instance with remote ancillary services running on Kubernetes:
#
#       unmake.sh -O kubernetes
#
# ARGS
#
#
#   -h
#
#       Optional print usage help.
#
#   -V <3.7|3.0>
#
#       Explicitly set docker-swarm version other than 3.7 (see https://docs.docker.com/compose/compose-file/compose-versioning/#version-37).
#
#   -O <swarm|kubernetes>
#
#       Explicitly set the orchestrator. Default is swarm.
#
#   -S <storeBase>
#
#       Explicitly set the STOREBASE dir to <storeBase>. This is the remote ChRIS
#       filesystem where pfcon and plugins share data.
#
#

source ./decorate.sh

declare -i STEP=0
ORCHESTRATOR=swarm
CONTAINER_COMMAND=docker
SWARM_VERSION=3.7

print_usage () {
    echo "Usage: ./unmake.sh [-h] [-V <3.7|3.0>] [-O <swarm|kubernetes>] [-S <storeBase>]"
    exit 1
}

while getopts ":hO:c:S:V:" opt; do
    case $opt in
        h) print_usage
           ;;
        O) ORCHESTRATOR=$OPTARG
           if ! [[ "$ORCHESTRATOR" =~ ^(swarm|kubernetes)$ ]]; then
              echo "Invalid value for option -- O"
              print_usage
           fi
           ;;
        c) CONTAINER_COMMAND=$OPTARG
           if ! [[ "$CONTAINER_COMMAND" =~ ^(docker|podman)$ ]]; then
              echo "Invalid value for option -- c"
              print_usage
           fi
           ;;
        S) STOREBASE=$OPTARG
           ;;
        V) SWARM_VERSION=$OPTARG
           ;;
        \?) echo "Invalid option -- $OPTARG"
            print_usage
            ;;
        :) echo "Option requires an argument -- $OPTARG"
           print_usage
           ;;
    esac
done
shift $(($OPTIND - 1))

title -d 1 "Setting global exports..."
    echo -e "ORCHESTRATOR=$ORCHESTRATOR"              | ./boxes.sh
    if [ -z ${STOREBASE+x} ]; then
        STOREBASE=$(pwd)/CHRIS_REMOTE_FS
    fi
    echo -e "exporting STOREBASE=$STOREBASE "         | ./boxes.sh
    export STOREBASE=$STOREBASE

    if [[ $ORCHESTRATOR == kubernetes ]]; then
        echo -e "exporting REMOTENETWORK=false "      | ./boxes.sh
        export REMOTENETWORK=false
    windowBottom
fi
windowBottom

title -d 1 "Destroying remote pfcon containerized environment on $ORCHESTRATOR"
    if [[ $ORCHESTRATOR == swarm ]]; then
        echo "$CONTAINER_COMMAND stack rm pfcon_stack"                               | ./boxes.sh ${LightCyan}
        $CONTAINER_COMMAND stack rm pfcon_stack
    elif [[ $ORCHESTRATOR == kubernetes ]]; then
        echo "kubectl delete -f kubernetes/remote.yaml"                  | ./boxes.sh ${LightCyan}
        kubectl delete -f kubernetes/remote.yaml
    fi
    echo "Removing STOREBASE tree $STOREBASE"                                | ./boxes.sh
    rm -fr $STOREBASE
windowBottom

title -d 1 "Destroying CUBE containerized development environment" "from  ./docker-compose_dev_v${SWARM_VERSION}.yml"
    echo "Do you want to also remove persistent volumes? [y/n]"             | ./boxes.sh
    windowBottom
    old_stty_cfg=$(stty -g)
    stty raw -echo ; REPLY=$(head -c 1) ; stty $old_stty_cfg
    echo -en "\033[2A\033[2K"
    # read -p  " " -n 1 -r REPLY
    if [[ $REPLY =~ ^[Yy]$ ]] ; then
        printf "Removing persistent volumes...\n"                           | ./boxes.sh ${Yellow}
        echo "This might take a few minutes... please be patient."          | ./boxes.sh ${Yellow}
        windowBottom
        docker-compose -f docker-compose_dev_v${SWARM_VERSION}.yml down -v >& dc.out >/dev/null
        echo -en "\033[2A\033[2K"
        cat dc.out | ./boxes.sh
    else
        printf "Keeping persistent volumes...\n"                            | ./boxes.sh ${Yellow}
        echo "This might take a few minutes... please be patient."          | ./boxes.sh ${Yellow}
        windowBottom
        docker-compose -f docker-compose_dev_v${SWARM_VERSION}.yml down >& dc.out >/dev/null
        echo -en "\033[2A\033[2K"
        cat dc.out | ./boxes.sh
    fi
windowBottom

if [[ $ORCHESTRATOR == swarm ]]; then
    title -d 1 "Removing overlay network: remote"
    sleep 2
    $CONTAINER_COMMAND network rm remote
    windowBottom
fi
