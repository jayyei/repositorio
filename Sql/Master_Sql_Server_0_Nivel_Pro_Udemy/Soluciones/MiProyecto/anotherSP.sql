
CREATE PROCEDURE anotherSP @idPaciente int
AS
SELECT apellido, nombre, idPais, observacion,
	(SELECT pais FROM Pais ps WHERE ps.abreviatura = pa.idPais) as DescripcionPais
	FROM Paciente pa WHERE idPaciente = @idPaciente;

EXEC anotherSP 1;

SELECT * FROM Paciente;