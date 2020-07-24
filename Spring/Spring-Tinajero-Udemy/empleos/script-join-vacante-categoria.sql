SELECT v.id, v.nombre, c.nombre from vacantes v
INNER JOIN Categorias c ON (c.id = v.idCategoria)
ORDER BY v.id DESC; -- el ON es usado para especificar una condicion, puede ser cambiado por el where

use empleosdb;

SELECT * FROM vacantes;

SELECT * FROM perfiles;

SELECT * FROM usuarios;

SELECT * FROM usuarioperfil;

SELECT * FROM vacantes WHERE destacado = 1 AND estatus = "Aprobada";

SELECT * FROM vacantes WHERE salario between 7000 and 9000;

SELECT * FROM vacantes WHERE salario between 7000 and 9000 order by salario desc;

SELECT * from categorias;
