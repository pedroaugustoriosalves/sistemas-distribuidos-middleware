@echo off

set "SERVER_IP=10.28.236.96"

echo "Rodando comando de build"
javac --release 21 -d out src\rmi\RMI.java src\Main.java

echo "Executando o cliente"
java -cp out Main "%SERVER_IP%"