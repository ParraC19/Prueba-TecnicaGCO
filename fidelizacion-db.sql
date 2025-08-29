create database fidelizacion_db;

use fidelizacion_db;


CREATE TABLE paises (
id_pais int primary key auto_increment,
pais varchar(100) NOT NULL
);

CREATE TABLE departamentos (
id_departamento int primary key auto_increment,
departamento varchar(100) NOT NULL,
pais int,
FOREIGN KEY (pais) REFERENCES paises(id_pais)
);

CREATE TABLE ciudades (
id_ciudad int primary key auto_increment,
ciudad varchar(100) NOT NULL,
departamento int,
FOREIGN KEY (departamento) REFERENCES departamentos(id_departamento)
);

CREATE TABLE tipos_identificacion (
id_tipo_identificacion int primary key auto_increment,
tipo_identificacion varchar(100) NOT NULL
);

CREATE TABLE marcas (
id_marca int primary key auto_increment,
marca varchar(100) NOT NULL
);



CREATE TABLE clientes (
id_cliente int auto_increment PRIMARY KEY,
tipo_identificacion int NOT NULL,
numero_identificacion varchar(30) NOT NULL,
nombre varchar(50) NOT NULL,
apellidos varchar(50) NOT NULL,
fecha_nacimiento date NOT NULL,
direccion varchar(200) NOT NULL,
ciudad int NOT NULL,
FOREIGN KEY (tipo_identificacion) REFERENCES tipos_identificacion(id_tipo_identificacion),
FOREIGN KEY (ciudad) REFERENCES ciudades(id_ciudad),
UNIQUE (tipo_identificacion, numero_identificacion)
);


CREATE TABLE fidelizacion (
id_fidelizacion int auto_increment PRIMARY KEY,
id_cliente int NOT NULL,
id_marca int NOT NULL,
FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente),
FOREIGN KEY (id_marca) REFERENCES marcas(id_marca)
);

INSERT INTO tipos_identificacion (tipo_identificacion) VALUES 
('Cedula'),
('Extrangeria');

INSERT INTO marcas (marca) VALUES 
('Americanino'),
('American Eagle'),
('Chevignon'),
('Esprit'),
('Naf Naf'),
('Rifle');

INSERT INTO paises (pais) VALUES
('Colombia'),
('Estados Unidos');

INSERT INTO departamentos (departamento, pais) VALUES
('Amazonas', 1),
('Antioquia', 1),
('Arauca', 1),
('Atlántico', 1),
('Bolívar', 1),
('Boyacá', 1),
('Caldas', 1),
('Caquetá', 1),
('Casanare', 1),
('Cauca', 1),
('Cesar', 1),
('Chocó', 1),
('Córdoba', 1),
('Cundinamarca', 1),
('Guainía', 1),
('Guaviare', 1),
('Huila', 1),
('La Guajira', 1),
('Magdalena', 1),
('Meta', 1),
('Nariño', 1),
('Norte de Santander', 1),
('Putumayo', 1),
('Quindío', 1),
('Risaralda', 1),
('San Andrés, Providencia y Santa Catalina', 1),
('Santander', 1),
('Sucre', 1),
('Tolima', 1),
('Valle del Cauca', 1),
('Vaupés', 1),
('Vichada', 1),
('Alabama', 2),
('Alaska', 2),
('Arizona', 2),
('Arkansas', 2),
('California', 2),
('Colorado', 2),
('Connecticut', 2),
('Delaware', 2),
('Florida', 2),
('Georgia', 2),
('Hawái', 2),
('Idaho', 2),
('Illinois', 2),
('Indiana', 2),
('Iowa', 2),
('Kansas', 2),
('Kentucky', 2),
('Luisiana', 2),
('Maine', 2),
('Maryland', 2),
('Massachusetts', 2),
('Míchigan', 2),
('Minnesota', 2),
('Misisipi', 2),
('Misuri', 2),
('Montana', 2),
('Nebraska', 2),
('Nevada', 2),
('Nueva Hampshire', 2),
('Nueva Jersey', 2),
('Nuevo México', 2),
('Nueva York', 2),
('Carolina del Norte', 2),
('Dakota del Norte', 2),
('Ohio', 2),
('Oklahoma', 2),
('Oregón', 2),
('Pensilvania', 2),
('Rhode Island', 2),
('Carolina del Sur', 2),
('Dakota del Sur', 2),
('Tennessee', 2),
('Texas', 2),
('Utah', 2),
('Vermont', 2),
('Virginia', 2),
('Washington', 2),
('Virginia Occidental', 2),
('Wisconsin', 2),
('Wyoming', 2);

INSERT INTO ciudades (ciudad, departamento) VALUES
('Leticia', 1),
('Medellín', 2),
('Arauca', 3),
('Barranquilla', 4),
('Cartagena de Indias', 5),
('Tunja', 6),
('Manizales', 7),
('Florencia', 8),
('Yopal', 9),
('Popayán', 10),
('Valledupar', 11),
('Quibdó', 12),
('Montería', 13),
('Bogotá', 14),
('Inírida', 15),
('San José del Guaviare', 16),
('Neiva', 17),
('Riohacha', 18),
('Santa Marta', 19),
('Villavicencio', 20),
('Pasto', 21),
('Cúcuta', 22),
('Mocoa', 23),
('Armenia', 24),
('Pereira', 25),
('San Andrés', 26),
('Bucaramanga', 27),
('Sincelejo', 28),
('Ibagué', 29),
('Cali', 30),
('Mitú', 31),
('Puerto Carreño', 32),
('Montgomery', 33),
('Juneau', 34),
('Phoenix', 35),
('Little Rock', 36),
('Sacramento', 37),
('Denver', 38),
('Hartford', 39),
('Dover', 40),
('Tallahassee', 41),
('Atlanta', 42),
('Honolulu', 43),
('Boise', 44),
('Springfield', 45),
('Indianapolis', 46),
('Des Moines', 47),
('Topeka', 48),
('Frankfort', 49),
('Baton Rouge', 50),
('Augusta', 51),
('Annapolis', 52),
('Boston', 53),
('Lansing', 54),
('Saint Paul', 55),
('Jackson', 56),
('Jefferson City', 57),
('Helena', 58),
('Lincoln', 59),
('Carson City', 60),
('Concord', 61),
('Trenton', 62),
('Santa Fe', 63),
('Albany', 64),
('Raleigh', 65),
('Bismarck', 66),
('Columbus', 67),
('Oklahoma City', 68),
('Salem', 69),
('Harrisburg', 70),
('Providence', 71),
('Columbia', 72),
('Pierre', 73),
('Nashville', 74),
('Austin', 75),
('Salt Lake City', 76),
('Montpelier', 77),
('Richmond', 78),
('Olympia', 79),
('Charleston', 80),
('Madison', 81),
('Cheyenne', 82);
