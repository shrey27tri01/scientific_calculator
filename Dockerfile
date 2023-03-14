FROM openjdk:11
WORKDIR ./
COPY target/scientific_calculator-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]