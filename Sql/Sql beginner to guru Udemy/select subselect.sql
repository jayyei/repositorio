use employees;

SELECT DISTINCT first_name from employees WHERE first_name LIKE 'E%';

SELECT -- Este es un claro ejemplo de un subSelect
    *
FROM
    employees
WHERE
    first_name IN (SELECT DISTINCT
            first_name
        FROM
            employees
        WHERE
            first_name LIKE 'E%');