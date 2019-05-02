```bash
./gradlew clean build

docker build . -t openshift-order-service

docker run -p 8080:8080 openshift-order-service openshift-order-service:latest
```