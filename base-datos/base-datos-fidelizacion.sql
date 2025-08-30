CREATE DATABASE  IF NOT EXISTS `fidelizacion_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `fidelizacion_db`;
-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: fidelizacion_db
-- ------------------------------------------------------
-- Server version	8.0.43

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ciudades`
--

DROP TABLE IF EXISTS `ciudades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ciudades` (
  `id_ciudad` int NOT NULL AUTO_INCREMENT,
  `ciudad` varchar(100) NOT NULL,
  `departamento` int DEFAULT NULL,
  PRIMARY KEY (`id_ciudad`),
  KEY `departamento` (`departamento`),
  CONSTRAINT `ciudades_ibfk_1` FOREIGN KEY (`departamento`) REFERENCES `departamentos` (`id_departamento`)
) ENGINE=InnoDB AUTO_INCREMENT=83 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ciudades`
--

LOCK TABLES `ciudades` WRITE;
/*!40000 ALTER TABLE `ciudades` DISABLE KEYS */;
INSERT INTO `ciudades` VALUES (1,'Leticia',1),(2,'Medellín',2),(3,'Arauca',3),(4,'Barranquilla',4),(5,'Cartagena de Indias',5),(6,'Tunja',6),(7,'Manizales',7),(8,'Florencia',8),(9,'Yopal',9),(10,'Popayán',10),(11,'Valledupar',11),(12,'Quibdó',12),(13,'Montería',13),(14,'Bogotá',14),(15,'Inírida',15),(16,'San José del Guaviare',16),(17,'Neiva',17),(18,'Riohacha',18),(19,'Santa Marta',19),(20,'Villavicencio',20),(21,'Pasto',21),(22,'Cúcuta',22),(23,'Mocoa',23),(24,'Armenia',24),(25,'Pereira',25),(26,'San Andrés',26),(27,'Bucaramanga',27),(28,'Sincelejo',28),(29,'Ibagué',29),(30,'Cali',30),(31,'Mitú',31),(32,'Puerto Carreño',32),(33,'Montgomery',33),(34,'Juneau',34),(35,'Phoenix',35),(36,'Little Rock',36),(37,'Sacramento',37),(38,'Denver',38),(39,'Hartford',39),(40,'Dover',40),(41,'Tallahassee',41),(42,'Atlanta',42),(43,'Honolulu',43),(44,'Boise',44),(45,'Springfield',45),(46,'Indianapolis',46),(47,'Des Moines',47),(48,'Topeka',48),(49,'Frankfort',49),(50,'Baton Rouge',50),(51,'Augusta',51),(52,'Annapolis',52),(53,'Boston',53),(54,'Lansing',54),(55,'Saint Paul',55),(56,'Jackson',56),(57,'Jefferson City',57),(58,'Helena',58),(59,'Lincoln',59),(60,'Carson City',60),(61,'Concord',61),(62,'Trenton',62),(63,'Santa Fe',63),(64,'Albany',64),(65,'Raleigh',65),(66,'Bismarck',66),(67,'Columbus',67),(68,'Oklahoma City',68),(69,'Salem',69),(70,'Harrisburg',70),(71,'Providence',71),(72,'Columbia',72),(73,'Pierre',73),(74,'Nashville',74),(75,'Austin',75),(76,'Salt Lake City',76),(77,'Montpelier',77),(78,'Richmond',78),(79,'Olympia',79),(80,'Charleston',80),(81,'Madison',81),(82,'Cheyenne',82);
/*!40000 ALTER TABLE `ciudades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `id_cliente` int NOT NULL AUTO_INCREMENT,
  `tipo_identificacion` int NOT NULL,
  `numero_identificacion` varchar(20) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `ciudad` int NOT NULL,
  PRIMARY KEY (`id_cliente`),
  UNIQUE KEY `tipo_identificacion` (`tipo_identificacion`,`numero_identificacion`),
  KEY `ciudad` (`ciudad`),
  CONSTRAINT `clientes_ibfk_1` FOREIGN KEY (`tipo_identificacion`) REFERENCES `tipos_identificacion` (`id_tipo_identificacion`),
  CONSTRAINT `clientes_ibfk_2` FOREIGN KEY (`ciudad`) REFERENCES `ciudades` (`id_ciudad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departamentos`
--

DROP TABLE IF EXISTS `departamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `departamentos` (
  `id_departamento` int NOT NULL AUTO_INCREMENT,
  `departamento` varchar(100) NOT NULL,
  `pais` int DEFAULT NULL,
  PRIMARY KEY (`id_departamento`),
  KEY `pais` (`pais`),
  CONSTRAINT `departamentos_ibfk_1` FOREIGN KEY (`pais`) REFERENCES `paises` (`id_pais`)
) ENGINE=InnoDB AUTO_INCREMENT=83 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamentos`
--

LOCK TABLES `departamentos` WRITE;
/*!40000 ALTER TABLE `departamentos` DISABLE KEYS */;
INSERT INTO `departamentos` VALUES (1,'Amazonas',1),(2,'Antioquia',1),(3,'Arauca',1),(4,'Atlántico',1),(5,'Bolívar',1),(6,'Boyacá',1),(7,'Caldas',1),(8,'Caquetá',1),(9,'Casanare',1),(10,'Cauca',1),(11,'Cesar',1),(12,'Chocó',1),(13,'Córdoba',1),(14,'Cundinamarca',1),(15,'Guainía',1),(16,'Guaviare',1),(17,'Huila',1),(18,'La Guajira',1),(19,'Magdalena',1),(20,'Meta',1),(21,'Nariño',1),(22,'Norte de Santander',1),(23,'Putumayo',1),(24,'Quindío',1),(25,'Risaralda',1),(26,'San Andrés, Providencia y Santa Catalina',1),(27,'Santander',1),(28,'Sucre',1),(29,'Tolima',1),(30,'Valle del Cauca',1),(31,'Vaupés',1),(32,'Vichada',1),(33,'Alabama',2),(34,'Alaska',2),(35,'Arizona',2),(36,'Arkansas',2),(37,'California',2),(38,'Colorado',2),(39,'Connecticut',2),(40,'Delaware',2),(41,'Florida',2),(42,'Georgia',2),(43,'Hawái',2),(44,'Idaho',2),(45,'Illinois',2),(46,'Indiana',2),(47,'Iowa',2),(48,'Kansas',2),(49,'Kentucky',2),(50,'Luisiana',2),(51,'Maine',2),(52,'Maryland',2),(53,'Massachusetts',2),(54,'Míchigan',2),(55,'Minnesota',2),(56,'Misisipi',2),(57,'Misuri',2),(58,'Montana',2),(59,'Nebraska',2),(60,'Nevada',2),(61,'Nueva Hampshire',2),(62,'Nueva Jersey',2),(63,'Nuevo México',2),(64,'Nueva York',2),(65,'Carolina del Norte',2),(66,'Dakota del Norte',2),(67,'Ohio',2),(68,'Oklahoma',2),(69,'Oregón',2),(70,'Pensilvania',2),(71,'Rhode Island',2),(72,'Carolina del Sur',2),(73,'Dakota del Sur',2),(74,'Tennessee',2),(75,'Texas',2),(76,'Utah',2),(77,'Vermont',2),(78,'Virginia',2),(79,'Washington',2),(80,'Virginia Occidental',2),(81,'Wisconsin',2),(82,'Wyoming',2);
/*!40000 ALTER TABLE `departamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fidelizacion`
--

DROP TABLE IF EXISTS `fidelizacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fidelizacion` (
  `id_fidelizacion` int NOT NULL AUTO_INCREMENT,
  `id_cliente` int NOT NULL,
  `id_marca` int NOT NULL,
  PRIMARY KEY (`id_fidelizacion`),
  KEY `id_cliente` (`id_cliente`),
  KEY `id_marca` (`id_marca`),
  CONSTRAINT `fidelizacion_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`),
  CONSTRAINT `fidelizacion_ibfk_2` FOREIGN KEY (`id_marca`) REFERENCES `marcas` (`id_marca`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fidelizacion`
--

LOCK TABLES `fidelizacion` WRITE;
/*!40000 ALTER TABLE `fidelizacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `fidelizacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marcas`
--

DROP TABLE IF EXISTS `marcas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marcas` (
  `id_marca` int NOT NULL AUTO_INCREMENT,
  `marca` varchar(100) NOT NULL,
  PRIMARY KEY (`id_marca`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marcas`
--

LOCK TABLES `marcas` WRITE;
/*!40000 ALTER TABLE `marcas` DISABLE KEYS */;
INSERT INTO `marcas` VALUES (1,'Americanino'),(2,'American Eagle'),(3,'Chevignon'),(4,'Esprit'),(5,'Naf Naf'),(6,'Rifle');
/*!40000 ALTER TABLE `marcas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paises`
--

DROP TABLE IF EXISTS `paises`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paises` (
  `id_pais` int NOT NULL AUTO_INCREMENT,
  `pais` varchar(100) NOT NULL,
  PRIMARY KEY (`id_pais`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paises`
--

LOCK TABLES `paises` WRITE;
/*!40000 ALTER TABLE `paises` DISABLE KEYS */;
INSERT INTO `paises` VALUES (1,'Colombia'),(2,'Estados Unidos');
/*!40000 ALTER TABLE `paises` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipos_identificacion`
--

DROP TABLE IF EXISTS `tipos_identificacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipos_identificacion` (
  `id_tipo_identificacion` int NOT NULL AUTO_INCREMENT,
  `tipo_identificacion` varchar(100) NOT NULL,
  PRIMARY KEY (`id_tipo_identificacion`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipos_identificacion`
--

LOCK TABLES `tipos_identificacion` WRITE;
/*!40000 ALTER TABLE `tipos_identificacion` DISABLE KEYS */;
INSERT INTO `tipos_identificacion` VALUES (1,'Cedula'),(2,'Extrangeria');
/*!40000 ALTER TABLE `tipos_identificacion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-08-29 22:29:20
