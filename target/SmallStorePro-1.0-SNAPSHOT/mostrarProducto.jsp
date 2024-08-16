<%-- 
    Document   : mosntrarProducto
    Created on : 16/08/2024, 11:59:34 a. m.
    Author     : MARTIN
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Información del Producto</title>
    <link
        rel="stylesheet"
        href="https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.min.css"
        >
</head>
<body>
    <h1>Datos del Producto</h1>
    <table border="1">
        <tr>
            <th>Nombre</th>
            <th>Precio</th>
            <th>Cantidad</th>
            <th>Proveedor</th>
        </tr>
        <tr>
            <td><%= request.getAttribute("nombreProducto") %></td>
            <td><%= request.getAttribute("precioProducto") %></td>
            <td><%= request.getAttribute("cantidadProducto") %></td>
            <td><%= request.getAttribute("proveedorProducto") %></td>
        </tr>
    </table>
</body>
</html>
