
# Use Tomcat as the base image
FROM tomcat:9.0.52-jdk8-openjdk

# Copy the WAR file into the webapps folder of the Tomcat server
COPY target/webapp.war /usr/local/tomcat/webapps/

# Expose the default Tomcat port
EXPOSE 8090

# Start the Tomcat server when the container starts
CMD ["catalina.sh", "run"]
