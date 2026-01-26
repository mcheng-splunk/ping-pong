# Stage 1: Build the app with Maven
FROM maven:3.8.7-openjdk-18-slim AS maven_build

# Set working directory
WORKDIR /build

# Copy pom.xml first for dependency caching
COPY pom.xml .

# Download dependencies
RUN mvn dependency:go-offline

# Copy the source code
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Stage 2: Create a lightweight runtime image
FROM eclipse-temurin:8-jdk-ubi10-minimal

WORKDIR /app

# Copy the built JAR from the Maven build
COPY --from=maven_build /build/target/ping-pong-0.0.1-SNAPSHOT.jar /app/

# Expose default Spring Boot port
EXPOSE 8080

# Entry point
ENTRYPOINT ["java", "-jar", "ping-pong-0.0.1-SNAPSHOT.jar"]
