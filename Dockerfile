FROM maven:3.9-eclipse-temurin-11 AS builder

WORKDIR /app
COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests

FROM eclipse-temurin:11-jre-alpine

WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar

RUN addgroup --gid 501 usercode && \
    adduser --disabled-password --gecos "" --uid 501 --ingroup usercode usercode

USER usercode

ENTRYPOINT ["java", "-jar", "app.jar"]
