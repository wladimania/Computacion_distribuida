package com.mycompany.clientermi;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.registry.Registry;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class Client extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Registry servClient = java.rmi.registry.LocateRegistry.getRegistry("localhost", 1099);
            ServerInterface server = (ServerInterface) Naming.lookup("//localhost/mapmeto");
            System.out.println(server.sayHello());
            String result = server.sayHello();
            request.setAttribute("message", result);
            request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
        } catch (Exception e) {
            System.out.println("Client exception: " + e);
            request.setAttribute("message", "Error: " + e.getMessage());
            request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
        }
    }
}
