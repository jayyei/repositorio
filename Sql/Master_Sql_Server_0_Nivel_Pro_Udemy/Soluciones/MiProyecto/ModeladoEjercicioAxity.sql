
CREATE TABLE EMPLOYEES( 
	employee_id int NOT NULL,
	first_name varchar(50) NOT NULL,
	last_name varchar(50) NULL,
	email varchar(30) NULL,
	phone_number varchar(20) NULL,
	hire_date date NOT NULL,
	job_id int NULL,
	salary Decimal(10, 2) NOT NULL,
	commission_pct char(3) NULL,
	manager_id int NULL,
	department_id int NULL,
	CONSTRAINT PK_EMPLOYEES PRIMARY KEY (employee_id),
);

CREATE TABLE JOB_HISTORY( 
	employee_id int NOT NULL,
	started_date date NOT NULL,
	end_date date NOT NULL,
	job_id int NULL,
	department_id int NOT NULL,
	CONSTRAINT PK_JOB_HISTORY PRIMARY KEY (employee_id,started_date),
);

CREATE TABLE JOBS( 
	job_id int NOT NULL PRIMARY KEY  IDENTITY(1,1),
	job_title varchar(50) NOT NULL,
	min_salary Decimal(10, 2) NOT NULL,
	max_salary Decimal(10, 2) NOT NULL,
);

CREATE TABLE DEPARTMENTS( 
	department_id int NOT NULL PRIMARY KEY  IDENTITY(1,1),
	department_name varchar(50) NOT NULL,
	manager_id int NULL,
	location_id int NULL,
);

CREATE TABLE LOCATIONS( 
	location_id int NOT NULL PRIMARY KEY  IDENTITY(1,1),
	street_address varchar(50) NOT NULL,
	postal_code int NOT NULL,
	city varchar(50) NOT NULL,
	state_province varchar(50) NOT NULL,
	country_id int NULL,
);

CREATE TABLE COUNTRIES( 
	country_id int NOT NULL PRIMARY KEY  IDENTITY(1,1),
	country_name varchar(50) NOT NULL,
	region_id int NULL,
);

CREATE TABLE REGIONS( 
	region_id int NOT NULL PRIMARY KEY  IDENTITY(1,1),
	region_name varchar(50) NOT NULL,
);

CREATE TABLE JOB_GRADES( 
	grade_level varchar(50) NOT NULL,
	lowest_sal varchar(50) NOT NULL,
	highest_sal varchar(50) NOT NULL,
);