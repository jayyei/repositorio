use employees;

SELECT * FROM salaries;

SELECT count(*) FROM salaries;

SELECT * FROM salaries WHERE salary > 66961;

SELECT count(*) from salaries WHERE salary > 66961;

SELECT * FROM salaries WHERE salary < 66961;

SELECT count(*) FROM salaries WHERE salary < 66961;

SELECT * FROM salaries WHERE salary > 66961 AND from_date > '1989-06-25';

SELECT count(*) FROM salaries WHERE salary > 66961 AND from_date > '1989-06-25';

-- utiliza el greater than o less than en casos numericos o de fechas, en cadenas no
