
create proc ALTA_Paciente(
				@dni varchar(20),
				@nombre varchar(50), 
				@apellido varchar(50),
				@fechaNacimiento varchar(8),
				@domicilio varchar(50),
				@idpais char(3),
				@telefono varchar(20),
				@email varchar(30),
				@observacion varchar(1000)=''
				)
as

IF NOT EXISTS(SELECT * FROM Paciente Where dni = @dni)
BEGIN
	INSERT INTO Paciente (dni,nombre, apellido, fechaNacimiento, domicilio, idPais, telefono, email, observacion, fechaAlta)
	VALUES (@dni, @nombre, @apellido, @fechaNacimiento, @domicilio, @idpais, @telefono, @email, @observacion, GETDATE() )
	
	print 'El paciente se agregó correctamente'
	return
END
ELSE
BEGIN
	print 'El paciente ya existe'
	return
END

exec ALTA_Paciente '2345', 'jorge', 'lopez', '20180518', 'calle 1', 'ARG', '', 'jorgelop@gmail.com', ''


select * from Paciente;
