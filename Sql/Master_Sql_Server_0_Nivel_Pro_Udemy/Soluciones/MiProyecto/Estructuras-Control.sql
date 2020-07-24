
-- Estructura IF

declare @idpaciente int
declare @idturno int

set @idpaciente = 4;

IF @idpaciente = 5 --si no se cumple no ejecuta la instruccion inmediata, a menos que se encierre con begin y end
 BEGIN
	set @idturno = 20
	SELECT * FROM Paciente  WHERE idPaciente = @idpaciente
	print @idturno
 END
ELSE 
 BEGIN
	set @idturno = 40;
	print 'No se cumplió la condición';
	print @idturno;
	IF EXISTS(SELECT * FROM Paciente  WHERE idPaciente = 2)
	 BEGIN
		print 'existe'
	 END
 END

