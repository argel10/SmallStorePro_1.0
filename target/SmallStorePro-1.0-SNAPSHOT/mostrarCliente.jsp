<%-- 
    Document   : mostrarClientes
    Created on : 16/08/2024, 12:01:03 p. m.
    Author     : MARTIN
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Información del Cliente</title>
    <link
        rel="stylesheet"
        href="https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.min.css"
        >
</head>
<body>
    <h1>Datos del Cliente</h1>
    <table border="1">
        <tr>
            <th>Nombre</th>
            <th>Dirección</th>
            <th>Teléfono</th>
        </tr>
        <tr>
            <td><%= request.getAttribute("nombreCliente") %></td>
            <td><%= request.getAttribute("direccionCliente") %></td>
            <td><%= request.getAttribute("telefonoCliente") %></td>
        </tr>
    </table>
</body>
</html>
