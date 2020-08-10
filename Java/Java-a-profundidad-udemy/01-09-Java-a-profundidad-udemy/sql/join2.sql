SELECT clientes.clienteid, clientes.nombrecia, ordenes.clienteid,
	   ordenes.descuento, ordenes.empleadoid, empleados.empleadoid, empleados.nombre
FROM clientes
LEFT OUTER JOIN ordenes
	ON clientes.clienteid=ordenes.clienteid
LEFT OUTER JOIN empleados
	ON ordenes.empleadoid=empleados.empleadoid;