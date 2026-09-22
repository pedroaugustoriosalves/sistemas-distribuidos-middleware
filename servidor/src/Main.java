import rmi.RMIServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Main {
    public static void main(String[] args) {
        int port = 1099;
        
        try{
            LocateRegistry.createRegistry(port);
            RMIServer rmiServer = new RMIServer();
            Naming.rebind("//localhost/rmi", rmiServer);
            System.out.printf("Servidor RMI ativo na porta %d.", port);
            System.out.println("Aguardando chamadas dos clientes... Pressione Ctrl+C para parar.");
        } catch (Exception e) {
            System.out.println("Exception: ".concat(e.getMessage()));
        }
    }
}
