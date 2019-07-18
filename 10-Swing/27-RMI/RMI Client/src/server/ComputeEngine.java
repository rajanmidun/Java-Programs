package server;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

import compute.*;
public class ComputeEngine {
    
    public static void main(String args[]) {
    	try {
    	   String url="rmi://127.0.0.1:8080/Check";
    	   Compute compute=(Compute)Naming.lookup(url);
    	   double radius=2;
    	   double result=compute.area(radius);
    	   System.out.println("Area "+result);
    	}
    	catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
    }
}

