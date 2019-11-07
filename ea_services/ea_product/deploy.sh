#!/usr/bin/env bash
kubectl delete -n default deployment ea-product-deployment
kubectl delete -n default service ea-product-service
kubectl apply -f deploy.yml