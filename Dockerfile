FROM maven as build
WORKDIR /app
copy . .
RUN mvn install


FROM openjdk:11.0
WORKDIR /app
COPY --from=build /app/target/webapp.war /app/
EXPOSE 8090
CMD ["java" , "-jar" , "webapp.war" ]