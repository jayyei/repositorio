-- Store Procedure es un conjunto de instrucciones sql que estan almacenadas, es decir es un sql que puedes salvar
-- para asi poder ser reutilizado (procedimiento almacenado)
-- Debe de tener un objetivo, debe de realizar algo en especifico

CREATE PROCEDURE SP_paciente (@idPaciente int)
AS
SELECT * FROM Paciente WHERE idPaciente = @idPaciente
GO

