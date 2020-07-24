-- return utilizado para salir del store procedure o de sentencias de control

declare @i int = 0;

WHILE @i <= 10
BEGIN
	print @i
	set @i = @i +1
	if @i = 4
	return  -- En este caso return rompe con el ciclo, y lo para en la cuarta iteracion, no ejecutara las instrucciones siguientes del while
END;
print 'hola'

-- break rompe con el ciclo pero permite que las instrucciones (despues del ciclo) continuen

declare @j int = 0;

WHILE @j <= 10
BEGIN
	print @j
	set @j = @j +1;
	if @j = 6
		BREAK;
END
print 'hola'

--try catch

BEGIN TRY
	set @j = 'Hola';
END TRY
BEGIN CATCH
	print 'hubo broncas'
END CATCH