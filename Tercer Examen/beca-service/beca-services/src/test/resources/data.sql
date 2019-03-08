INSERT INTO login (id, user, password)
VALUES
(1, 'Javier', 'Rodriguez'),
(2, 'Javier', 'Rodriguez'),
(3, 'Javier', 'Rodriguez'),
(4, 'Javier', 'Rodriguez'),
(5, 'Javier', 'Rodriguez'),
(6, 'Javier', 'Rodriguez'),
(7, 'Javier', 'Rodriguez');

commit ;
select count(*) from login;
alter sequence login_id_seq restart with 10;
