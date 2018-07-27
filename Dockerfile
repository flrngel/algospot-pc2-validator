FROM openjdk:11-slim
ADD . /app
RUN apt update && apt install make && cd /app && make
