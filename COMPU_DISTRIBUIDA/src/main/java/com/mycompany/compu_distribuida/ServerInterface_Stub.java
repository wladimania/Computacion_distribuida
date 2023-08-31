/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compu_distribuida;

import java.rmi.*;
import java.io.*;

public class ServerInterface_Stub extends java.rmi.server.RemoteStub implements ServerInterface {
    private static final long serialVersionUID = 2;
    private static java.lang.reflect.Method $method_sayHello_0;

    static {
        try {
            $method_sayHello_0 = ServerInterface.class.getMethod("sayHello", new java.lang.Class[] {});
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.NoSuchMethodError("stub class initialization failed");
        }
    }

    // constructor
    public ServerInterface_Stub(java.rmi.server.RemoteRef ref) {
        super(ref);
    }

    // implementation of sayHello method
    public java.lang.String sayHello() throws java.rmi.RemoteException {
        try {
            Object $result = ref.invoke(this, $method_sayHello_0, null, -7207851917985848402L);
            return (java.lang.String) $result;
        } catch (java.lang.RuntimeException | java.rmi.RemoteException e) {
            throw e;
        } catch (java.lang.Exception e) {
            throw new java.rmi.UnexpectedException("undeclared checked exception", e);
        }
    }
}