#!/usr/bin/env bash
DIR="$(PWD)"
echo "${DIR}"
cd ${DIR}/ea_env/
sh init_k8s.sh

cd ${DIR}/ea_services/ea_gateway
sh deploy.sh

cd ${DIR}/ea_services/ea_hellosb
sh deploy.sh

cd ${DIR}/ea_client_service/
sh deploy.sh