FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app
COPY src ./src
RUN javac -d out src/rmi/RMI.java src/rmi/RMIServer.java src/Main.java

EXPOSE 1099 1100

ENTRYPOINT ["java", "-cp", "out", "Main"]
