
-- Operadores artiméticos +-/*%

declare @num1 decimal(9,2) = 20;
declare @num2 decimal(9,2) = 30;
declare @result decimal(9,2)

set @result = @num1 + @num2;

set @result = @num1 - @num2;

set @result = @num1 / @num2;

set @result = @num1 * @num2;

set @result = @num2 % @num1; --Devuele el residuo (el resto de la division)

print @result

declare @text1 varchar(15) = 'Hola me llamo'; --Si la cadena sobrepasa la capacidad de la declaracion, se hace un truncate

declare @text2 varchar(15) = 'Mariano';

declare @concatenado  varchar(22);

set @concatenado = @text1 + ' ' + @text2;

print @concatenado

-- Operadores de comparacion > < =

if @num2 > @num1
BEGIN
	print 'SI'
END

if @num1 <= @num1
BEGIN
	print 'Que onda'
END

if @num1 <> @num2 -- operador distinto
BEGIN
	print 'Es distinto de'
END

if @num1 != @num2 -- otra manera de indicar el operador distinto
BEGIN
	print 'otro es distinto'
END

if @text1 < @text2 --Aplica el caso del orden alafapetico de la cadena, no de la longitud de la misma	
	print 'Text1 > Text2'
