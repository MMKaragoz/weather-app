# Build stage
FROM maven:3.8.3-openjdk-17-slim AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Run stage
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/weatherapp-0.0.1-SNAPSHOT.jar weatherapp.jar
ENTRYPOINT ["java", "-jar", "weatherapp.jar"]
