# Liberty 4 All App

This a simple liberty app to be used with IBM Cloud Private demos.

This app doesn't do much but display a home page and a message that it gets dynamically from a servlet.  The intent of this app is to demonstrate the devops process, including Maven and Jenkins build, and a Jenkins deploy to IBM Cloud Private.

## Configuration

### Parameters

This Helm chart has only a few values that can be overriden using the --set parameter.  The replica count, external port are the only interesting values that might be overriden.

` helm install --name my-liberty --set replicaCount=3  --set externalPort=9080 `


