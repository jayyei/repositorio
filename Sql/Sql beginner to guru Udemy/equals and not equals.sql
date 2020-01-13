use employees;

SELECT * FROM employees WHERE first_name = 'Elvis'; -- equals

SELECT * FROM employees WHERE last_name = 'Elvis';

SELECT * FROM employees WHERE first_name <> 'Elvis'; -- not equals

SELECT * FROM employees WHERE first_name != 'Elvis'; -- not equals

SELECT count(*) FROM employees WHERE first_name = 'Elvis';

