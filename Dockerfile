FROM maven:3.8.3-jdk-11-slim AS build

RUN mkdir /project

COPY . /project

WORKDIR /project

RUN mvn clean package

FROM adoptopenjdk/openjdk11:jre-11.0.15_10-alpine

RUN mkdir /app

COPY --from=build /project/target/globalSolution2.war /app/globalSolution2.war
	
WORKDIR /app

EXPOSE 8080 

CMD java $JAVA_OPTS -jar globalSolution2.war