#Start with base image containing java runtime
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

#Add the application's jar to the container
COPY target/configserver-0.0.1-SNAPSHOT.jar app.jar


#Execute application
ENTRYPOINT ["java", "-jar", "app.jar"]
