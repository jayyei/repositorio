use employees;

SELECT * FROM salaries;

-- ORDER BY funciona con numeros, fechas y cadenas

SELECT * FROM salaries ORDER BY salary; -- el orden por default es ascendente, es decir, de inicio tendra los menores y al final los mayores

SELECT * FROM salaries ORDER BY salary asc; -- Por ejemplo esta linea es igual a la linea de arriba

SELECT * FROM salaries ORDER BY salary desc; -- Aquii comenzara por los mayores y al final los menores

SELECT * FROM salaries ORDER BY from_date, salary asc;

SELECT * FROM employees ORDER BY first_name asc;

SELECT * FROM employees WHERE first_name = 'Elvis' ORDER BY birth_date;

SELECT * FROM employees WHERE first_name = 'Elvis' ORDER BY gender;

SELECT * FROM employees WHERE first_name = 'Elvis' ORDER BY gender desc, birth_date desc;

SELECT * FROM employees WHERE first_name = 'Elvis' ORDER BY gender desc, birth_date desc, last_name;



