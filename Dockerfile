FROM openjdk:17 as base

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY src ./src

FROM base as test
RUN ["./mvnw", "test"]

FROM base as deploy
CMD ./mvnw clean package && java -jar ./target/unitTestsInsideContainer-0.1.jar

