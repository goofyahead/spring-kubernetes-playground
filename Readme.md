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

Reload deployments with latest images
```
kubectl rollout restart deployment
```

