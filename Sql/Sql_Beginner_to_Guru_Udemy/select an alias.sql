use employees;

select first_name as firstN, last_name as lastN from employees; -- aplica un alias para los nombres seleccionados en la base de datos

select first_name as 'First Name', last_name as 'Last Name' from employees; -- para dar alias mas coherentes usa unas single cuotes 