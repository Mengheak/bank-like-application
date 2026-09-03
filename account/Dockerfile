#Start with base image containing java runtime
FROM eclipse-temurin:17-jdk-alpine AS build

WORKDIR /app

#Add the application's jar to the container
COPY target/account-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

#Execute application
ENTRYPOINT ["java", "-jar", "app.jar"]
