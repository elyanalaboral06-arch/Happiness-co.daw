CREATE DATABASE Happiness;
USE Happiness;



CREATE TABLE usuarios(

id INT IDENTITY(1,1) PRIMARY KEY,

nombre VARCHAR(100),

email VARCHAR (100) UNIQUE,

password VARCHAR(100)
);



CREATE TABLE eventos(
id INT IDENTITY(1,1) PRIMARY KEY,

fecha DATE,

titulo VARCHAR(100),

ubicacion VARCHAR (100),

descripcion TEXT
);


CREATE TABLE galerias(

id INT IDENTITY(1,1) PRIMARY KEY,

titulo VARCHAR(100),

 id_evento INT FOREIGN KEY  REFERENCES eventos(id)

);




CREATE TABLE imagenes_galerias(

id INT IDENTITY(1,1) PRIMARY KEY,

titulo VARCHAR(100),

imagen VARCHAR (255),

id_galeria INT FOREIGN KEY REFERENCES galerias(id)

);



CREATE TABLE favoritos (

id_usuario INT FOREIGN KEY REFERENCES usuarios(id),

id_evento INT FOREIGN KEY REFERENCES eventos(id)

);






