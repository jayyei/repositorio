/*SELECT clientes.nombrecia, ordenes.descuento, empleados.nombre
FROM clientes
INNER JOIN ordenes
	ON clientes.clienteid = ordenes.clienteid
INNER JOIN empleados
	ON ordenes.empleadoid = empleados.empleadoid;*/
	
select a.nombrecia, b.descuento, c.nombre
from clientes a, ordenes b, empleados c
where a.clienteid=b.clienteid
and b.empleadoid = c.empleadoid;