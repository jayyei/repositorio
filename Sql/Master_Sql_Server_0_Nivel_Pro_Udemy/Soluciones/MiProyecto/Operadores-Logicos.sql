-- Operadores lógicos
SELECT * FROM Paciente;

-- AND
SELECT * FROM Paciente WHERE idPais like 'MEX' AND apellido like 'Sesgado';

-- OR
 SELECT * FROM Paciente WHERE idPais like 'MEX' OR apellido like 'Fernandez';

 -- IN es igual a multiples OR's
 SELECT * FROM Turno WHERE estadoTurno IN(0,1,3);
 SELECT * FROM Turno WHERE idTurno IN(1,4,5,6);
 SELECT * FROM Paciente WHERE nombre IN('Jorge', 'Claudio');
 SELECT * FROM Paciente WHERE idPais in ('ESP', 'ARG');

 -- LIKE Para trabajar con campos de cadenas de caracteres
 SELECT * FROM Paciente WHERE nombre LIKE 'J%'; --Encuentra coincidencias que empiecen con la(s) letras indicadas
 SELECT * FROM Paciente WHERE nombre LIKE '%o'; --Encuentra coincidencias que terminen con la(s) letras indicadas
 SELECT * FROM Paciente WHERE nombre LIKE '%a%'; --Encuentra coincidencias que tengan la(s) letra(s) indicadas en cualquier posicion
 SELECT * FROM Paciente WHERE nombre LIKE '_a'; -- Encuentra coincidencias que tengan la(s) letra(s) indicadas en la segunda posicion

 -- NOT
 SELECT * FROM Paciente WHERE nombre NOT LIKE 'J%'; --Distinto a este patron
 SELECT * FROM Paciente WHERE nombre NOT LIKE '%o'; --Distinto a este patron
 SELECT * FROM Paciente WHERE idPais NOT IN ('ESP', 'ARG'); --Tambien aplicable a in
 SELECT * FROM Paciente WHERE nombre NOT IN ('Jorge', 'Claudio');
 SELECT * FROM Paciente WHERE NOT nombre  = 'Javier';
 SELECT * FROM Paciente WHERE NOT apellido = 'Lopez';

 -- BETWEEN Para fechas o valores numericos

 SELECT * FROM Turno WHERE fechaTurno BETWEEN '20190101' AND '20200302';
 SELECT * FROM Turno WHERE fechaTurno BETWEEN '20190102' AND '20200303';
 SELECT * FROM Turno WHERE fechaTurno BETWEEN '20200302 14:00:00' AND '20200303 15:31:00';
 SELECT * FROM Turno WHERE estadoTurno BETWEEN 0 AND 1;

 -- Combinado
 SELECT * FROM Paciente WHERE  idPaciente > 1 AND (nombre = 'Jorge' OR apellido = 'Sesgado');
 SELECT * FROM Paciente WHERE idPais IN ('MEX', 'ARG') OR (telefono = NULL AND email = NULL);

 -- Ejecuccion de un stored procedure
 EXEC dbo.SP_paciente 1;
 EXEC dbo.SP_SUBQUERY 'Pendiente';