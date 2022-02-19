# Ping-Pong Applicaton


This Spring Boot application aims to provide user with a simple application providing an end point /ping.

Application will reply the a `pong` response


---

## To Build & Run Application

### With Dockerfile
- cd ping-pong   
- docker build -t <docker-image> .    
- docker run -p 8080:8080 <docker-image>

### With Build Pack & Run Application
- pack config default-builder paketobuildpacks/builder:base   
- pack build <docker-image>   
- docker run -p 8080:8080 <docker-image>

---

## To Run Application in Kubernetes

- kubectl apply -f /kubernetes/base/yaml/pingpoing
