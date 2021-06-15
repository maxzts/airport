CREATE DATABASE  Airport_db2;

USE  Airport_db2;
CREATE TABLE pilot
(
id INT  AUTO_INCREMENT,
firstname VARCHAR (50) NOT NULL,
lastname VARCHAR (50) NOT NULL,
rank VARCHAR (50) NOT NULL,
code1 VARCHAR (50) UNIQUE,
PRIMARY KEY(id)
);

USE  Airport_db2;
CREATE TABLE plane
(
id INT AUTO_INCREMENT,
brand VARCHAR (50) NOT NULL,
model VARCHAR (50) NOT NULL,
number_passengers INT,
number_plane INT UNIQUE,
PRIMARY KEY(id)
);

USE  Airport_db2;
CREATE TABLE flight
(
id INT AUTO_INCREMENT,
plane_id INT,
pilot_id INT,
data_flight DATE,
time_flight TIME,
number_flight VARCHAR (50) NOT NULL UNIQUE,
FOREIGN KEY (plane_id) REFERENCES Plane(id),
FOREIGN KEY (pilot_id) REFERENCES Pilot(id),
PRIMARY KEY(id)
);
