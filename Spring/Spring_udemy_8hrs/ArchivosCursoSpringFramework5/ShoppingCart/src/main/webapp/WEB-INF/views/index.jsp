<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <table>
            <caption>Productos</caption>
            <thead>
                <tr>
                    <th></th>
                    <th>Nombre</th>
                    <th>Precio</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="Producto" items="${ProductoDtoList}" varStatus="Loop">
                    <tr>
                        <td>${Loop.count}</td>
                        <td>${Producto.nomPro}</td>
                        <td>${Producto.cntPre}</td>
                        <td>
                            <form action="${pageContext.request.contextPath}/save" method="post">
                                <input type="hidden" name="idePro" value="${Producto.idePro}">
                                <input type="hidden" name="nomPro" value="${Producto.nomPro}">
                                <input type="hidden" name="cntPre" value="${Producto.cntPre}">
                                <input type="text" name="cntPro">
                                <input type="submit" value="Guardar">
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <table>
            <caption>Productos</caption>
            <thead>
                <tr>
                    <th></th>
                    <th>Nombre</th>
                    <th>Precio</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="Producto" items="${ProductoSessionDtoList}" varStatus="Loop">
                    <tr>
                        <td>${Loop.count}</td>
                        <td>${Producto.nomPro}</td>
                        <td>${Producto.cntPre}</td>
                        <td>${Producto.cntPre * Producto.cntPro}</td>
                        <td><a href="/delete/${Producto.idePro}">Eliminar</a> </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>