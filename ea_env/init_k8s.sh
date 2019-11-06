#!/usr/bin/env bash
kubectl delete -n default deployment ea-mysql-deployment
kubectl delete -n default service ea-mysql-service
kubectl apply -f mysql_service.yml

kubectl delete -n default deployment ea-redis-deployment
kubectl delete -n default service ea-redis-service
kubectl apply -f redis_service.yml