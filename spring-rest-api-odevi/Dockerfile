FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/spring-rest-api-odevi-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 4444

CMD ["java", "-jar", "app.jar"]