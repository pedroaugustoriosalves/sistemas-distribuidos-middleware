FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app
COPY src ./src
RUN javac -d out src/rmi/RMI.java src/Main.java

ENTRYPOINT ["java", "-cp", "out", "Main", "localhost"]
