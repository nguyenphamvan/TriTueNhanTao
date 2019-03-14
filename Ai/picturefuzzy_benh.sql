-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: picturefuzzy
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `benh`
--

DROP TABLE IF EXISTS `benh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `benh` (
  `idbenh` int(11) NOT NULL AUTO_INCREMENT,
  `idBenhNhan` int(11) NOT NULL,
  `sotvirut` double DEFAULT NULL,
  `sotret` double DEFAULT NULL,
  `thuonghan` double DEFAULT NULL,
  `daday` double DEFAULT NULL,
  `tim` double DEFAULT NULL,
  PRIMARY KEY (`idbenh`),
  KEY `fk_benh_patient_idx` (`idBenhNhan`),
  CONSTRAINT `fk_benh_patient` FOREIGN KEY (`idBenhNhan`) REFERENCES `benhnhan` (`idbenhnhan`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `benh`
--

LOCK TABLES `benh` WRITE;
/*!40000 ALTER TABLE `benh` DISABLE KEYS */;
INSERT INTO `benh` VALUES (1,1,0.408,0.793,0.682,0.206,0.06),(2,1,0.3968,0.7906,0.75,0.1875,0.125),(3,2,0.3968,0.7906,0.75,0.1875,0.125),(4,2,0.31,-0.08000000000000002,0.4375,0.59375,-0.071875),(5,6,0.623,0.023,0.156,0.789,0.423),(6,2,0.3968,0.7906,0.75,0.1875,0.125),(7,2,0.3968,0.7906,0.75,0.1875,0.125),(8,5,0.001,0.7906,0.75,0.1875,0.125),(9,5,0.425,0.79,0.734375,0.228125,0.125),(10,15,0.396875,0.6218750000000001,0.59375,0.734375,0.59375),(11,8,0.4125,0.5975,0.1275,0.29375,0.736875),(12,9,0.340625,0.790625,0.734375,0.228125,0.28125),(13,11,0.396875,0.59375,0.59375,0.228125,0.74),(14,12,0.34375,0.28875,0.454375,0.234375,0.59625),(15,16,0.3125,0.28875,0.31375,0.31875,0.736875),(16,17,0.425,0.79,0.75,0.1875,0.171875),(17,12,0.4125,0.625625,0.735625,0.459375,0.736875),(18,2,0.43125,0.793,0.31375,0.7481,0.13),(19,2,0.396875,0.790625,0.7434,0.74,0.125),(20,24,0.35625,0.5975,0.28375,0.29375,0.736875),(21,2,0.396875,0.790625,0.7434,0.74,0.4775),(22,25,0.396875,0.790625,0.7434,0.74,0.4775),(23,25,0.396875,0.6218750000000001,0.2799,0.215,0.59375),(24,3,0.340625,0.790625,0.734375,0.3125,0.75),(25,26,0.425,0.625,0.28125,0.734375,0.125);
/*!40000 ALTER TABLE `benh` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-23  0:22:19