# Dockerfile for VPC Manager

FROM openjdk:8

MAINTAINER Zhonghao Lyu <zlyu@futurewei.com>

# Route Manager process
EXPOSE 8080
# ROute Manager admin process

# Generate container image and run container
COPY ./target/SubnetManager-0.1.0-SNAPSHOT.jar /app/SubnetManager-0.1.0.jar
#COPY ./config/machine.json /app/config/machine.json

CMD ["java", "-jar", "/app/SubnetManager-0.1.0.jar"]
