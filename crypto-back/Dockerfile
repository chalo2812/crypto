FROM openjdk:8u332-jre-slim
WORKDIR /app
COPY . .
RUN apt-get update && apt-get install net-tools -y
EXPOSE 9090
CMD [ "java", "-jar", "/app/target/crypto-back-1.0.0-SNAPSHOT.jar" ]
