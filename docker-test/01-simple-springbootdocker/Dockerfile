FROM openjdk:8-jre
WORKDIR /kaopudian/dockerfile
ADD 01-simple-springbootdocker.jar app.jar
EXPOSE 8100
ENTRYPOINT ["java", "-jar"]
CMD ["app.jar"]