Esse projeto foi desenvolvido como atividade de estudo sobre middlewares para a disciplina de Sistemas Distribuídos. O objetivo é observar o funcionamento de uma chamada remota utilizando o middleware Java RMI.

## Como executar localmente

### Requisitos

- Ter o Docker instalado em sua máquina

### Instruções

Realize um clone do projeto, abra um terminal na pasta e siga os seguintes passos:

1. Construa as duas imagens:

   ```bash
   docker build -t servidor-rmi ./servidor
   docker build -t cliente-rmi ./cliente
   ```

2. Inicie o servidor:

   ```bash
   docker run -d --name servidor-rmi servidor-rmi
   ```

3. Execute o cliente:

   ```bash
   docker run --rm --network container:servidor-rmi cliente-rmi
   ```

   A saída esperada é `Mensagem do servidor: 6`. Para ver as chamadas recebidas pelo servidor, execute `docker logs servidor-rmi`.

4. Ao terminar, pare e remova o servidor:

   ```bash
   docker stop servidor-rmi
   docker rm servidor-rmi
   ```