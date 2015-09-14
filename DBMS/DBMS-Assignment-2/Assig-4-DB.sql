/* Create database ZipCode*/
CREATE DATABASE ZipCode;

USE ZipCode;

/*create table states*/
CREATE TABLE States(
State_id VARCHAR(100),
State_name VARCHAR(100),
PRIMARY KEY(State_id)
);

/*create table City*/
CREATE TABLE City(
City_id VARCHAR(100),
City_name VARCHAR(100),
State_id VARCHAR(100),
PRIMARY KEY(City_id),
FOREIGN KEY(State_id) REFERENCES States(State_id) ON DELETE CASCADE ON UPDATE CASCADE
);

/*create table ZipCode*/
CREATE TABLE ZipCode(
Zipcode VARCHAR(100),
City_id VARCHAR(100),
PRIMARY KEY(Zipcode),
FOREIGN KEY(City_id) REFERENCES City(City_id) ON DELETE CASCADE ON UPDATE CASCADE
);

/*Insert into States*/
INSERT INTO States VALUES('1','RAJASTHAN'),('2','UP'),('3','GUJRAT');

/*Insert into City*/
INSERT INTO City VALUES('101','JAIPUR','1'),('102','AGRA','2'),('103','GANDHINAGAR','3');

/*Insert into ZipCode*/
INSERT INTO ZipCode VALUES('302018','101'),('112012','102'),('000860','103');
 
/* write a SQL query for that returns a Resultset containing Zip Code,
City Names and States  ordered by State Name and City Name.*/ 
SELECT z.ZipCode, c.City_name, s.State_name
FROM ZipCode z
INNER JOIN
City c
ON
z.City_id = c.City_id
INNER JOIN
States s
ON
c.State_id = s.State_id
ORDER BY c.City_name, s.State_name; 

