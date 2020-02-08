/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiproject;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.*;

/**
 *
 * @author PC
 */
public class ServerOperation extends UnicastRemoteObject implements RMIInterface{

    private static final long serialVersionUID = 1L;

    protected ServerOperation() throws RemoteException {

        super();

    }

    @Override
    public String helloTo(String name) throws RemoteException{

        System.err.println(name + " is trying to contact!");
        return "Server says hello to " + name;

    }

    public static void main(String[] args){

        try {
            
            LocateRegistry.createRegistry(1099);
            Registry registry =  LocateRegistry.getRegistry();
            registry.rebind("MyServer", new ServerOperation());            
            System.err.println("Server ready");

        } catch (Exception e) {

            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();

        }

    }

}