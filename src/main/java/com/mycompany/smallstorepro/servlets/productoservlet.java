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
@WebServlet(name = "productoservlet", urlPatterns = {"/Producto"})
public class productoservlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener los valores del formulario
        String nombreProducto = request.getParameter("nombreProducto");
        String precioProducto = request.getParameter("precioProducto");
        String cantidadProducto = request.getParameter("cantidadProducto");
        String proveedorProducto = request.getParameter("proveedorProducto");

        // Almacenar los valores en los atributos de la solicitud (request)
        request.setAttribute("nombreProducto", nombreProducto);
        request.setAttribute("precioProducto", precioProducto);
        request.setAttribute("cantidadProducto", cantidadProducto);
        request.setAttribute("proveedorProducto", proveedorProducto);

        // Redirigir a la página JSP
        request.getRequestDispatcher("mostrarProducto.jsp").forward(request, response);
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
