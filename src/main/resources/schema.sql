DROP TABLE CLIENTE IF EXISTS;
DROP TABLE PRODUCTO IF EXISTS;

CREATE TABLE CLIENTE (
    cuit int NOT NULL,
    nombreFantasia varchar(255) NOT NULL,
    razonSocial varchar(255),
    PRIMARY KEY (cuit)
);

CREATE TABLE PRODUCTO (
idproducto int NOT NULL AUTO_INCREMENT,
descripcion varchar(255) NOT NULL,
stock int,
precio FLOAT(5, 2),
PRIMARY KEY (idproducto)
);
