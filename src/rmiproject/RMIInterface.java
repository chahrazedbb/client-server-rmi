/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiproject;
import java.rmi.*;

/**
 *
 * @author PC
 */
public interface RMIInterface extends Remote {

    public String helloTo(String name) throws RemoteException;

}