use employees;

SELECT RIGHT('asdf', 1); -- Selecciona partiendo de la derecha la cantidad de caracteres mencionados de la cadena dada 
SELECT LEFT('asdf', 2); -- Selecciona partiendo de la izquierda, la cantidad de caracteres mencionados de la cadena dada

SELECT * from employees;

SELECT first_name, last_name, concat( LEFT(first_name, 1), LEFT(last_name, 1) ) as initials from employees;