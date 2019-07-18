package compute;

import java.rmi.*;

public interface Compute extends Remote {
   public double area(double radius) throws RemoteException;
}

