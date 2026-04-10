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





INSERT INTO eventos (fecha,titulo,ubicacion,descripcion)
VALUES 

('2026-01-01','Llegada del año nuevo','Galicia','Un día lleno de música y diversión'),

('2026-01-12', 'Conferencia de bienestar','Madrid','Aprende sobre salud mental'),

('2026-01-24','Exposicion de fotografia','Madrid','Una exposición de fotografía que celebra la belleza de la vida cotidiana y la importancia de encontrar momentos de felicidad en las pequeñas cosas

'),

('2026-02-06','Estreno de pelicula','Barcelona','Película inspriradora sobre la busqueda de la felicidad'),

('2026-06-05','Exposicion de arte','Salamanca','Disfruta de una selección de obras de arte local'),

('2026-06-15', 'Festival happiness','Madrid','Celebración de la felicdad con música, comida y muchas actividades para la familia'),

('2026-06-25','Concierto primavera','Tarragona','Disfruta de música en vivo'),



('2026-07-28','Cine al aire libre', 'Galicia','Disfruta de una variedad de películas clásicas al aire libre');






INSERT INTO usuarios (nombre,email,password) VALUES 

('Ana Lopez Vega', 'ana@email.com','1234'),

('Carlos Perez García','carlos@email.com', '1234'),

('Gabriel Fernández Burgos','gabriel@email.com','1234');


INSERT INTO galerias (titulo,id_evento) VALUES
('Galeria Llegada del año nuevo', 1),

('Galeria Conferencia de bienestar',2),

('Galeria Exposicion de fotografia', 3);




INSERT INTO imagenes_galerias (titulo,imagen,id_galeria) VALUES

('Llegada del año nuevo 1','tradiciones-ano-nuevo-1.webp',1),

('Llegada del año nuevo 2','tradiciones-ano-nuevo-1.web',1),

('Llegada del año nuevo 3','tradiciones-ano-nuevo-1.web',1),



('Conferencia de bienestar 1', 'ilustracion-conferencia-medica_23-2148904006.avif',2),

('Conferencia de bienestar 2', 'ilustracion-conferencia-medica_23-2148904006.avif',2),

('Conferencia de bienestar 3', 'ilustracion-conferencia-medica_23-2148904006.avif',2),


('Exposicion de fotografia 1','Poble-exposicion.webp', 3),

('Exposicion de fotografia 1','Poble-exposicion.webp', 3),

('Exposicion de fotografia 1','Poble-exposicion.webp', 3);



INSERT INTO favoritos VALUES

(1,1),(1,2),(1,4),

(2,2),(2,3),(2,5),

(3,1),(3,3),(3,6);


GO
CREATE VIEW galerias_pasadas 
AS
SELECT g.*
FROM galerias g
JOIN eventos e ON g.id_evento = e.id
WHERE e.fecha < '2026-02-28';


GO

CREATE VIEW favoritos_usuario1 AS

SELECT e.*
FROM eventos e
JOIN favoritos f ON e.id = f.id_evento

WHERE f.id_usuario = 1;


GO

CREATE VIEW imagenes_evento2 AS
SELECT i.*
FROM imagenes_galerias i
JOIN galerias g ON i.id_galeria = g.id
WHERE g.id_evento = 2;

GO
CREATE VIEW favoritos_usuario2_futuros AS
SELECT e.*
FROM eventos e
JOIN favoritos f ON e.id = f.id_evento
WHERE f.id_usuario = 2
AND e.fecha > '2026-02-28';

GO