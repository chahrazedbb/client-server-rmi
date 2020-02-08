/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiproject;
import java.net.*;
import java.rmi.*;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class ClientOperation {
    private static RMIInterface look_up;

	public static void main(String[] args) 
		throws MalformedURLException, RemoteException, NotBoundException {
		
		look_up = (RMIInterface) Naming.lookup("//localhost/MyServer");
		String txt = JOptionPane.showInputDialog("What is your name?");
			
		String response = look_up.helloTo(txt);
		JOptionPane.showMessageDialog(null, response);

	}
}
