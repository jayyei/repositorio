use employees;
-- Hay muchas maneras de aplicar formato a las fechas en mysql, he aqui solo 4 ejemplos
select * from salaries;

SELECT date_format("2017-06-15", "%M %d %Y");

SELECT from_date as original,
 DATE_FORMAT(from_date, "%M %d %Y") as version1,
 DATE_FORMAT(from_date, "%m %D %Y") as version2,
 DATE_FORMAT(from_date, "%M %D %y") as version3,
 DATE_FORMAT(from_date, "%M-%D-%Y") as version4
 
 from salaries;