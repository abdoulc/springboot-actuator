# Spring Boot 2.x actuator example
* note that all actuator endpoints are now under **/actuator** path
* all endpoints are not available by default, that was not the case in 1.x 

### to enable endpoints (in application.properties  file):
    management.endpoints.web.exposure.include=*

### we can customize an endpoint (ex:  ***health***  ) : 
  (ex: ***class InternetHealthMetrics***  under the package ***com.abdoulc.health.actuatorexample.health***), by adding **management.endpoint.health.show-details=always** in application.properties files:
     
### we can create our own endpoint:
 (ex: ***class MyEndpoint***  under the package ***com.abdoulc.health.actuatorexample.endpoint***)
