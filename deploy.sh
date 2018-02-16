#!/bin/bash

kubectl delete -f liberty4all-deploy.yml -n default
kubectl delete -f liberty4all-svc.yml -n default
kubectl create -f liberty4all-deploy.yml -n default
kubectl create -f liberty4all-svc.yml -n default
