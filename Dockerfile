# Usar la imagen base de Java 17
FROM openjdk:17-jdk-slim

# Copiar el archivo JAR de la aplicación al contenedor
COPY target/api-0.0.1-SNAPSHOT.jar api.jar

# Ejecutar la aplicación Java
ENTRYPOINT ["java", "-jar", "/api.jar"]