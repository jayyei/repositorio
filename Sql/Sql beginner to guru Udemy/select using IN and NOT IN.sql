use employees;

SELECT * FROM employees WHERE first_name = 'Elvis';

-- In otorga la facilidad de dar multiples resultados, similar a un OR multiple
SELECT * FROM employees WHERE first_name IN ('Elvis', 'Sumant', 'Berni', 'Lillian');

SELECT count(*) FROM employees WHERE first_name IN('Elvis', 'Sumant', 'Berni', 'Lillian');

SELECT * FROM employees WHERE first_name IN('Elvis', 'Sumant', 'Berni', 'Lillian')
AND last_name NOT IN('Maliniak', 'Sluis', 'Bouloucos', 'Warwick');

-- NOT IN es una lista de valores los cuales no se permiten, digamos un conjunto de or no permitidos 
SELECT count(*) FROM employees WHERE first_name IN('Elvis', 'Sumant', 'Berni', 'Lillian') -- El valor del nombre puede estar en alguno de los permitidos dentro del IN
AND last_name NOT IN('Redmiles', 'Feldhoffer', 'Androutsos', 'Schaar'); -- y el apellido no puede ser ninguno de los valores mencionados en el NOT IN