
-- Script para crear un store procedure de medicos

/*SELECT * FROM Medico;
SELECT * FROM MedicoEspecialidad;
SELECT * FROM Especialidad;*/


CREATE PROC ALTA_Medico(
			@nombre varchar(50),
			@apellido varchar(20),
			@idespecialidad int,
			@descripcion varchar(50)
			)
AS
SET nocount on

IF NOT EXISTS(SELECT TOP 1 idMedico from Medico WHERE nombre = @nombre and apellido = @apellido)
BEGIN
	INSERT INTO Medico(nombre, apellido)
	VALUES (@nombre, @apellido)

	declare @idMedico int
	SET @idMedico = @@IDENTITY

	INSERT INTO MedicoEspecialidad(idMedico, idEspecialidad, descripcion)
	VALUES (@idMedico, @idespecialidad, @descripcion)

	print 'El medico se agrego correctamente'
END
ELSE
BEGIN
	print 'El medico ya existe'
	return
END

INSERT INTO Especialidad VALUES('Neurologia');
EXEC ALTA_Medico 'Gregory', 'House', 1, 'Neurocirujano';