use employees;

SELECT * FROM titles WHERE to_date is null;

SELECT * FROM information_schema.PLUGINS WHERE PLUGIN_LIBRARY IS NULL; -- para encontrar coincidencias con null se ocupa es IS NULL

SELECT * FROM information_schema.PLUGINS WHERE PLUGIN_LIBRARY IS NOT NULL; -- para encontrar coincidencias con no nullos es IS NOT NULL