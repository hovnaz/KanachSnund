FROM openjdk:11-jdk
VOLUME /TMP
EXPOSE 8080
ADD ./target/KanachSnund-0.0.1-SNAPSHOT.jar app.jar
RUN mkdir -p /var/images
ENTRYPOINT ["java","-Dspring.profiles.active=dev","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
