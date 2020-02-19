SELECT * FROM productos WHERE descripcion LIKE 's%'; -- Este operador es sensitivo
SELECT * FROM productos WHERE descripcion ILIKE 's%'; -- Este operador no es sentivo
SElECT * FROM productos WHERE descripcion NOT LIKE 'S%'; --este operador es contrario a los dos y es sensitivo