#!/usr/bin/env bash
kubectl delete -n default deployment ea-hellosb-deployment
kubectl delete -n default service ea-hellosb-service
kubectl apply -f deploy.yml