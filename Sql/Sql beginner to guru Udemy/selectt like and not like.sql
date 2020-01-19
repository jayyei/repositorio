use employees;

SELECT * FROM employees;

SELECT * FROM employees WHERE first_name LIKE 'E%'; -- like como inidcativo para indicar que una cadena sea como
-- el comodin % indica que la cadena pue4de comenzar con cierto patron (una letra, o un conjunto de letras)

SELECT * FROM employees WHERE first_name LIKE 'ELV%' AND last_name LIKE '_e%'; -- El caracter guion bajo expresa que ahi puede ir cualquier caracter, pero seguido de una e como es este caso

SELECT * FROM employees WHERE first_name LIKE 'ELV%' AND last_name LIKE '_e%'
AND last_name NOT LIKE '%N'; -- El comodin %puede ir antes de la expresion indicando que la coincidencia aplique al final de la cadena