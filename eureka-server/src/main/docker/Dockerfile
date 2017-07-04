FROM java:8-jdk
VOLUME /tmp
#ADD target/eureka-server-0.0.1.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/eureka-server-0.0.1.jar"]
#EXPOSE 7000