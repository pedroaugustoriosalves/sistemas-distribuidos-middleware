package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.UUID;

public class RMIServer extends UnicastRemoteObject implements RMI {
    public RMIServer() throws RemoteException {
        super(1100);
    }

    @Override
    public Integer sum(Integer num1, Integer num2) throws RemoteException {
        System.out.printf("[%s] Executando soma %d + %d\n", UUID.randomUUID().toString().substring(0, 8), num1, num2);
        return num1 + num2;
    }
}
