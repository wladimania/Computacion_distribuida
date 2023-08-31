/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compu_distribuida;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImplementation extends UnicastRemoteObject implements ServerInterface {

    public ServerImplementation() throws RemoteException {
        super();
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Saludos Clase de Aplicaciones distribuidas de Ingeniería en Sistemas";
    }

}
