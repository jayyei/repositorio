INSERT INTO users (id, ds_name, ds_lastname, age)
VALUES
(1, 'Javier', 'Rodriguez', 20),
(2, 'Javier', 'Rodriguez', 21),
(3, 'Javier', 'Rodriguez', 22),
(4, 'Javier', 'Rodriguez', 23),
(5, 'Javier', 'Rodriguez', 24),
(6, 'Javier', 'Rodriguez', 22),
(7, 'Javier', 'Rodriguez', 23);

commit ;
select count(*) from users;
alter sequence users_id_seq restart with 10;