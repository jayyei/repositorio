<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/alumno/save" method="post">
            <table>
                <tr>
                    <td>Edad</td>
                    <td>
                        <input type="text" name="nroEda" value="${Form.nroEda}">
                        <span style="color: red">${Result.getFieldError("nroEda").defaultMessage}</span>
                    </td>
                </tr>
                <tr>
                    <td>Paterno</td>
                    <td>
                        <input type="text" name="apePat" value="${Form.apePat}">
                        <span style="color: red">${Result.getFieldError("apePat").defaultMessage}</span>
                    </td>
                </tr>
                <tr>
                    <td>Nombres</td>
                    <td>
                        <input type="text" name="desNom" value="${Form.desNom}">
                        <span style="color: red">${Result.getFieldError("desNom").defaultMessage}</span>
                    </td>
                </tr>
                <tr>
                    <td>E-mail</td>
                    <td>
                        <input type="text" name="desEma" value="${Form.desEma}">
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Guardar"></td>
                </tr>
            </table>
        </form>
    </body>
</html>