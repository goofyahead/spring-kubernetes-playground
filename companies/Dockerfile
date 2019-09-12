### Runtime image ###
FROM openjdk:8-jre-alpine

# Volume for temp Spring Boot application files
VOLUME /tmp

# Install dependencies
RUN apk add curl

# Set the app working directory
WORKDIR /app

# Copy the executable JAR to the image
COPY /build/libs/*.jar /app/

ARG DEPLOYMENT_VERSION_ARG=0.0.1
ENV DEPLOYMENT_VERSION=$DEPLOYMENT_VERSION_ARG

# Run the app
ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom ${JAVA_OPTS} -jar *.jar