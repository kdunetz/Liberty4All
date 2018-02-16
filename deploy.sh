#!/bin/bash

kubectl delete -f liberty4all-deploy.yml
kubectl delete -f liberty4all-svc.yml
kubectl create -f liberty4all-deploy.yml
kubectl create -f liberty4all-svc.yml
