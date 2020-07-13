use employees;

SELECT 
	emp_no, count(*) as emp_count
FROM
	employees
WHERE
	emp_no > 1  -- condiciones para seleccionar la data
GROUP BY emp_no -- como agrupar la data
HAVING emp_count > 0 -- condiciones para agregar funciones
ORDER BY emp_no -- como ordenar la data
LIMIT 5, 10; -- para limitar el conjunto de valores regresados