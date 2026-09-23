#!/bin/sh

SERVER_IP=10.106.19.96

echo "Rodando comando de build"

javac --release 21 -d out src/rmi/RMI.java src/Main.java

echo "Executando o servidor"

java -cp out Main