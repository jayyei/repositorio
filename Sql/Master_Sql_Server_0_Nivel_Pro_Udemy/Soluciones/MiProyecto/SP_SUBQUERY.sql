CREATE PROCEDURE SP_SUBQUERY @Descripcion varchar(30)
AS
SELECT * FROM Turno where estadoTurno in (
	SELECT idEstado FROM TurnoEstado WHERE descripcion like @Descripcion
)
