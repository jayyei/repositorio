INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('andres', '$2a$10$UwdsphKSpYZWYSCGRH1LteW9fOfSq.hEgkQy6npYTtsVkCbAGyc2e', true, 'Andres', 'Guzman', 'profesor@bolsadeideas.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin', '$2a$10$cchddHCEX7W41tJg/dgSm.2zMN/06I1aPEphjJTn7LxZrApD9keOS', true, 'John', 'Doe', 'johnDoe@bolsadeideas.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER'); -- Obligatorio el prefijo ROLE_
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1,1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2,1);