
-- Bucle While 

declare @contador int = 0;

WHILE @contador <= 2
 BEGIN
	print 'Conteo';
	print @contador;
	set @contador = @contador + 1;
 END

declare @conteo int = 3;

WHILE @conteo >= 0
 BEGIN
	print @conteo
	set @conteo = @conteo -1
 END