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
#                                 [-c <docker|podman>]
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
#   -c <docker|podman>
#
#       Explicitly set to user the docker or podman command. Default is docker. 
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

dc_check () {
    STATUS=$1
    if [[ $STATUS != "0" ]] ; then
        echo -en "\033[2A\033[2K"
        cat dc.out | sed -E 's/(.{80})/\1\n/g'                      | ./boxes.sh LightRed
    else
        echo -en "\033[2A\033[2K"
        cat dc.out                                                  | ./boxes.sh White
    fi
}

print_usage () {
    echo "Usage: ./unmake.sh [-h] [-c <docker|podman>] [-V <3.7|3.0>] [-O <swarm|kubernetes>] [-S <storeBase>]"
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

title -d 1 "Setting global exports"
    boxcenter "-= ORCHESTRATOR =-"
    boxcenter "$ORCHESTRATOR"                                                    LightCyan
    boxcenter ""
    if [ -z ${STOREBASE+x} ]; then
        STOREBASE=$(pwd)/CHRIS_REMOTE_FS
    fi
    boxcenter "-= STOREBASE =-"
    echo "$STOREBASE"                                               | ./boxes.sh LightCyan
    export STOREBASE=$STOREBASE

    if [[ $ORCHESTRATOR == kubernetes ]]; then
        echo -e "exporting REMOTENETWORK=false "                    | ./boxes.sh
        export REMOTENETWORK=false
    windowBottom
fi
windowBottom

title -d 1 "Destroying remote pfcon containerized environment on " \
                                "-= $ORCHESTRATOR =-"
    if [[ $ORCHESTRATOR == swarm ]]; then
<<<<<<< HEAD
        echo "$CONTAINER_COMMAND stack rm pfcon_stack"                               | ./boxes.sh ${LightCyan}
        $CONTAINER_COMMAND stack rm pfcon_stack
=======
        echo "$ docker stack rm pfcon_stack"                        | ./boxes.sh LightCyan
        windowBottom
        docker stack rm pfcon_stack &> dc.out
>>>>>>> 2a882167029a1fee13ed5e5e5e162ce2ae0add1a
    elif [[ $ORCHESTRATOR == kubernetes ]]; then
        echo "$ kubectl delete -f kubernetes/remote.yaml"           | ./boxes.sh LightCyan
        windowBottom
        kubectl delete -f kubernetes/remote.yaml &> dc.out
    fi
    dc_check $?
    echo "$ rm -fr \$STOREBASE"                                     | ./boxes.sh LightCyan
    rm -fr $STOREBASE
windowBottom

<<<<<<< HEAD
title -d 1 "Destroying CUBE containerized development environment" "from  ./docker-compose_dev_v${SWARM_VERSION}.yml"
    echo "Do you want to also remove persistent volumes? [y/n]"             | ./boxes.sh
=======
title -d 1 "Destroying CUBE containerized development environment" \
                        "from  ./docker-compose_dev.yml"
    echo "Do you want to also remove persistent volumes? [y/n]"     | ./boxes.sh White
>>>>>>> 2a882167029a1fee13ed5e5e5e162ce2ae0add1a
    windowBottom
    old_stty_cfg=$(stty -g)
    stty raw -echo ; REPLY=$(head -c 1) ; stty $old_stty_cfg
    echo -en "\033[2A\033[2K"
    # read -p  " " -n 1 -r REPLY
    if [[ $REPLY =~ ^[Yy]$ ]] ; then
        boxcenter ""
        echo "Removing persistent volumes... please be patient."    | ./boxes.sh Yellow
        boxcenter ""
        echo "$ docker-compose -f docker-compose_dev.yml down -v"   | ./boxes.sh LightCyan         
        windowBottom
<<<<<<< HEAD
        docker-compose -f docker-compose_dev_v${SWARM_VERSION}.yml down -v >& dc.out >/dev/null
        echo -en "\033[2A\033[2K"
        cat dc.out | ./boxes.sh
=======
        docker-compose -f docker-compose_dev.yml down -v >& dc.out
        dc_check $?
>>>>>>> 2a882167029a1fee13ed5e5e5e162ce2ae0add1a
    else
        echo "Keeping persistent volumes... please be patient."     | ./boxes.sh Yellow
        windowBottom
<<<<<<< HEAD
        docker-compose -f docker-compose_dev_v${SWARM_VERSION}.yml down >& dc.out >/dev/null
        echo -en "\033[2A\033[2K"
        cat dc.out | ./boxes.sh
=======
        docker-compose -f docker-compose_dev.yml down >& dc.out
        dc_check $?
>>>>>>> 2a882167029a1fee13ed5e5e5e162ce2ae0add1a
    fi
windowBottom

if [[ $ORCHESTRATOR == swarm ]]; then
    title -d 1 "Removing overlay network: remote"
    windowBottom
    sleep 2
<<<<<<< HEAD
    $CONTAINER_COMMAND network rm remote
=======
    docker network rm remote &> dc.out
    dc_check $?
>>>>>>> 2a882167029a1fee13ed5e5e5e162ce2ae0add1a
    windowBottom
fi
