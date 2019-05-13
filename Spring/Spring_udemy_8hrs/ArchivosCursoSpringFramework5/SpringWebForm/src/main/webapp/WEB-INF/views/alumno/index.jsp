<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <form action="${pageContext.request.contextPath}/alumno/save" method="post">
            <label for="apePat">Paterno</label> : <input type="text" name="apePat" id="apePat"> <br>
            <label for="apeMat">Materno</label> : <input type="text" name="apeMat" id="apeMat"> <br>
            <label for="desNom">Nombres</label> : <input type="text" name="desNom" id="desNom"> <br>
            <label for="fchNac">Fch. Nac.</label> : <input type="date" name="fchNac" id="fchNac"> <br>
            <label for="desEma">E-mail</label> : <input type="email" name="desEma" id="desEma"> <br>
            <label for="desEma">Genero</label> :<br>
            Femenino : <input type="radio" name="ideGen" value="0"> <br>
            Masculino : <input type="radio" name="ideGen" value="1"> <br>

            <label for="ideNiv">Nivel</label>
            <select name="ideNiv" id="ideNiv">
                <option value="1">Inicial</option>
                <option value="2">Primaria</option>
                <option value="3">Secundaria</option>
            </select><br>

            <p>Cursos</p>
            <input type="checkbox" name="cursoDtoList[0].ideCur" value="1"> Lenguaje
            <input type="checkbox" name="cursoDtoList[1].ideCur" value="2"> Ingles
            <input type="checkbox" name="cursoDtoList[2].ideCur" value="3"> Computo
            <br>
            <label for="ideUsu.desUsu">Usuario</label> : <input type="text" name="ideUsu.desUsu" id="ideUsu.desUsu"> <br>
            <label for="ideUsu.pasWor">Clave</label> : <input type="password" name="ideUsu.pasWor" id="ideUsu.pasWor"> <br>
           <input type="submit" value="Guardar">
        </form>
        <p>${FullName}</p>
    </body>
</html>