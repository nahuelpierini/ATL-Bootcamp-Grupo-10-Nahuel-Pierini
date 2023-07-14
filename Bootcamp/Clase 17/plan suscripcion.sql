CREATE TABLE `plan`
(
 `id_plan`        int NOT NULL AUTO_INCREMENT ,
 `nombre`         varchar(45) NOT NULL ,
 `desripcion`     varchar(45) NOT NULL ,
 `precio_mensual` double NOT NULL ,

PRIMARY KEY (`id_plan`)
);
CREATE TABLE `direccion`
(
 `id_direccion`  int NOT NULL AUTO_INCREMENT ,
 `pais`          varchar(45) NOT NULL ,
 `provincia`     varchar(45) NOT NULL ,
 `ciudad`        varchar(45) NOT NULL ,
 `codigo_postal` varchar(45) NOT NULL ,
 `calle`         varchar(45) NOT NULL ,
 `numero`        varchar(45) NOT NULL ,
 `datos_extra`   varchar(45) NULL ,

PRIMARY KEY (`id_direccion`)
);

CREATE TABLE `cliente`
(
 `id_cliente`   int NOT NULL AUTO_INCREMENT ,
 `nombre`       varchar(45) NOT NULL ,
 `apellido`     varchar(45) NOT NULL ,
 `email`        varchar(45) NOT NULL ,
 `telefono`     varchar(45) NOT NULL ,
 `id_direccion` int NOT NULL ,

PRIMARY KEY (`id_cliente`),
KEY `FK_1` (`id_direccion`),
CONSTRAINT `FK_5` FOREIGN KEY `FK_1` (`id_direccion`) REFERENCES `direccion` (`id_direccion`)
);
CREATE TABLE `suscripcion`
(
 `id_suscripcion`    int NOT NULL ,
 `fecha_suscripcion` datetime NOT NULL ,
 `fecha_caducidad`   datetime NOT NULL ,
 `id_cliente`        int NOT NULL ,
 `id_plan`           int NOT NULL ,

PRIMARY KEY (`id_suscripcion`),
KEY `FK_1` (`id_cliente`),
CONSTRAINT `FK_6` FOREIGN KEY `FK_1` (`id_cliente`) REFERENCES `cliente` (`id_cliente`),
KEY `FK_2` (`id_plan`),
CONSTRAINT `FK_7` FOREIGN KEY `FK_2` (`id_plan`) REFERENCES `plan` (`id_plan`)
);
