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
-- Table structure for table `benhnhan`
--

DROP TABLE IF EXISTS `benhnhan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `benhnhan` (
  `idBenhNhan` int(11) NOT NULL,
  `name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `image` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `homeTown` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `birth` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gender` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`idBenhNhan`),
  UNIQUE KEY `id_UNIQUE` (`idBenhNhan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `benhnhan`
--

LOCK TABLES `benhnhan` WRITE;
/*!40000 ALTER TABLE `benhnhan` DISABLE KEYS */;
INSERT INTO `benhnhan` VALUES (1,'nguyen','deptrai.jpg','thanh hoa','11/04/1998',1),(2,'nguyendeptrai','deptrai.jpg','thanh hoa','11/04/1998',0),(3,'nguyenkt22','deptrai.jpg','thanh hoa','11/04/1998',1),(4,'nguyen pham van','deptrai.jpg','quang xuong thanh hoa','11/04/1998',1),(5,'nguyen pham van','deptrai.jpg','thanh hoa','11/04/1998',1),(6,'nguyen pham van','deptrai.jpg','quảng xương thanh hóa','11/04/1998',1),(7,'nguyen pham','songoku.jpg','quang hai - thanh hoa','11/04/1998',1),(8,'Wenda MacMorland','ảnh thẻ 2.jpg','France','17/8/1983',0),(9,'Miner Caton','ảnh thẻ 4.jpg','Japan','23/8/1972',1),(10,'Keith Mensler','ảnh thẻ 3.jpg','Canada','17/8/1972',0),(11,'Marylinda Keward','ảnh thẻ 7.jpg','Vietnam','25/1/1992',0),(12,'Anthia Keynd','ảnh thẻ 7.jpg','Vietnam','25/1/1996',0),(13,'Lilla Walters','ảnh thẻ 7.jpg','Philippines','25/1/1996',0),(14,'Wallache Donnellan','ảnh thẻ 7.jpg','Vietnam','25/1/1998',0),(15,'Novelia Maddinon','ảnh thẻ 10.jpg','Slovenia','28/12/1989',0),(16,'Calypso Boissier','ảnh thẻ 11.jpg','China','28/12/1989',0),(17,'Novelia Maddinon','tải xuống.jpg','China','28/12/1996',0),(18,'Patrice Pasquale','ảnh thẻ 8.jpg','China','28/12/1983',1),(19,'Wallache Donnellan','ảnh thẻ 9.jpg','Malaysia','15/3/1986',1),(20,'Gabbi Simoni','ảnh thẻ 6.jpg','United States','8/9/1983',1),(21,'Edie Flowerdew','ảnh thẻ 6.jpg','United States','8/6/1985',1),(22,'Karylin Glyssanne','ảnh thẻ 9.jpg','Mexico','7/12/1996',1),(23,'le duy hung','ảnh thẻ 8.jpg','VietNam','12/6/1998',1),(24,'le duy hung','ảnh thẻ 8.jpg','Vietnam','15/8/1998',1),(25,'le van nam','ảnh thẻ 8.jpg','Vietnam','15/6/1998',1),(26,'nguyen thi ha','ảnh thẻ 5.jpg','Vietnam','15/8/1998',0);
/*!40000 ALTER TABLE `benhnhan` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-23  0:22:20
