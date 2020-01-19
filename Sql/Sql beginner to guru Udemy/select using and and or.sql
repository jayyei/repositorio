use employees;

SELECT count(*) from employees WHERE first_name = 'Elvis';

SELECT * FROM employees WHERE first_name = 'Elvis' AND gender = 'M';

SELECT count(*) FROM employees WHERE first_name = 'Elvis' AND gender = 'M';

SELECT * FROM employees WHERE first_name = 'Elvis' and last_name = 'Velasco';

SELECT * FROM employees WHERE first_name = 'Elvis' and last_name = 'Velasco'
OR first_name = 'Chenye' and last_name = 'Velasco';