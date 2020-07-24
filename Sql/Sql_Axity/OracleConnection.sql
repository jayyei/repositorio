DESCRIBE DICTIONARY;

SELECT * FROM DICTIONARY WHERE table_name = 'USER_OBJECTS';

SELECT * FROM DICTIONARY WHERE table_name = 'ALL_OBJECTS';

SELECT object_name, object_type, created, status FROM user_objects ORDER BY object_type;

SELECT * FROM user_tables;

DESCRIBE user_tab_columns;

