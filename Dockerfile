FROM openjdk:11
EXPOSE 8080
ADD target/virtualFaker.jar virtualFaker.jar
ENTRYPOINT ["java", "-jar", "/virtualFaker.jar"]

# Etapa de construcción
FROM maven:latest AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa de empaquetado (runtime)
FROM openjdk:11-jdk-slim
WORKDIR /app
# Copia el JAR de la etapa 'build' a la etapa actual
COPY --from=build /app/target/virtualFaker.jar virtualFaker.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","virtualFaker.jar"]