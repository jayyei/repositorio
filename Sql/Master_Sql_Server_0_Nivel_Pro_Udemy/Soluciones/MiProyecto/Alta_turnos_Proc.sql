



alter proc ALTA_Turno(
				@fechaTurno char(14), --20190215 12:00
				@idpaciente paciente,
				@idmedico medico,
				@observacion varchar(300) = ''
				)
as

/* 
ESTADO = 0 (pendiente)
ESTADO = 1 (realizado)
ESTADO = 2 (cancelado)
*/
set nocount on
IF NOT EXISTS(SELECT TOP 1 idTurno FROM Turno Where fechaTurno = @fechaTurno)
BEGIN
	INSERT INTO Turno (fechaTurno, estadoTurno, observacion)
	VALUES (@fechaTurno, 0, @observacion )

	declare @idturno int;
	SET @idturno = @@IDENTITY  -- el ultimo identity insertado en la tabla anterior

	INSERT INTO TurnoPaciente (idTurno, idPaciente, idMedico)
	VALUES (@idturno, @idpaciente, @idmedico)
	print 'El paciente se agregó correctamente'
	return
END
ELSE
BEGIN
	print 'El paciente ya existe'
	return
END

Select * from TurnoPaciente;

SELECT * FROM Turno;
SELECT * FROM Medico;
EXEC ALTA_Turno '20190215 08:16',3,1, 'El paciente que entro un minuto despues';


DELETE FROM TurnoPaciente WHERE idTurno = 10;
DELETE FROM Turno WHERE idTurno = 10;

SELECT IDENT_CURRENT('Turno')+1;
DBCC CHECKIDENT('Turno', RESEED,8);
