CREATE TABLE `categoria`
(
 `id_categoria` int NOT NULL AUTO_INCREMENT ,
 `nombre`       varchar(45) NOT NULL ,

PRIMARY KEY (`id_categoria`)
);
CREATE TABLE `etiqueta`
(
 `id_etiqueta` int NOT NULL AUTO_INCREMENT ,
 `nombre`      varchar(45) NOT NULL ,

PRIMARY KEY (`id_etiqueta`)
);
CREATE TABLE `foto`
(
 `id_foto`       int NOT NULL AUTO_INCREMENT ,
 `nombre`        varchar(45) NOT NULL ,
 `id_categoria`  int NOT NULL ,
 `titulo`        varchar(45) NOT NULL ,
 `descripcion`   varchar(45) NOT NULL ,
 `ruta_archivo`  varchar(255) NOT NULL ,
 `fecha_disparo` datetime NOT NULL ,

PRIMARY KEY (`id_foto`),
KEY `FK_1` (`id_categoria`),
CONSTRAINT `FK_13` FOREIGN KEY `FK_1` (`id_categoria`) REFERENCES `categoria` (`id_categoria`)
);
CREATE TABLE `foto_etiqueta`
(
 `id_foto_etiqueta` int NOT NULL AUTO_INCREMENT ,
 `id_etiqueta`      int NOT NULL ,
 `id_foto`          int NOT NULL ,

PRIMARY KEY (`id_foto_etiqueta`),
KEY `FK_1` (`id_etiqueta`),
CONSTRAINT `FK_11` FOREIGN KEY `FK_1` (`id_etiqueta`) REFERENCES `etiqueta` (`id_etiqueta`),
KEY `FK_2` (`id_foto`),
CONSTRAINT `FK_12` FOREIGN KEY `FK_2` (`id_foto`) REFERENCES `foto` (`id_foto`)
);