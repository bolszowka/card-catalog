FROM openjdk:21-jdk-slim
LABEL authors="bolszowka"
COPY target/card-catalog-0.0.1-SNAPSHOT.jar card-catalog-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "card-catalog-0.0.1-SNAPSHOT.jar"]