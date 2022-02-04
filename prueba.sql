-- MySQL dump 10.13  Distrib 5.7.21, for Win32 (AMD64)
--
-- Host: localhost    Database: ochodatabase
-- ------------------------------------------------------
-- Server version	5.7.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `auditorias`
--

DROP TABLE IF EXISTS `auditorias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `auditorias` (
  `id_auditoria` bigint(20) NOT NULL AUTO_INCREMENT,
  `fecha` timestamp NOT NULL,
  `hora` time NOT NULL,
  `evento` varchar(400) NOT NULL,
  `tabla` varchar(50) NOT NULL,
  `fk_usuario` bigint(20) NOT NULL,
  PRIMARY KEY (`id_auditoria`),
  KEY `fk_usuario` (`fk_usuario`),
  CONSTRAINT `auditorias_ibfk_1` FOREIGN KEY (`fk_usuario`) REFERENCES `usuarios` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `auditorias`
--

LOCK TABLES `auditorias` WRITE;
/*!40000 ALTER TABLE `auditorias` DISABLE KEYS */;
/*!40000 ALTER TABLE `auditorias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bancos`
--

DROP TABLE IF EXISTS `bancos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bancos` (
  `id_banco` bigint(20) NOT NULL AUTO_INCREMENT,
  `n_banco` varchar(50) NOT NULL,
  PRIMARY KEY (`id_banco`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bancos`
--

