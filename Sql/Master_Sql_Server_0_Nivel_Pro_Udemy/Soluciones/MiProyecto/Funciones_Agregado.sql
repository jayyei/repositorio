-- Funciones de Agregado 
-- MAX y MIN
SELECT * FROM Paciente;
SELECT MAX(idPaciente) FROM Paciente;
SELECT MIN(idPaciente) FROM Paciente;

SELECT MIN(idPaciente) as Minimo, idPais FROM Paciente GROUP BY idPais;

-- SUM (solo para numericos)
SELECT SUM(idPaciente) as Suma From Paciente;
SELECT SUM(idPaciente) as Suma, idPais FROM Paciente Group BY idPais; --Por lo general, la columna por la que se agrupa ira en el select del query

-- AVG Promedio para numericos
SELECT AVG(idPaciente) as Promedio FROM Paciente;
SELECT AVG(idPaciente) as Promedio, idPais FROM Paciente GROUP BY idPais; --Group by no podra traer todos las columnas

-- COUNT
SELECT COUNT(*) as Conteo_Registros FROM Paciente;
SELECT COUNT(idPaciente) as Conteo_Condicional FROM Paciente WHERE idPaciente <=2;
SELECT COUNT(*) as conteo_Registros_Por_Pais, idPais FROM Paciente GROUP BY idPais; 

SELECT * FROM Turno;
INSERT INTO Turno values ('20190101 12:00', 2, 'obs');

-- HAVING Fue añadida debido a que el where no puede usarse con funciones agregadas, en otras palabras HAVING = WHERE
-- Suele trabajar con Count y con group by
SELECT COUNT(idTurno), estadoTurno FROM Turno GROUP BY estadoTurno HAVING estadoTurno > 1;
SELECT COUNT(idTurno) as Numero_Registros_Agrupados_Por_Estado_Turno_Donde_turnoMenor1,
	estadoTurno FROM Turno GROUP BY estadoTurno HAVING estadoTurno <=1;


