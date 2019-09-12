# Kubernetes pods

## Set-up
The whole project can be built and deployed using docker-desktop and its kubernetes support.

To deploy each service you will have to publish the images first.

```
./gradlew publishDockerImage
```

Then deploy with Kubectl
```
kubectl apply -f deployment.yaml
```

Then deploy the configMap
```
kubectl apply -f config-map.yaml
```

Finally deploy the service
```
kubectl apply -f service.yaml
```

Services are meant to expose the micro-services inside the cluster, so in order to test endpoint just execute curl from
a given pod.

```
kubectl exec pod-name curl http://service-name/endpoint
```

Sample
```
kubectl exec pod-name curl http://people-service/people/3
```

Or expose deployment locally of the `people-service` with node port then use localhost:PORT
```
kubectl expose deployment people-deployment --type=NodePort --name=people-service
```

## Seeing your local kubernetes

Docker desktop does not include dashboard and needs to be installed.

* https://kubernetes.io/docs/tasks/access-application-cluster/web-ui-dashboard/

```
kubectl apply -f https://raw.githubusercontent.com/kubernetes/dashboard/v2.0.0-beta4/aio/deploy/recommended.yaml
```


Get local token for minikube on docker-desktop
```
kubectl -n kube-system describe secret $(kubectl -n kube-system get secret | grep kubernetes-dashboard-token | awk '{print $1}')
```

Open dashboard:
```
http://localhost:8001/api/v1/namespaces/kube-system/services/https:kubernetes-dashboard:/proxy/#!/login
```

Reload deployments with latest images (just for testing, use versions and rollout)
```
kubectl rollout restart deployment
```

## Verify your deployment

```
kubectl get pods -o wide
```

```
kubectl describe pod xxxx
```

```
kubectl describe services
```

## Creating config-maps

```
https://kubernetes.io/docs/tasks/configure-pod-container/configure-pod-configmap/
```
## Important links

* https://github.com/spring-cloud/spring-cloud-kubernetes#discoveryclient-for-kubernetes

* https://kubernetes.io/docs/reference/kubectl/cheatsheet/

* https://www.baeldung.com/spring-cloud-kubernetes

# Tasks

- [X] Create microservice `people` with springBoot

- [X] Create microservice `company` with springBoot
 
- [X] Create kubernetes deployment for `people` 

- [X] Create kubernetes deployment for `company` 

- [X] Build and publis docker images for `people` 

- [X] Build and publis docker images for `company` 

- [X] Handle versioning docker images for `people` 

- [X] Handle versioning  docker images for `company` 

- [X] Create kubernetes service for `people` 

- [X] Create kubernetes service for `company` 

- [X] Conditional dependencies in `gradle`

- [X] Create a `Eureka` discovery service

- [X] Run `FeignClient` with ribbon with calls A->B on `Eureka` 

- [X] Run `FeignClient` with ribbon with calls A->B on `Kubernetes` 

- [X] Run `config-server` and give parameters to microservices

- [X] Use kubernetes config-map to get those parameters

- [X] Liveness probe

- [X] Readiness probe

- [ ] Use kubernetes secrets

- [ ] Use kubernetes secrets with mount volumes

- [ ] Roll-out documentation
