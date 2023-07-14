CREATE TABLE `categoria`
(
 `id_categoria` int NOT NULL AUTO_INCREMENT ,
 `descripcion`  varchar(255) NOT NULL ,

PRIMARY KEY (`id_categoria`)
);
CREATE TABLE `producto`
(
 `id_producto`         int NOT NULL AUTO_INCREMENT ,
 `nombre`              varchar(45) NOT NULL ,
 `descripcion`         varchar(255) NULL ,
 `cantidad_disponible` int NOT NULL ,
 `precio_unitario`     double NOT NULL ,
 `id_categoria`        int NOT NULL ,

PRIMARY KEY (`id_producto`),
KEY `FK_1` (`id_categoria`),
CONSTRAINT `FK_14` FOREIGN KEY `FK_1` (`id_categoria`) REFERENCES `categoria` (`id_categoria`)
);
CREATE TABLE `direccion`
(
 `id_direccion`      int NOT NULL AUTO_INCREMENT ,
 `pais`              varchar(45) NOT NULL ,
 `provincia`         varchar(45) NOT NULL ,
 `ciudad`            varchar(45) NOT NULL ,
 `codigo_postal`     varchar(45) NOT NULL ,
 `calle`             varchar(45) NOT NULL ,
 `numero`            varchar(45) NOT NULL ,
 `informacion_extra` varchar(45) NULL ,

PRIMARY KEY (`id_direccion`)
);
CREATE TABLE `proveedor`
(
 `id_proveedor` int NOT NULL AUTO_INCREMENT ,
 `nombre`       varchar(45) NOT NULL ,
 `telefono`     varchar(45) NOT NULL ,
 `email`        varchar(45) NOT NULL ,
 `id_direccion` int NOT NULL ,

PRIMARY KEY (`id_proveedor`),
KEY `FK_1` (`id_direccion`),
CONSTRAINT `FK_15` FOREIGN KEY `FK_1` (`id_direccion`) REFERENCES `direccion` (`id_direccion`)
);
CREATE TABLE `cliente`
(
 `id_cliente`   int NOT NULL AUTO_INCREMENT ,
 `nombre`       varchar(45) NOT NULL ,
 `apellido`     varchar(45) NOT NULL ,
 `telefono`     varchar(45) NOT NULL ,
 `email`        varchar(45) NOT NULL ,
 `id_direccion` int NOT NULL ,

PRIMARY KEY (`id_cliente`),
KEY `FK_1` (`id_direccion`),
CONSTRAINT `FK_16` FOREIGN KEY `FK_1` (`id_direccion`) REFERENCES `direccion` (`id_direccion`)
);

CREATE TABLE `pedido`
(
 `id_pedido`       int NOT NULL AUTO_INCREMENT ,
 `fecha_pedido`    date NOT NULL ,
 `cantidad_pedida` int NOT NULL ,
 `id_producto`     int NOT NULL ,
 `id_proveedor`    int NOT NULL ,
 `id_cliente`      int NOT NULL ,

PRIMARY KEY (`id_pedido`),
KEY `FK_1` (`id_producto`),
CONSTRAINT `FK_19` FOREIGN KEY `FK_1` (`id_producto`) REFERENCES `producto` (`id_producto`),
KEY `FK_2` (`id_proveedor`),
CONSTRAINT `FK_20` FOREIGN KEY `FK_2` (`id_proveedor`) REFERENCES `proveedor` (`id_proveedor`),
KEY `FK_3` (`id_cliente`),
CONSTRAINT `FK_21` FOREIGN KEY `FK_3` (`id_cliente`) REFERENCES `cliente` (`id_cliente`)
);

CREATE TABLE `pedido`
(
 `id_pedido`       int NOT NULL AUTO_INCREMENT ,
 `fecha_pedido`    date NOT NULL ,
 `cantidad_pedida` int NOT NULL ,
 `id_producto`     int NOT NULL ,
 `id_proveedor`    int NOT NULL ,
 `id_cliente`      int NOT NULL ,

PRIMARY KEY (`id_pedido`),
KEY `FK_1` (`id_producto`),
CONSTRAINT `FK_19` FOREIGN KEY `FK_1` (`id_producto`) REFERENCES `producto` (`id_producto`),
KEY `FK_2` (`id_proveedor`),
CONSTRAINT `FK_20` FOREIGN KEY `FK_2` (`id_proveedor`) REFERENCES `proveedor` (`id_proveedor`),
KEY `FK_3` (`id_cliente`),
CONSTRAINT `FK_21` FOREIGN KEY `FK_3` (`id_cliente`) REFERENCES `cliente` (`id_cliente`)
);