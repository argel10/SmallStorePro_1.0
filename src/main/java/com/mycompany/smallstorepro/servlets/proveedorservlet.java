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
@WebServlet(name = "proveedorservlet", urlPatterns = {"/Proveedor"})
public class proveedorservlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener los valores del formulario
        String nombreProveedor = request.getParameter("nombreProveedor");
        String direccionProveedor = request.getParameter("direccionProveedor");
        String telefonoProveedor = request.getParameter("telefonoProveedor");

        // Almacenar los valores en los atributos de la solicitud (request)
        request.setAttribute("nombreProveedor", nombreProveedor);
        request.setAttribute("direccionProveedor", direccionProveedor);
        request.setAttribute("telefonoProveedor", telefonoProveedor);

        // Redirigir a la página JSP
        request.getRequestDispatcher("mostrarProveedor.jsp").forward(request, response);
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
