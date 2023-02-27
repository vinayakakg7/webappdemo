FROM tomcat:9.0-jdk11


LABEL maintainer="vinayaka K G <kg@example.com>"

COPY target/webapp.war /tmp/webapp

RUN apt-get update && apt-get install -y unzip


RUN unzip /tmp/webapp.war -d /usr/local/tomcat/webapps/webapp
    && rm /tmp/webapp.war

EXPOSE 9090

CMD ["catalina.sh", "run"]
