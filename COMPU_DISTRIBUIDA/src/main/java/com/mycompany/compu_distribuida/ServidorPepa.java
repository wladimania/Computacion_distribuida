/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compu_distribuida;

import java.rmi.registry.Registry;



/**
 *
 * @author desta
 */
public class ServidorPepa {
    
    public static void main(String[] args) {
        try {
            //ServerInterface server = new ServerImplementation();
            Registry serv = java.rmi.registry.LocateRegistry.createRegistry(1099);
            serv.rebind("mapmeto", new ServerImplementation());
            
            //java.rmi.Naming.rebind("Server", server);
            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.out.println("Server failed: " + e);
        }
    }
}
