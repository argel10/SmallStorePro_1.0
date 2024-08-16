<%-- 
    Document   : mostrarProveedor
    Created on : 16/08/2024, 11:42:20 a. m.
    Author     : MARTIN
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Información del Proveedor</title>
    <link
        rel="stylesheet"
        href="https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.min.css"
        >
</head>
<body>
    <h1>Datos del Proveedor</h1>
    <table border="1">
        <tr>
            <th>Nombre</th>
            <th>Dirección</th>
            <th>Teléfono</th>
        </tr>
        <tr>
            <td><%= request.getAttribute("nombreProveedor") %></td>
            <td><%= request.getAttribute("direccionProveedor") %></td>
            <td><%= request.getAttribute("telefonoProveedor") %></td>
        </tr>
    </table>
</body>
</html>
