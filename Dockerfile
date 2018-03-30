FROM java:openjdk-8-jre-alpine
MAINTAINER papajohns.com
COPY target/echo-0.0.1-SNAPSHOT.jar /opt/echo-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/echo-0.0.1-SNAPSHOT.jar"]
