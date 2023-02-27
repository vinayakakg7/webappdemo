FROM openjdk:11

WORKDIR /app

COPY target/webapp.war .

EXPOSE 9090

CMD ["java", "-jar", "webapp.war"]
