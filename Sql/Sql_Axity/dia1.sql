

grant select on employees to ora2;

grant select, insert, update, delete on countries to ora2;

revoke select, insert, update, delete on countries from ora2;

drop table dept2;

create table dept2(
    Id number(7) generated always as identity (
        START WITH 1 
        INCREMENT BY 1 
        MAXVALUE 10000 
        CACHE 10 
        CYCLE) primary key using index (create index dept2_idx ON dept2(id)),
    Name varchar2(25)
);

SELECT * FROM DEPARTMENTS;



insert into dept2(name) values ('Contracting'); --uno por cada registro de departments


create table EMP2 (
    Id number(7) generated always as identity (
        START WITH 1 
        INCREMENT BY 1 
        MAXVALUE 10000 
        CACHE 10 
        CYCLE) primary key using index (create index emp2_idx ON EMP2(id)),
    Last_name varchar2(25),
    First_name varchar2(25),
    Dept_id number(7)
);

ALTER table EMP2
    add CONSTRAINT emp_mgr_fk 
        FOREIGN KEY (Dept_id)
        REFERENCES dept2(id);

ALTER table EMP2
    modify last_name varchar2(50);
    
SELECT * FROM DEPARTMENTS;

create table EMPLOYEES_2 (
    Id number(6) generated always as identity (
        START WITH 1 
        INCREMENT BY 1 
        MAXVALUE 10000 
        CACHE 10 
        CYCLE) primary key using index (create index emyees2_idx ON EMPLOYEES_2(Id)),
    FIRST_NAME varchar2(20),
    LAST_NAME varchar2(20),
    SALARY number(8,2),
    DEPT_ID number(4,0)
);

Drop table EMP2;

SELECT * FROM recyclebin;

FLASHBACK TABLE EMP2 TO BEFORE DROP;

ALTER TABLE EMPLOYEES_2 
    drop column FIRST_NAME;
    
ALTER TABLE EMPLOYEES_2
    set UNUSED COLUMN DEPT_ID;

ALTER TABLE EMPLOYEES_2
    drop unused COLUMNS;
        
ALTER TABLE EMP2
    DROP PRIMARY KEY;
    
ALTER TABLE EMP2
    ADD CONSTRAINT my_emp_id_pk PRIMARY KEY(Id);
    
ALTER TABLE DEPT2
    DROP PRIMARY KEY;

ALTER TABLE DEPT2
    ADD CONSTRAINT my_dept_id_pk PRIMARY KEY(Id);


ALTER TABLE EMP2
    ADD  COMMISSION number(2,2);
    
ALTER TABLE EMP2
    ADD CONSTRAINT check_const CHECK (COMMISSION > 0);

DROP TABLE EMP2 PURGE;

DROP TABLE DEPT2 PURGE;
SELECT * FROM recyclebin;