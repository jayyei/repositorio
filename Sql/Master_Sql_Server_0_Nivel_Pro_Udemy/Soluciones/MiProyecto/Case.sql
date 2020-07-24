-- El condicional case
	
declare @valor int
declare @resultado char(10) = '';

set @valor = 20;

	-- la sentencia case se utiliza para retornar un valor en una condicion dada
	set @resultado = (CASE WHEN @valor = 10
							THEN 'es 10'
						   WHEN @valor = 20
							THEN 'es 20'
						   WHEN @valor = 30
							THEN 'es 30'
					 END);

print @resultado

select *, (CASE WHEN estadoTurno = 1 THEN 'VERDE'
				WHEN estadoTurno = 2 THEN 'AZUL'
				WHEN estadoTurno = 3 THEN 'AMARILLO'
				ELSE 'GRIS'
				END) as colorTurno
from Turno;