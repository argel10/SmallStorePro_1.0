package com.mycompany.smallstorepro.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author MARTIN
 */
@WebServlet(name = "clienteservlet", urlPatterns = {"/Cliente"})
public class clienteservlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener los valores del formulario
        String nombreCliente = request.getParameter("nombreCliente");
        String direccionCliente = request.getParameter("direccionCliente");
        String telefonoCliente = request.getParameter("telefonoCliente");

        // Almacenar los valores en los atributos de la solicitud (request)
        request.setAttribute("nombreCliente", nombreCliente);
        request.setAttribute("direccionCliente", direccionCliente);
        request.setAttribute("telefonoCliente", telefonoCliente);

        // Redirigir a la página JSP
        request.getRequestDispatcher("mostrarCliente.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
