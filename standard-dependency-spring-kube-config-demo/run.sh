### set docker env
eval $(minikube docker-env)

### client-service
kubectl apply -f ./templates/configmap.yaml
kubectl apply -f ./templates/service-account.yaml

### build the repository
./mvnw clean install -DskipTests

### build the docker images on minikube
docker build -t standard-dependency-spring-kube-config-demo .

### client-service
kubectl delete -f ./templates/deployment.yaml
kubectl create -f ./templates/deployment.yaml

# Check that the pods are running
kubectl get pods