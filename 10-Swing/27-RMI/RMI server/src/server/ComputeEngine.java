package server;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

import compute.*;
public class ComputeEngine implements Compute {
    public ComputeEngine() {
    	super();
    }
    
    public double area(double radius) throws RemoteException {
    	return Math.PI*radius*radius;
    }
    
    public static void main(String args[]) {
    	try {
    	Compute compute= new ComputeEngine();
    	final int PORT=8080;
    	Registry registry=LocateRegistry.createRegistry(PORT);
    	UnicastRemoteObject.exportObject(compute,PORT);
    	registry.rebind("Check", compute);
    	System.out.println("Engine Bind");
    	}
    	catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
    }
}

