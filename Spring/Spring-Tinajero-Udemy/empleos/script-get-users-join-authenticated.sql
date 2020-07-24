use empleosdb;

select * from users;
 
-- el prefijo "{noop}" es obligatorio especificarlo para decirle a spring security que no esta encriptado

SELECT * FROM usuarios;

SELECT * FROM usuarioperfil;

SELECT * FROM perfiles;

select u.username, p.perfil from usuarioperfil up 
					 INNER JOIN usuarios u on u.id = up.idUsuario 
					 INNER JOIN perfiles p on p.id = up.idPerfil
					 WHERE u.username='jayyei';
                     
SELECT username, password, estatus FROM usuarios WHERE username='jayyei';

UPDATE usuarios SET username ='jayyei';  -- Nota a futura, sin el where no se realizan los update ni los delete

UPDATE usuarios SET password = concat("{noop}", password) where id = 6;

UPDATE usuarios SET `password` = '321' where id = 5;