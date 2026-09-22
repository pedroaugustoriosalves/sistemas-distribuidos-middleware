import rmi.RMI;

import java.rmi.Naming;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        try {
            RMI rmiClient =  (RMI) Naming.lookup("//" + args[0] + "/rmi");
            System.out.printf("Mensagem do servidor: %d", rmiClient.sum(2,4));
        } catch (Exception e) {
            System.out.println("Exception: ".concat(e.getMessage()));
        }
    }
}
