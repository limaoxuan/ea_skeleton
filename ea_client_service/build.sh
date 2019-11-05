#!/usr/bin/env bash
kubectl delete -n default deployment ea-client-deployment
kubectl delete -n default service ea-client-service
kubectl apply -f ea_client_service.yml
OUTPUT="$(kubectl describe node minikube|grep InternalIP)"
stringarray=($OUTPUT)
echo "${stringarray[1]}"
open http://${stringarray[1]}:30001/login.html #if fail, refresh the page again