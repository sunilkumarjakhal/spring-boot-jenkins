FROM openjdk:8
EXPOSE 8080
ADD target/spring-boot-docker-jenkins.jar spring-boot-docker-jenkins.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker-jenkins.jar"]