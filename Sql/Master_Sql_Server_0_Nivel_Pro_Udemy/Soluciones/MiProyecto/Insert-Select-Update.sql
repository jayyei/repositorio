
use CentroMedico;


-- Instruccion de manipulacion de datos basico

-- SELECT column_name, another_column_name from TableName;
SELECT * FROM Turno;

SELECT nombre, apellido, domicilio FROM Paciente;


-- Insert into table values(val1, val2, val3);
-- Insert into table (col1, col2, col3, col4) values (val1, val2, val3, val4);
SELECT * FROM Paciente;
INSERT INTO Paciente values(3, 'Javier', 'Fernandez', '1984-02-02', 'Avenida de las asucenas',
'MEX', '23141514', 'jferrnandez@gmail.com', 'ninguna', '2015-03-12');

INSERT INTO Paciente values('Xavier', 'Lopez', '1904-02-02', 'Avenida siemprevida',
'MEX', '23331514', 'xlopez@gmail.com', 'ninguna', '1993-06-12');

-- Update tablename SET columname = change, where condition
UPDATE Paciente SET idPais='ARG' WHERE idPaciente = 3;
UPDATE Paciente SET nombre = 'Arturo', apellido = 'Sesgado' WHERE idPaciente = 4;


