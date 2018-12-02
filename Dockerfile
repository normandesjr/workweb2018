FROM openjdk:8u181-jdk-alpine3.8

ENV LANG C.UTF-8

RUN apk add --update bash

ADD target/beerstore*.jar /app/app.jar

CMD java -jar /app/app.jar $APP_OPTIONS