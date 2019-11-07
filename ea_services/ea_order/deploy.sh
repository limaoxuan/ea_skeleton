#!/usr/bin/env bash
kubectl delete -n default deployment ea-order-deployment
kubectl delete -n default service ea-order-service
kubectl apply -f deploy.yml