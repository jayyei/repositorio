use employees;

SELECT DISTINCT first_name FROM employees; -- SeleccionA solo los valores distintos de la tabla empleados SOLO LOS VALORES DISTINTOS

SELECT count( DISTINCT first_name) FROM employees;

SELECT DISTINCT birth_date from employees;

SELECT count(DISTINCT birth_date) from employees;