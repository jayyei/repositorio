-- Clausulas WHERE TOP ORDER BY DISTINCT y GROUP BY

-- Where
SELECT * FROM Paciente Where apellido like 'Lopez' OR apellido LIKE 'Fernandez';
UPDATE Turno SET observacion = 'Observacion agregada' where idTurno = 2 AND estadoTurno = 0;

-- TOP Permite seleccionar un limite de registros de una tabla
SELECT * FROM Turno;
SELECT TOP 2 * FROM Turno
SELECT * FROM Paciente;
SELECT TOP 2 * FROM Paciente Order by idPaciente DESC;
SELECT TOP 50 PERCENT * FROM Paciente;

-- ORDER BY 
SELECT * FROM Turno ORDER BY fechaTurno DESC;
SELECT * FROM Turno ORDER BY estadoTurno DESC;
SELECT * FROM Turno ORDER BY observacion ASC;
SELECT TOP 3 * FROM Turno ORDER BY observacion DESC;

-- DISTINCT
SELECT DISTINCT(estadoTurno) FROM Turno;
SELECT DISTINCT estadoTurno, observacion FROM Turno; --En este caso observacion no tiene repetidos, por lo que vuelve a traer los mismos registros
SELECT * FROM Turno Where  estadoTurno in (SELECT DISTINCT(estadoTurno) FROM Turno);

-- GROUP BY Permite añadir funciones de agregado y performance
-- Agrupa filas que contienen los mismos valores en filas de resumen como por ejemplo buscar el numero de clientes de cada pais
-- Por ejemplo es comun usarlo con funciones de agregado para saber el numero de registros que tiene cada estadoTurno
SELECT Count(*) as Conteo, estadoTurno FROM Turno GROUP BY estadoTurno;
SELECT SUM(estadoTurno) as Suma FROM Turno;