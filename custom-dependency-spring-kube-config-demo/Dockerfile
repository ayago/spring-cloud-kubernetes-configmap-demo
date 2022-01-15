FROM adoptopenjdk/openjdk8:ubi
VOLUME /tmp
COPY target/custom-dependency-spring-kube-config-demo-1.0-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -jar /app.jar