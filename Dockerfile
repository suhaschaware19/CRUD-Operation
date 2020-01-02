FROM openjdk:8-jdk-alpine
COPY target/cruddemo-0.0.1-SNAPSHOT.jar cruddemo-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","/cruddemo-0.0.1-SNAPSHOT.jar"]
