FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8090
CMD ["mvn", "clean", "package"]
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} my_backend.jar
ENTRYPOINT ["java", "-jar", "my_backend.jar"]
