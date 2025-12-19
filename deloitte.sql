-- SQL (MySQL) – Core Topics List (4 Hours)
-- 	1	SQL & RDBMS Overview
-- 	2	Database, Schema, Tables, Rows, Columns
-- 	3	Data Types in MySQL
-- 	4	DDL Commands
-- 	◦	CREATE
-- 	◦	ALTER
-- 	◦	DROP
-- 	◦	TRUNCATE
-- 	5	DML Commands
-- 	◦	INSERT
-- 	◦	UPDATE
-- 	◦	DELETE
-- 	6	SELECT Statement
-- 	◦	SELECT *
-- 	◦	SELECT specific columns
-- 	7	WHERE Clause
-- 	◦	AND, OR
-- 	◦	IN, BETWEEN
-- 	◦	LIKE
-- 	◦	IS NULL
-- 	8	ORDER BY
-- 	9	LIMIT
-- 	10	Aggregate Functions
-- 	◦	COUNT
-- 	◦	SUM
-- 	◦	AVG
-- 	◦	MIN
-- 	◦	MAX
-- 	11	GROUP BY
-- 	12	HAVING
-- 	14	Primary Key
-- 	15	Foreign Key
-- 	16	Constraints
-- 	◦	NOT NULL
-- 	◦	UNIQUE
-- 	18	Transactions
-- 	◦	START TRANSACTION
-- 	◦	COMMIT
-- 	◦	ROLLBACK
-- 	19	ACID Properties
-- 	20	SQL Best Practices (brief)





-- select sysdate();

-- SQL - Structured Query Language 
-- databses - RDBMS 
-- Oracle, MySQL, SQL Server, PostgreSQL, DB2, H2, ...

-- tables - columns (limited), rows == records == tuples 

-- DDL 
-- CREATE, DROP, ALTER, TRUNCTE 

-- CREATE TABLE employees (id, name, salary);

-- DROP TABLE employees;-- 

-- ALTER TABLE employees ADD COLUMN (department );

-- DML 
-- INSERT UPDATE DELETE 

-- DRL 
-- SELECT 

-- DCL 
-- GRANT REVOKE 

-- create table 


-- create table t1 (c1 INT, c2 varchar(10));

-- INSERT INTO t1 (c1, c2) VALUES (10, 'abc');
-- INSERT INTO t1 (c1, c2) VALUES (20, 'def');
-- INSERT INTO t1 (c1, c2) VALUES (10, 'abc');

-- SELECT * FROM t1;

-- Constraints == validations == rules == conditions 

CREATE TABLE employees (
id INT PRIMARY KEY, 
name VARCHAR(100), 
salary DOUBLE 
);

SELECT * FROM employees;

INSERT INTO employees (id, name, salary) VALUES
(101, 'Sonu', 90000), 
(102, 'Monu', 95000)
;

-- INSERT INTO employees (id, name, salary) VALUES (101, 'Sonu', 90000);
-- INSERT INTO employees (id, name, salary) VALUES (NULL, 'Sonu', 90000);

INSERT INTO employees (id, name, salary) VALUES (103, 'Tonu', 92000);










