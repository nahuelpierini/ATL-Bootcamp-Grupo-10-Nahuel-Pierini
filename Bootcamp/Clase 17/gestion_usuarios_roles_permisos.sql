
CREATE TABLE `usuario`
(
 `id_usuario`     int NOT NULL AUTO_INCREMENT ,
 `nombre`         varchar(45) NOT NULL ,
 `apellido`       varchar(45) NOT NULL ,
 `email`          varchar(45) NOT NULL ,
 `telefono`       varchar(45) NOT NULL ,
 `contrasena`     varchar(45) NOT NULL ,
 `fecha_registro` date NOT NULL ,

PRIMARY KEY (`id_usuario`)
);
CREATE TABLE `rol`
(
 `id_rol`      int NOT NULL AUTO_INCREMENT ,
 `nombre`      varchar(45) NOT NULL ,
 `descripcion` varchar(100) NOT NULL ,

PRIMARY KEY (`id_rol`)
);

CREATE TABLE `permiso`
(
 `id_permiso`  int NOT NULL AUTO_INCREMENT ,
 `nombre`      varchar(45) NOT NULL ,
 `descripcion` varchar(100) NOT NULL ,

PRIMARY KEY (`id_permiso`)
);
CREATE TABLE `rol_permiso`
(
 `id_rol_permiso` int NOT NULL AUTO_INCREMENT ,
 `id_rol`         int NOT NULL ,
 `id_permiso`     int NOT NULL ,

PRIMARY KEY (`id_rol_permiso`),
KEY `FK_1` (`id_rol`),
CONSTRAINT `FK_3` FOREIGN KEY `FK_1` (`id_rol`) REFERENCES `rol` (`id_rol`),
KEY `FK_2` (`id_permiso`),
CONSTRAINT `FK_4` FOREIGN KEY `FK_2` (`id_permiso`) REFERENCES `permiso` (`id_permiso`)
);
CREATE TABLE `usuario_rol`
(
 `id_usuario_rol` int NOT NULL AUTO_INCREMENT ,
 `id_rol`         int NOT NULL ,
 `id_usuario`     int NOT NULL ,

PRIMARY KEY (`id_usuario_rol`),
KEY `FK_1` (`id_usuario`),
CONSTRAINT `FK_1` FOREIGN KEY `FK_1` (`id_usuario`) REFERENCES `usuario` (`id_usuario`),
KEY `FK_2` (`id_rol`),
CONSTRAINT `FK_2` FOREIGN KEY `FK_2` (`id_rol`) REFERENCES `rol` (`id_rol`)
);


