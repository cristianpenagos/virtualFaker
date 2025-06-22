FROM openjdk:11
EXPOSE 8080
ADD target/virtualFaker.jar virtualFaker.jar
ENTRYPOINT ["java", "-jar", "/virtualFaker.jar"]