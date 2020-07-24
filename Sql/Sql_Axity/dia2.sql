DESCRIBE DICTIONARY;

SELECT * FROM DICTIONARY WHERE table_name = 'USER_OBJECTS';

SELECT * FROM DICTIONARY WHERE table_name = 'ALL_OBJECTS';

SELECT object_name, object_type, created, status FROM user_objects ORDER BY object_type;

SELECT * FROM user_tables;

DESCRIBE user_tab_columns;

SELECT column_name, data_type, data_length, data_precision, data_scale, nullable from user_tab_columns
where table_name = 'EMPLOYEES';

DESCRIBE user_constraints;

DESCRIBE user_cons_columns;

SELECT constraint_name, column_name from user_cons_columns WHERE table_name = 'EMPLOYEES';

DESCRIBE user_views;

SELECT DISTINCT view_name FROM user_views;

select text from user_views where view_name = 'EMP_DETAILS_VIEW';

describe user_sequences;

select sequence_name, min_value, max_value, increment_by, last_number from user_sequences;

describe user_indexes;

select index_name, table_name, uniqueness from user_indexes where table_name = 'EMPLOYEES';

SELECT INDEX_NAME, TABLE_NAME FROM USER_INDEXES WHERE TABLE_NAME = 'EMP_LIB';

DESCRIBE user_ind_columns;

SELECT INDEX_NAME, COLUMN_NAME, TABLE_NAME FROM user_ind_columns WHERE INDEX_NAME = 'LNAME_IDX';

DESCRIBE user_synonyms;

SELECT * FROM user_synonyms;

COMMENT ON TABLE EMPLOYEES IS 'Esta es una descripcion de la informacion que presenta employees';

COMMENT ON COLUMN EMPLOYEES.first_name IS
    'ESte es un comentario de los nombres de los empleados';
    
SELECT * FROM DICTIONARY where table_name =  'USER_OBJECTS';

SELECT * from ALL_COL_COMMENTS WHERE table_name = 'EMPLOYEES';
SELECT * FROM USER_COL_COMMENTS WHERE table_name = 'EMPLOYEES';
SELECT * FROM ALL_TAB_COMMENTS WHERE table_name = 'EMPLOYEES';
SELECT * FROM USER_TAB_COMMENTS WHERE table_name = 'EMPLOYEES';

SELECT * FROM sal_history;
SELECT * FROM mgr_history;
SELECT * FROM special_sal;

SELECT employee_id, hire_date, salary, manager_id FROM employees
    where employee_id <125;

INSERT ALL 
    WHEN salary > 20000 THEN
        INTO special_sal values (employee_id, salary)
    ELSE
        INTO sal_history values (employee_id, hire_date, salary)
        INTO mgr_history values (employee_id, manager_id, salary)
SELECT employee_id, hire_date, salary, manager_id FROM employees
    where employee_id <125;
    
SELECT * FROM sales_week_data;

SELECT * FROM EMP_SALES_INFO;
