CREATE TABLE `item`
(
 `id_item`      int NOT NULL ,
 `nombre`       varchar(45) NOT NULL ,
 `id_categoria` int NOT NULL ,

PRIMARY KEY (`id_item`),
KEY `FK_1` (`id_categoria`),
CONSTRAINT `FK_21_2` FOREIGN KEY `FK_1` (`id_categoria`) REFERENCES `categoria` (`id_categoria`)
);
CREATE TABLE `item`
(
 `id_item`      int NOT NULL ,
 `nombre`       varchar(45) NOT NULL ,
 `id_categoria` int NOT NULL ,

PRIMARY KEY (`id_item`),
KEY `FK_1` (`id_categoria`),
CONSTRAINT `FK_21_2` FOREIGN KEY `FK_1` (`id_categoria`) REFERENCES `categoria` (`id_categoria`)
);
