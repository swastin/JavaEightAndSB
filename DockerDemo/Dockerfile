

FROM ubuntu:20.04

# Install the Java runtime
RUN apt-get update && apt-get install -y openjdk-16-jdk

# Create a directory for the application code
RUN mkdir /app

# Copy the compiled code into the image
COPY target/DockerDemo.jar /app/DockerDemo.jar

# Expose the application's port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "/app/DockerDemo.jar"]
