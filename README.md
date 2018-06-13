# Spring Boot PCF Demo

## Initial Deployment
To run application locally:

```sh
./mvnw spring-boot:run
```

To create the binary:

```sh
./mvnw package
```


To push to pcf:

```sh
cf push pcf-demo -p target/pcf-demo-0.0.1-SNAPSHOT.jar --random-route
```

*The random route option is to ensure a route in-case it's already been taken.*

Access your deployed application via the route generated.

You will see corresponding PCF application information.

## Spring Boot Actuator

Check the */actuator* endpoint for available actuator URLS.

Including: */info , /logfile , /env *