LOCK TABLES `bancos` WRITE;
/*!40000 ALTER TABLE `bancos` DISABLE KEYS */;
/*!40000 ALTER TABLE `bancos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `caja`
--

DROP TABLE IF EXISTS `caja`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `caja` (
  `id_caja` bigint(20) NOT NULL AUTO_INCREMENT,
  `apertura` double NOT NULL,
  `cierre` double NOT NULL,
  `ingreso` double NOT NULL,
  `egreso` double NOT NULL,
  `fk_compra` bigint(20) NOT NULL,
  `fk_venta` bigint(20) NOT NULL,
  PRIMARY KEY (`id_caja`),
  KEY `fk_compra` (`fk_compra`),
  KEY `fk_venta` (`fk_venta`),
  CONSTRAINT `caja_ibfk_1` FOREIGN KEY (`fk_compra`) REFERENCES `compras` (`id_compra`),
  CONSTRAINT `caja_ibfk_2` FOREIGN KEY (`fk_venta`) REFERENCES `ventas` (`id_ventas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `caja`
--

LOCK TABLES `caja` WRITE;
/*!40000 ALTER TABLE `caja` DISABLE KEYS */;
/*!40000 ALTER TABLE `caja` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ciudades`
--

DROP TABLE IF EXISTS `ciudades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ciudades` (
  `id_ciudad` bigint(20) NOT NULL AUTO_INCREMENT,
  `n_ciudad` varchar(50) NOT NULL,
  `fk_departamento` bigint(20) NOT NULL,
  PRIMARY KEY (`id_ciudad`),
  KEY `fk_departamento` (`fk_departamento`),
  CONSTRAINT `ciudades_ibfk_1` FOREIGN KEY (`fk_departamento`) REFERENCES `departamentos` (`id_departamento`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ciudades`
--

LOCK TABLES `ciudades` WRITE;
/*!40000 ALTER TABLE `ciudades` DISABLE KEYS */;
INSERT INTO `ciudades` VALUES (1,'CAACUPE',1),(2,'ASUNCION',2),(3,'LUQUE',2),(4,'SAN IGNACIO',3),(5,'SAN JUAN BAUTISTA',3);
/*!40000 ALTER TABLE `ciudades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `clientes` (
  `id_cliente` bigint(20) NOT NULL AUTO_INCREMENT,
  `n_cliente` varchar(50) NOT NULL,
  `ruc_ci` varchar(20) NOT NULL,
  `fk_ciudad` bigint(20) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  PRIMARY KEY (`id_cliente`),
  KEY `fk_ciudad` (`fk_ciudad`),
  CONSTRAINT `clientes_ibfk_1` FOREIGN KEY (`fk_ciudad`) REFERENCES `ciudades` (`id_ciudad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compras`
--

DROP TABLE IF EXISTS `compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `compras` (
  `id_compra` bigint(20) NOT NULL AUTO_INCREMENT,
  `fecha` timestamp NOT NULL,
  `sub_total` double NOT NULL,
  `total` double NOT NULL,
  `fk_funcionario` bigint(20) NOT NULL,
  `fk_orden` bigint(20) NOT NULL,
  PRIMARY KEY (`id_compra`),
  KEY `fk_funcionario` (`fk_funcionario`),
  KEY `fk_orden` (`fk_orden`),
  CONSTRAINT `compras_ibfk_1` FOREIGN KEY (`fk_funcionario`) REFERENCES `funcionarios` (`id_funcionario`),
  CONSTRAINT `compras_ibfk_3` FOREIGN KEY (`fk_orden`) REFERENCES `orden_compra` (`id_orden`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compras`
--

LOCK TABLES `compras` WRITE;
/*!40000 ALTER TABLE `compras` DISABLE KEYS */;
/*!40000 ALTER TABLE `compras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuentas`
--

DROP TABLE IF EXISTS `cuentas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cuentas` (
  `id_cuenta` bigint(20) NOT NULL AUTO_INCREMENT,
  `fk_banco` bigint(20) NOT NULL,
  `n_cuenta` varchar(50) NOT NULL,
  `tipo_cuenta` varchar(50) NOT NULL,
  `saldo` double NOT NULL,
  PRIMARY KEY (`id_cuenta`),
  KEY `fk_banco` (`fk_banco`),
  CONSTRAINT `cuentas_ibfk_1` FOREIGN KEY (`fk_banco`) REFERENCES `bancos` (`id_banco`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuentas`
--

LOCK TABLES `cuentas` WRITE;
/*!40000 ALTER TABLE `cuentas` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuentas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departamentos`
--

DROP TABLE IF EXISTS `departamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `departamentos` (
  `id_departamento` bigint(20) NOT NULL AUTO_INCREMENT,
  `n_departamento` varchar(50) NOT NULL,
  `fk_pais` bigint(20) NOT NULL,
  PRIMARY KEY (`id_departamento`),
  KEY `fk_pais` (`fk_pais`),
  CONSTRAINT `departamentos_ibfk_1` FOREIGN KEY (`fk_pais`) REFERENCES `paises` (`id_pais`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamentos`
--

LOCK TABLES `departamentos` WRITE;
/*!40000 ALTER TABLE `departamentos` DISABLE KEYS */;
INSERT INTO `departamentos` VALUES (1,'Coordillera',1),(2,'Central',1),(3,'Misiones',1);
/*!40000 ALTER TABLE `departamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_ordenes`
--

DROP TABLE IF EXISTS `detalle_ordenes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalle_ordenes` (
  `id_dorden` bigint(20) NOT NULL AUTO_INCREMENT,
  `cantidad` double NOT NULL,
  `fk_orden` bigint(20) NOT NULL,
  `fk_inventario` bigint(20) NOT NULL,
  PRIMARY KEY (`id_dorden`),
  KEY `fk_orden` (`fk_orden`),
  KEY `fk_inventario` (`fk_inventario`),
  CONSTRAINT `detalle_ordenes_ibfk_1` FOREIGN KEY (`fk_orden`) REFERENCES `orden_compra` (`id_orden`),
  CONSTRAINT `detalle_ordenes_ibfk_2` FOREIGN KEY (`fk_inventario`) REFERENCES `inventarios` (`id_inventario`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_ordenes`
--

LOCK TABLES `detalle_ordenes` WRITE;
/*!40000 ALTER TABLE `detalle_ordenes` DISABLE KEYS */;
INSERT INTO `detalle_ordenes` VALUES (1,3,1,1),(2,7,1,2),(3,10,2,3),(4,3,2,3),(5,50,2,3);
/*!40000 ALTER TABLE `detalle_ordenes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalles_compras`
--

DROP TABLE IF EXISTS `detalles_compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalles_compras` (
  `id_dcompras` bigint(20) NOT NULL AUTO_INCREMENT,
  `cantidad` bigint(20) NOT NULL,
  `precio_total` varchar(50) NOT NULL,
  `descripcion` varchar(400) NOT NULL,
  `fk_compras` bigint(20) NOT NULL,
  `fk_inventario` bigint(20) NOT NULL,
  PRIMARY KEY (`id_dcompras`),
  KEY `fk_compras` (`fk_compras`),
  KEY `fk_inventario` (`fk_inventario`),
  CONSTRAINT `detalles_compras_ibfk_1` FOREIGN KEY (`fk_compras`) REFERENCES `compras` (`id_compra`),
  CONSTRAINT `detalles_compras_ibfk_2` FOREIGN KEY (`fk_inventario`) REFERENCES `inventarios` (`id_inventario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalles_compras`
--

LOCK TABLES `detalles_compras` WRITE;
/*!40000 ALTER TABLE `detalles_compras` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalles_compras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalles_servicios`
--

DROP TABLE IF EXISTS `detalles_servicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalles_servicios` (
  `id_dservicio` bigint(20) NOT NULL AUTO_INCREMENT,
  `fk_servicio` bigint(20) NOT NULL,
  `fk_inventario` bigint(20) NOT NULL,
  `precio` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `descripcion` int(11) NOT NULL,
  PRIMARY KEY (`id_dservicio`),
  KEY `fk_servicio` (`fk_servicio`),
  KEY `fk_inventario` (`fk_inventario`),
  CONSTRAINT `detalles_servicios_ibfk_1` FOREIGN KEY (`fk_inventario`) REFERENCES `inventarios` (`id_inventario`),
  CONSTRAINT `detalles_servicios_ibfk_2` FOREIGN KEY (`fk_servicio`) REFERENCES `orden_servicios` (`id_servicio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalles_servicios`
--

LOCK TABLES `detalles_servicios` WRITE;
/*!40000 ALTER TABLE `detalles_servicios` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalles_servicios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionarios`
--

DROP TABLE IF EXISTS `funcionarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionarios` (
  `id_funcionario` bigint(20) NOT NULL AUTO_INCREMENT,
  `n_funcionario` varchar(50) NOT NULL,
  `ruc_ci` varchar(20) NOT NULL,
  `fk_ciudad` bigint(20) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `cargo` varchar(50) NOT NULL,
  PRIMARY KEY (`id_funcionario`),
  KEY `fk_ciudad` (`fk_ciudad`),
  CONSTRAINT `funcionarios_ibfk_1` FOREIGN KEY (`fk_ciudad`) REFERENCES `ciudades` (`id_ciudad`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionarios`
--

LOCK TABLES `funcionarios` WRITE;
/*!40000 ALTER TABLE `funcionarios` DISABLE KEYS */;
INSERT INTO `funcionarios` VALUES (1,'ewee','ewe',1,'wew','wew','wew','ewe');
/*!40000 ALTER TABLE `funcionarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `impuestos`
--

DROP TABLE IF EXISTS `impuestos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `impuestos` (
  `id_iva` bigint(20) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(20) NOT NULL,
  PRIMARY KEY (`id_iva`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `impuestos`
--

LOCK TABLES `impuestos` WRITE;
/*!40000 ALTER TABLE `impuestos` DISABLE KEYS */;
INSERT INTO `impuestos` VALUES (1,'10%');
/*!40000 ALTER TABLE `impuestos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventarios`
--

DROP TABLE IF EXISTS `inventarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventarios` (
  `id_inventario` bigint(20) NOT NULL AUTO_INCREMENT,
  `n_insumo` varchar(100) NOT NULL,
  `cantidad` bigint(20) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `fk_iva` bigint(20) NOT NULL,
  `precio` double NOT NULL,
  PRIMARY KEY (`id_inventario`),
  KEY `fk_iva` (`fk_iva`),
  CONSTRAINT `inventarios_ibfk_1` FOREIGN KEY (`fk_iva`) REFERENCES `impuestos` (`id_iva`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventarios`
--

LOCK TABLES `inventarios` WRITE;
/*!40000 ALTER TABLE `inventarios` DISABLE KEYS */;
INSERT INTO `inventarios` VALUES (1,'Losion de Bebe',5,'para tu colita',1,15000),(2,'galleta',7,'galleta galleta metralleta',1,3000),(3,'Computadoras',20,'okay',1,100000);
/*!40000 ALTER TABLE `inventarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventarios_ventas`
--

DROP TABLE IF EXISTS `inventarios_ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventarios_ventas` (
  `id_invenventa` bigint(20) NOT NULL AUTO_INCREMENT,
  `fk_inventario` bigint(20) NOT NULL,
  `fk_ventas` bigint(20) NOT NULL,
  `precio` double NOT NULL,
  `cantidad` bigint(20) NOT NULL,
  PRIMARY KEY (`id_invenventa`),
  KEY `fk_inventario` (`fk_inventario`),
  KEY `fk_ventas` (`fk_ventas`),
  CONSTRAINT `inventarios_ventas_ibfk_1` FOREIGN KEY (`fk_inventario`) REFERENCES `inventarios` (`id_inventario`),
  CONSTRAINT `inventarios_ventas_ibfk_2` FOREIGN KEY (`fk_ventas`) REFERENCES `ventas` (`id_ventas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventarios_ventas`
--

LOCK TABLES `inventarios_ventas` WRITE;
/*!40000 ALTER TABLE `inventarios_ventas` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventarios_ventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movimientos`
--

DROP TABLE IF EXISTS `movimientos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movimientos` (
  `id_mov` bigint(20) NOT NULL AUTO_INCREMENT,
  `fk_cuenta` bigint(20) NOT NULL,
  `fk_caja` bigint(20) NOT NULL,
  `fecha` varchar(20) NOT NULL,
  `tipo_pago` varchar(20) NOT NULL,
  `monto` double NOT NULL,
  `concepto` varchar(400) NOT NULL,
  PRIMARY KEY (`id_mov`),
  KEY `fk_cuenta` (`fk_cuenta`),
  KEY `fk_caja` (`fk_caja`),
  CONSTRAINT `movimientos_ibfk_1` FOREIGN KEY (`fk_caja`) REFERENCES `caja` (`id_caja`),
  CONSTRAINT `movimientos_ibfk_2` FOREIGN KEY (`fk_cuenta`) REFERENCES `cuentas` (`id_cuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movimientos`
--

LOCK TABLES `movimientos` WRITE;
/*!40000 ALTER TABLE `movimientos` DISABLE KEYS */;
/*!40000 ALTER TABLE `movimientos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orden_compra`
--

DROP TABLE IF EXISTS `orden_compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orden_compra` (
  `id_orden` bigint(20) NOT NULL AUTO_INCREMENT,
  `fecha` varchar(50) NOT NULL,
  `descripcion` varchar(400) NOT NULL,
  `fk_proveedor` bigint(20) NOT NULL,
  `fk_funcionario` bigint(20) NOT NULL,
  PRIMARY KEY (`id_orden`),
  KEY `fk_proveedor` (`fk_proveedor`),
  KEY `fk_funcionario` (`fk_funcionario`),
  CONSTRAINT `orden_compra_ibfk_2` FOREIGN KEY (`fk_proveedor`) REFERENCES `proveedores` (`id_proveedor`),
  CONSTRAINT `orden_compra_ibfk_3` FOREIGN KEY (`fk_funcionario`) REFERENCES `funcionarios` (`id_funcionario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orden_compra`
--

LOCK TABLES `orden_compra` WRITE;
/*!40000 ALTER TABLE `orden_compra` DISABLE KEYS */;
INSERT INTO `orden_compra` VALUES (1,'23/01/2019','gg',1,1),(2,'23/01/2019','holaa',2,1);
/*!40000 ALTER TABLE `orden_compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orden_servicios`
--

DROP TABLE IF EXISTS `orden_servicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orden_servicios` (
  `id_servicio` bigint(20) NOT NULL AUTO_INCREMENT,
  `fk_tservicio` bigint(20) NOT NULL,
  `fk_cliente` bigint(20) NOT NULL,
  `fk_funcionario` bigint(20) NOT NULL,
  `fecha_ingreso` varchar(10) NOT NULL,
  `fecha_entrega` varchar(10) NOT NULL,
  `descripcion` varchar(100) NOT NULL,
  `precio_final` double NOT NULL,
  PRIMARY KEY (`id_servicio`),
  KEY `fk_tservicio` (`fk_tservicio`),
  KEY `fk_cliente` (`fk_cliente`),
  KEY `fk_funcionario` (`fk_funcionario`),
  CONSTRAINT `orden_servicios_ibfk_1` FOREIGN KEY (`fk_cliente`) REFERENCES `clientes` (`id_cliente`),
  CONSTRAINT `orden_servicios_ibfk_2` FOREIGN KEY (`fk_funcionario`) REFERENCES `funcionarios` (`id_funcionario`),
  CONSTRAINT `orden_servicios_ibfk_3` FOREIGN KEY (`fk_tservicio`) REFERENCES `tipos_servicios` (`id_tservicio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orden_servicios`
--

LOCK TABLES `orden_servicios` WRITE;
/*!40000 ALTER TABLE `orden_servicios` DISABLE KEYS */;
/*!40000 ALTER TABLE `orden_servicios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paises`
--

DROP TABLE IF EXISTS `paises`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paises` (
  `id_pais` bigint(20) NOT NULL AUTO_INCREMENT,
  `n_pais` varchar(50) NOT NULL,
  PRIMARY KEY (`id_pais`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paises`
--

LOCK TABLES `paises` WRITE;
/*!40000 ALTER TABLE `paises` DISABLE KEYS */;
INSERT INTO `paises` VALUES (1,'Vision');
/*!40000 ALTER TABLE `paises` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `provee_inven`
--

DROP TABLE IF EXISTS `provee_inven`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `provee_inven` (
  `id_proveeinven` bigint(20) NOT NULL AUTO_INCREMENT,
  `fk_proveedor` bigint(20) NOT NULL,
  `fk_inventario` bigint(20) NOT NULL,
  PRIMARY KEY (`id_proveeinven`),
  KEY `fk_proveedor` (`fk_proveedor`),
  KEY `fk_inventario` (`fk_inventario`),
  CONSTRAINT `provee_inven_ibfk_1` FOREIGN KEY (`fk_proveedor`) REFERENCES `proveedores` (`id_proveedor`),
  CONSTRAINT `provee_inven_ibfk_2` FOREIGN KEY (`fk_inventario`) REFERENCES `inventarios` (`id_inventario`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `provee_inven`
--

LOCK TABLES `provee_inven` WRITE;
/*!40000 ALTER TABLE `provee_inven` DISABLE KEYS */;
INSERT INTO `provee_inven` VALUES (1,1,1),(2,1,2),(3,2,3);
/*!40000 ALTER TABLE `provee_inven` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedores`
--

DROP TABLE IF EXISTS `proveedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proveedores` (
  `id_proveedor` bigint(20) NOT NULL AUTO_INCREMENT,
  `n_proveedor` varchar(50) NOT NULL,
  `ruc_ci` varchar(20) NOT NULL,
  `fk_ciudad` bigint(20) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `telefono` varchar(10) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  PRIMARY KEY (`id_proveedor`),
  KEY `fk_ciudad` (`fk_ciudad`),
  CONSTRAINT `proveedores_ibfk_1` FOREIGN KEY (`fk_ciudad`) REFERENCES `ciudades` (`id_ciudad`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedores`
--

LOCK TABLES `proveedores` WRITE;
/*!40000 ALTER TABLE `proveedores` DISABLE KEYS */;
INSERT INTO `proveedores` VALUES (1,'Juan Perez','12345',3,'juan@perez.com','0980123456','tangamandapio'),(2,'Gustavo','12346',4,'gustavo@benitez.com','10011','holaa');
/*!40000 ALTER TABLE `proveedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipos_servicios`
--

DROP TABLE IF EXISTS `tipos_servicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipos_servicios` (
  `id_tservicio` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `precio_mano` double NOT NULL,
  `fk_iva` bigint(20) NOT NULL,
  PRIMARY KEY (`id_tservicio`),
  KEY `fk_iva` (`fk_iva`),
  CONSTRAINT `tipos_servicios_ibfk_1` FOREIGN KEY (`fk_iva`) REFERENCES `impuestos` (`id_iva`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipos_servicios`
--

LOCK TABLES `tipos_servicios` WRITE;
/*!40000 ALTER TABLE `tipos_servicios` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipos_servicios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `id_usuario` bigint(20) NOT NULL AUTO_INCREMENT,
  `n_usuario` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL,
  `fk_funcionario` bigint(20) NOT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `fk_funcinario` (`fk_funcionario`),
  CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`fk_funcionario`) REFERENCES `funcionarios` (`id_funcionario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'wew','ewe',1);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ventas` (
  `id_ventas` bigint(20) NOT NULL AUTO_INCREMENT,
  `fk_funcionario` bigint(20) NOT NULL,
  `fk_cliente` bigint(20) NOT NULL,
  `fk_servicios` bigint(20) NOT NULL,
  `fecha` timestamp NOT NULL,
  `timbrado` varchar(50) NOT NULL,
  `tipo_pago` varchar(10) NOT NULL,
  `sub_total` double NOT NULL,
  `total_iva` double NOT NULL,
  `total_general` double NOT NULL,
  PRIMARY KEY (`id_ventas`),
  KEY `fk_cliente` (`fk_cliente`),
  KEY `fk_funcionario` (`fk_funcionario`),
  KEY `fk_servicios` (`fk_servicios`),
  CONSTRAINT `ventas_ibfk_1` FOREIGN KEY (`fk_cliente`) REFERENCES `clientes` (`id_cliente`),
  CONSTRAINT `ventas_ibfk_2` FOREIGN KEY (`fk_funcionario`) REFERENCES `funcionarios` (`id_funcionario`),
  CONSTRAINT `ventas_ibfk_3` FOREIGN KEY (`fk_servicios`) REFERENCES `orden_servicios` (`id_servicio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-24 17:59:15
