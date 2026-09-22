package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMI extends Remote{
    public Integer sum(Integer num1, Integer num2) throws RemoteException;
}
