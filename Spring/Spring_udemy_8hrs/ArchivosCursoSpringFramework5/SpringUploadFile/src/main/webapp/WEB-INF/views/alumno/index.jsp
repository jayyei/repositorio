<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/alumno/save" method="post" enctype="multipart/form-data">
            Nombre : <input type="text" name="nomAlu"><br>
            Foto : <input type="file" name="desFot"><br>
            <input type="submit" value="Guardar"><br>
        </form>
        <p>${Foto}</p>
    </body>
</html>