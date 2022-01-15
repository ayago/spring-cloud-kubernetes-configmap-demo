# Custom dependency spring kube config demo

The premise of this approach is to use a custom `spring-boot-cloud-kubernetes-configmap` 1.1.10.RELEASE
together with Spring Boot 2.4.3. This Spring dependency is not the recommended version for the intended
Spring Boot version. For the proper approach, check
[standard-dependency-spring-kube-config-demo](../standard-dependency-spring-kube-config-demo/).

## Running the code

Execute run script `sh run.sh`

## Implementation details - WIP

1. Create a maven based spring project with the following dependencies. 
   Note that we can't use the Spring initialzr since Spring Boot 2.4.3 is no longer supported by that utility.
   
* Spring boot parent version 2.4.3 to use the following dependencies
    * `spring-boot-starter-web` - To be used to host an embedded tomcat server and to implement a simple
      Web endpoint that will return the response based on effective PropertySource value
* `spring-cloud-starter-bootstrap` 3.0.2 - This contains the core spring cloud related libraries that is necessary
  to make `spring-boot-cloud-kubernetes-configmap` 1.1.10.RELEASE to work properly with Spring Boot 2.4.3. Without this
  dependency, Cloud related property source classes would not exist. Aside from giving the correct common cloud version, 
  this dependency is responsible for making the spring boot app initiate the resolution of PropertySource from cloud based
  locations such as Kubernetes.
* `spring-boot-cloud-kubernetes-configmap` 1.1.10.RELEASE - Our intended version of `spring-boot-cloud-kubernetes-configmap`
  to use. This dependency is responsible for handling the resolution of PropertySource from the ConfigMap that is part
  of our Spring based Kubernetes Workload (aka Kubernetes Application).
  
See [pom.xml](pom.xml) for the proper dependency setup for maven based configuration. Note that the order of the dependencies is 
important. For example, if `spring-boot-cloud-kubernetes-configmap` 1.1.10.RELEASE is placed before 
`spring-cloud-starter-bootstrap` 3.0.2, the effective spring boot cloud related dependency would be messed and our code
would encounter application startup errors due to NoClassDefFoundExceptions.
