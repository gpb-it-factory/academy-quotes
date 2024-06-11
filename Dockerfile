FROM openjdk:17-jdk-slim-buster
WORKDIR /app

COPY build/libs/* build/lib/

COPY build/libs/quotes-1.0-SNAPSHOT.jar build/

WORKDIR /app/build
ENTRYPOINT java -jar quotes-1.0-SNAPSHOT.jar