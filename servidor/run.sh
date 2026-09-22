#!/bin/sh

SERVER_IP=10.106.19.96

echo "O IP do servidor configurado atualmente no arquivo SH é ${SERVER_IP}"

echo "Rodando comando de build"

javac --release 21 -d out src/rmi/RMI.java src/rmi/RMIServer.java src/Main.java

echo "Executando o servidor"

java "-Djava.rmi.server.hostname=${SERVER_IP}" -cp out Main