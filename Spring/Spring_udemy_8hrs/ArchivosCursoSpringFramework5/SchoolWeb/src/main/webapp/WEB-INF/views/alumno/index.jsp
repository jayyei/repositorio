<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap-theme.min.css">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-xs-12">
                    <p class="bg-success" style="color: green; display: ${Success == true? "block":"none"};">Guardado correctamente</p>
                    <form action="${pageContext.request.contextPath}/alumno/save" method="post">
                        <input type="hidden" name="ideAlu" value="${AlumnoDTO.ideAlu}">
                        <div class="form-group">
                            <label for="nroDni">DNI</label>
                            <input type="text" class="form-control" id="nroDni" placeholder="Ingrese DNI" name="nroDni" value="${AlumnoDTO.nroDni}">
                            <span style="color: red">${Result.getFieldError("nroDni").defaultMessage}</span>
                        </div>
                        <div class="form-group">
                            <label for="apePat">Apellido paterno</label>
                            <input type="text" class="form-control" id="apePat" placeholder="Ingrese apellido paterno" name="apePat" value="${AlumnoDTO.apePat}">
                            <span style="color: red">${Result.getFieldError("apePat").defaultMessage}</span>
                        </div>
                        <div class="form-group">
                            <label for="apeMat">Apellido materno</label>
                            <input type="text" class="form-control" id="apeMat" placeholder="Ingrese apellido materno" name="apeMat" value="${AlumnoDTO.apeMat}">
                            <span style="color: red">${Result.getFieldError("apeMat").defaultMessage}</span>
                        </div>
                        <div class="form-group">
                            <label for="desNom">Nombres</label>
                            <input type="text" class="form-control" id="desNom" placeholder="Ingrese nombres" name="desNom" value="${AlumnoDTO.desNom}">
                            <span style="color: red">${Result.getFieldError("desNom").defaultMessage}</span>
                        </div>
                        <div class="form-group">
                            <label for="desNom">Fecha de nacimiento</label>
                            <input type="text" class="form-control" id="fchNac" placeholder="Ingrese fecha de nacimiento" name="fchNac" value="${AlumnoDTO.fchNac}">
                            <span style="color: red">${Result.getFieldError("fchNac").defaultMessage}</span>
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12 col-md-12 col-xs-12">
                    <form class="form-inline" action="${pageContext.request.contextPath}/alumno/search" method="post">
                        <div class="form-group">
                            <label class="sr-only" for="exampleInputAmount">Buscar </label>
                            <div class="input-group">
                                <input type="text" name="DesBus" class="form-control" id="exampleInputAmount" placeholder="Amount">
                            </div>
                        </div>
                        <button type="submit" class="btn btn-primary">Buscar</button>
                    </form>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12 col-md-12 col-xs-12">
                    <div class="table-responsive">
                        <table class="table table-striped table-hover table-condensed">
                            <caption>Lista de alumnos</caption>
                            <thead>
                                <tr>
                                    <th>Nro</th>
                                    <th>DNI</th>
                                    <th>Paterno</th>
                                    <th>Materno</th>
                                    <th>Nombres</th>
                                    <th>Fecha</th>
                                    <th></th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="Alumno" items="${AlumnoDtoList}" varStatus="Loop">
                                    <tr>
                                        <td>${Loop.count}</td>
                                        <td>${Alumno.nroDni}</td>
                                        <td>${Alumno.apePat}</td>
                                        <td>${Alumno.apeMat}</td>
                                        <td>${Alumno.desNom}</td>
                                        <td>${Alumno.fchNac}</td>
                                        <td>
                                            <form method="post" action="${pageContext.request.contextPath}/alumno/load">
                                                <input type="hidden" name="Id" value="${Alumno.ideAlu}">
                                                <input type="submit" value="Editar">
                                            </form>
                                        </td>
                                        <td>
                                            <form method="post" action="${pageContext.request.contextPath}/alumno/delete">
                                                <input type="hidden" name="Id" value="${Alumno.ideAlu}">
                                                <input type="submit" value="Eliminar">
                                            </form>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>