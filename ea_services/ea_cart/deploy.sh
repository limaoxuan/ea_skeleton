#!/usr/bin/env bash
kubectl delete -n default deployment ea-cart-deployment
kubectl delete -n default service ea-cart-service
kubectl apply -f deploy.yml