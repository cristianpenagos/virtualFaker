FROM openjdk:11
EXPOSE 8080
ADD target/virtualFaker-0.0.1-SNAPSHOT.jar virtualFaker.jar
ENTRYPOINT ["java", "-jar", "/virtualFaker.jar"]