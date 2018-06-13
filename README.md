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

Including: */info , /logfile , /env , /metrics *

## PCF Metrics - gathering Application Metrics Information

Metric data can be sent to an Metric Platform of your choice including PCF Metrics.

For PCF Metrics this will require setting up a PCF Metrics Forwarder Serivce.

To check if it's available:

```sh
cf marketplace
```

Verify that the *metrics-forwarder* service is there.

To create the Service:

```sh
cf create-service metrics-forwarder unlimited myforwarder
```

It will need to be bound to your application:

```sh
cf bind-service pcf-demo myforwarder
```

Then restart your app:
```sh
cf restage pcf-demo
```






