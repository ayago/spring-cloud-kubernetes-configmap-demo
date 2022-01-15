# Spring Boot Cloud Kubernetes ConfigMap as Property Source Demo

Two different approaches on how to set up a Spring Boot app to retrieve the application
properties from Kubernetes Config Map. Both are configured to retrieve the config map via
Kubernetes Core GET configmaps API instead of mounting it as a volume. In addition, both 
these approaches are using Spring boot version 2.4.3.

## Approaches

Module Name|Description|
-----------|-----------|
[custom-dependency-spring-kube-config-demo](custom-dependency-spring-kube-config-demo/)|Built using manual selection of Spring Cloud Kubernetes ConfigMap related dependencies that are compatible with Spring Boot 2.4.3|
[standard-dependency-spring-kube-config-demo](standard-dependency-spring-kube-config-demo/)|Built using preferred dependency matrix for Spring Boot 2.4.3 to setup Spring Cloud Kubernetes ConfigMap related dependencies|


## Deployment Prerequisites

To test each of these approaches, the machine were these are intended to be deployed should have the following:

1. Docker is installed (v20.10.8)
2. There should be a running Kubernetes (this is tested with v1.20.10) cluster where this will be executed.
3. Kubectl is installed
   
## Source code compatibility
JDK 8