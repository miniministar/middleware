FROM openjdk:8-jdk
VOLUME /tmp
ADD 02-compose-test-1.0-SNAPSHOT.jar 02-compose-test-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/02-compose-test-1.0-SNAPSHOT.jar"]