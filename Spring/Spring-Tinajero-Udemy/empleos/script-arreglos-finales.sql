use empleosdb;
select * from perfiles;
select * from usuarios;
select * from usuarioperfil;
select * from categorias;
select * from vacantes v left outer join categorias c on v.idCategoria = c.id;

select * from solicitudes;
delete from solicitudes where id = 4;

alter table solicitudes auto_increment = 1;

ALTER TABLE solicitudes MODIFY COLUMN id  int not null auto_increment;

update usuarios set password = concat('{noop}', password) where id = 7;