FROM adoptopenjdk/openjdk11:alpine-jre
VOLUME /tmp
ENV SPRING_APPLICATION_NAME demo-test
ADD /target/demo-0.0.1-SNAPSHOT.jar  /tmp/
CMD  java -jar  /tmp/demo-0.0.1-SNAPSHOT.jar --spring.application.name=${SPRING_APPLICATION_NAME}
EXPOSE 8080