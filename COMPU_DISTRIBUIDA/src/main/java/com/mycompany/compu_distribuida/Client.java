/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compu_distribuida;

import java.rmi.Naming;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
       
        try {
            Registry servClient = java.rmi.registry.LocateRegistry.getRegistry("localhost",1099);
            ServerInterface server = (ServerInterface) Naming.lookup("//localhost/mapmeto");
            System.out.println(server.sayHello());
        } catch (Exception e) {
            System.out.println("Client exception: " + e);
        }
    }
}
