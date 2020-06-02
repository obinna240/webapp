FROM openjdk
VOLUME /tmp
COPY webapp-0.0.1.jar webapp-0.0.1.jar
RUN sh -c 'touch webapp-0.0.1.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","webapp-0.0.1.jar"]
