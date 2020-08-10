
SELECT * FROM personas;

INSERT INTO personas (nombre_persona, nac_persona, edad_persona, salario_persona)
VALUES ('Javier', 'Mexicano', 45, 56000.00);

INSERT INTO personas (nombre_persona, nac_persona, edad_persona, salario_persona)
VALUES ('Raul', 'Argentino', 40, 33000.00);

UPDATE personas SET nac_persona = 'Brasileno' WHERE id_persona = 3;

UPDATE personas SET edad_persona = 24 WHERE id_persona =3;

UPDATE personas SET nac_persona = 'Austrialiano', edad_persona = 28, salario_persona = 22000.00
WHERE id_persona = 1;