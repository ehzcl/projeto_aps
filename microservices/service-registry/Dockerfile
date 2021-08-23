FROM adoptopenjdk/openjdk11:latest
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/service-registry-0.0.1-SNAPSHOT.jar serviceregistry.jar
#ENTRYPOINT exec java $JAVA_OPTS -jar serviceregistry.jar
EXPOSE 8761
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar serviceregistry.jar
