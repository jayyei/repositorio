SELECT * FROM productos WHERE proveedorid IN(10,20,50); -- es un operador reducido que agrupa el resultado de un conjunto de or's

SELECT * FROM productos WHERE preciounit BETWEEN 8.0 AND 20.0; -- operador de rango, es muy bonito