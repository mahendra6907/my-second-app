FROM openjdk:8
EXPOSE 9060
ADD target/my-second-app.jar my-second-app.jar
ENTRYPOINT ["java", "-jar", "/my-second-app.jar"]