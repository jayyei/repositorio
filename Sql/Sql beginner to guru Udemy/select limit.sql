use employees;

SELECT count()(*) FROM employees;

SELECT * FROM employees LIMIT 20;

SELECT * FROM employees LIMIT 0, 20;

SELECT * FROM employees ORDER BY emp_no LIMIT 0, 20; -- limita desde el primer valor a encontrar, 20 valores

SELECT * FROM employees ORDER BY emp_no LIMIT 19,20; -- limita desde el diez y seisavo valor a encontrar 20 valores 




