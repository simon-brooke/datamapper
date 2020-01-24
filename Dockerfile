FROM openjdk:8-alpine

COPY target/uberjar/datamapper.jar /datamapper/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/datamapper/app.jar"]
