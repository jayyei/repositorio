/*create table Test (                      
idtest serial primary key not null,
nombre varchar(20),
telefono varchar(10))

select * from Test

insert into Test (nombre, telefono) values ('Jay', '5581669223');
insert into Test (nombre, telefono) values ('Yei', '5518561849');
insert into Test (nombre, telefono) values ('Jayson', '5544887910');*/

--select * from test;
--delete from test  //vacia la tabla en particular, no la borra
--drop table Test  //Borra la tabla completamente

--truncate table test // hace lo mismo que el delete
--truncate table test restart identity //Vacia la tabla pero resetea el autoincremental

--insert into test (nombre) values ('Alfredo')


/*create table test(
idtest serial primary key not null,
	nombre varchar(20),
	Telefono varchar(11) default 'Desconocido'  --Define a telefono con un dato por default
)*/

/*create table Planilla(
nombre varchar (50),
nid serial primary key not null,
salario integer)*/

--select * from Planilla
--select nombre, salario, (salario + 1500) as bono from Planilla //Crea una columna calculada, por default esta es solo visible

--insert into planilla (nombre, salario) values ('Jayson', '5900')

--update planilla set salario = salario + 1500 where Nombre = 'Jayson'
/*
create table persona(
idpersona serial primary key not null,
cedula integer
)

alter table persona
add column test varchar(50)

select * from persona

alter table persona 
add column nombre varchar (20)

insert into persona (nombre, cedula) values ('Jay', '1542412')
insert into persona (nombre, test) values ('Jayson', '1524821')
insert into persona (nombre, cedula, test) values ('Jaysona', '154123142', 'Mytest')

update persona set test = 'Mytest' where idpersona = 2
update persona set cedula = '1542413' where idpersona = 3

select* from persona order by nombre desc, idpersona asc
*/
select * from persona
where nombre like '%n' //a la izquierda hay texto, a la derecha no

select * from persona
where nombre like '%n%' //A la izquierda hay texto, a la derecha tambien

select * from persona
where nombre like 'J%' //A la izquierda no hay texto, a la deerecha si

select * from persona
where nombre like '%n_' //A la izquierda hay texto, a la derecha solo una letra, no se sabe cual