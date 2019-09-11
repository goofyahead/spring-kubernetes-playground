# Kubernetes pods

## Set-up
First configure your cluster with aws:

```
aws eks update-kubeconfig
```

Expose deployment locally
```
kubectl expose deployment people-deployment --type=NodePort --name=people-service
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
## CheatSheet

https://kubernetes.io/docs/reference/kubectl/cheatsheet/

# Tasks

-[X] Create microservice `people` with springBoot
-[X] Create microservice `company` with springBoot
-[X] Create kubernetes deployment for `people` 
-[X] Create kubernetes deployment for `company` 
-[X] Build and publis docker images for `people` 
-[X] Build and publis docker images for `company` 
-[X] Handle versioning docker images for `people` 
-[X] Handle versioning  docker images for `company` 
-[X] Create kubernetes service for `people` 
-[X] Create kubernetes service for `company` 
-[X] Conditional dependencies in `gradle`
-[X] Create a `Eureka` discovery service
-[X] Run `FeignClient` with ribbon with calls A->B on `Eureka` 
-[X] Run `FeignClient` with ribbon with calls A->B on `Kubernetes` 
-[ ] Run `config-server` and give parameters to microservices
-[ ] Use kubernetes config-map to get those parameters
-[ ] Use kubernetes secret
-[ ] Use kubernetes secret with mount volume
-[ ] Liveness probe
-[ ] Readiness probe
-[ ] Roll-out documentation