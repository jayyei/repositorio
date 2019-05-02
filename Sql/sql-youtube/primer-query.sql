--create table persona(
--					idPersona int not null,
--					nombre varchar(20),
--					cedula varchar(10)
--)

--insert into persona values ('1', 'Primero', '111')
--insert into persona (idpersona, nombre) values ('2', 'Segundo')
--insert into persona values ('3', 'tercero', '113')
--insert into persona (idpersona) values ('4');
--insert into persona (idpersona, cedula) values ('5','115');
--update persona set nombre = 'cuarto' where idpersona = '4';
--update persona set nombre = 'quinto', cedula = '115' where idpersona = '5';
--update persona set cedula = '112' where idpersona = '2';
--update persona set cedula = '114' where idpersona = '4' and nombre = 'cuarto';
--select * from persona;
--select (nombre, cedula) from persona
--select (nombre) as nombre, cedula from persona
--select nombre from persona where idpersona = '3';
--select nombre, cedula from persona where idpersona = '3' or idpersona = '4';
--select *from persona where idpersona > 2 and nombre = 'tercero' or nombre = 'cuarto';
--select *from persona where idpersona <= 3 and cedula >= '111';
--delete from persona where idpersona = '3';
--delete from persona where nombre = 'quinto';
--delete from persona where cedula = '114';
 
 /* esto es un bloque de codigo comentado
 favor de ignorarlo por completo
 gracias  */
 
 /*alter table persona
 add column test varchar (255) */
 
 select * from persona;
 --alter table persona rename column test to test2
 --alter table persona drop column test2
 
 --alter table persona add column test varchar (255)
 --update  persona set test = 'no nulo';
 
 /*alter table persona
 alter column test set not null;
 
 alter table persona 
 alter column test drop not null;
 
 alter table persona 
 alter column test type varchar (49); */
 
 /*alter table persona
 add primary key (idpersona)*/
 
 --insert into persona values ('3', 'tercero', '113','test')
 --insert into persona values ('4', 'cuarto', '114', 'test')
 
/* create table test (
 		idtest serial primary key not null,
 		nombre varchar(50),
 		telefono varchar(10)
 )*/
 
 select * from persona;
--insert into test (nombre, telefono) values ('jay', '5591669223');
--insert into test (nombre, telefono) values ('Vanessa', '5566447780');
--insert into test (nombre, telefono) values ('pollito', '5512364897');
--delete from test
--drop table test

--ALTER TABLE public.persona ADD dx_username_v7 VARCHAR(100)
--ALTER TABLE public.persona ADD dx_url VARCHAR(255)
