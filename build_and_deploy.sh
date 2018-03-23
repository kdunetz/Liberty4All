#!/bin/bash

mvn package

docker build -t kdunetz/liberty4all .
docker push kdunetz/liberty4all

kubectl delete -f deployment/liberty4all-deploy.yml -n default
kubectl delete -f deployment/liberty4all-svc.yml -n default
kubectl create -f deployment/liberty4all-deploy.yml -n default
kubectl create -f deployment/liberty4all-svc.yml -n default
