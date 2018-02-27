#!/bin/bash

kubectl delete -f deployment/liberty4all-deploy.yml -n default
kubectl delete -f deployment/liberty4all-svc.yml -n default
kubectl create -f deployment/liberty4all-deploy.yml -n default
kubectl create -f deployment/liberty4all-svc.yml -n default
