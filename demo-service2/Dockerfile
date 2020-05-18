FROM java:8-jre-alpine
VOLUME /tmp
ENV SPRING_APPLICATION_NAME demo-service2
ADD /target/demo-service2-0.0.1-SNAPSHOT.jar  /tmp/
CMD  java -jar  /tmp/demo-service2-0.0.1-SNAPSHOT.jar --spring.application.name=${SPRING_APPLICATION_NAME}
EXPOSE 8081