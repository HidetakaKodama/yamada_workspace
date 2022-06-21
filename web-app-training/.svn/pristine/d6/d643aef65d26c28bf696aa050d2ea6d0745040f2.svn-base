-- MariaDB dump 10.19  Distrib 10.4.19-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: fa
-- ------------------------------------------------------
-- Server version	10.4.19-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES cp932 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `album_anzai`
--

DROP TABLE IF EXISTS `album_anzai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `album_anzai` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `album` varchar(256) NOT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `album_anzai`
--

LOCK TABLES `album_anzai` WRITE;
/*!40000 ALTER TABLE `album_anzai` DISABLE KEYS */;
INSERT INTO `album_anzai` VALUES (0,'','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(1,'Perfume`Complete Best','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(2,'GAME','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(3,'‡™','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(4,'JPN','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(5,'Perfume Global Compilation','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(6,'LOVE THE WORLD','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(7,'LEVEL3','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(8,'COSMIC EXPLORER','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(9,'Future Pop','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(10,'Perfume The Best gP Cubedh','0','2019-10-29 00:00:00','2019-10-29 00:00:00');
/*!40000 ALTER TABLE `album_anzai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `artist`
--

DROP TABLE IF EXISTS `artist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `artist` (
  `id` int(11) NOT NULL,
  `artist` varchar(256) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `artist`
--

LOCK TABLES `artist` WRITE;
/*!40000 ALTER TABLE `artist` DISABLE KEYS */;
INSERT INTO `artist` VALUES (1,'Zebrahead','0','2018-05-23 01:27:00','2018-05-23 01:27:00'),(2,'FLOW','0','2018-05-23 01:27:00','2018-05-23 01:27:00'),(3,'•Ä’ÃŒºt','0','2018-05-23 01:27:00','2018-05-23 01:27:00'),(4,'Anly','0','2018-05-23 01:27:00','2018-05-23 01:27:00'),(5,'fox capture plan','0','2018-05-23 01:27:00','2018-05-23 01:27:00');
/*!40000 ALTER TABLE `artist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attribute_kawamura`
--

DROP TABLE IF EXISTS `attribute_kawamura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attribute_kawamura` (
  `attribute_id` int(2) NOT NULL,
  `attribute_name` varchar(256) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL COMMENT '0ï¼šæœ‰åŠ¹ã€€1ï¼šç„¡åŠ¹',
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`attribute_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attribute_kawamura`
--

LOCK TABLES `attribute_kawamura` WRITE;
/*!40000 ALTER TABLE `attribute_kawamura` DISABLE KEYS */;
INSERT INTO `attribute_kawamura` VALUES (0,NULL,'0','2019-12-03 15:19:00','2019-12-03 15:19:00'),(1,'ƒGƒ“ƒyƒ‰[ƒyƒ“ƒMƒ“‘®','0','2019-12-03 15:19:00','2019-12-03 15:19:00'),(2,'ƒAƒfƒŠ[ƒyƒ“ƒMƒ“‘®','0','2019-12-03 15:19:00','2019-12-03 15:19:00'),(3,'ƒtƒ“ƒ{ƒ‹ƒgƒyƒ“ƒMƒ“‘®','0','2019-12-03 15:19:00','2019-12-03 15:19:00'),(4,'ƒ}ƒJƒƒjƒyƒ“ƒMƒ“‘®','0','2019-12-03 15:19:00','2019-12-03 15:19:00'),(5,'ƒLƒ“ƒƒyƒ“ƒMƒ“‘®','0','2019-12-03 15:19:00','2019-12-03 15:19:00'),(6,'ƒRƒKƒ^ƒyƒ“ƒMƒ“‘®','0','2019-12-03 15:19:00','2019-12-03 15:19:00');
/*!40000 ALTER TABLE `attribute_kawamura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `broadcast_station_ige`
--

DROP TABLE IF EXISTS `broadcast_station_ige`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `broadcast_station_ige` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `broadcast_station_ige`
--

LOCK TABLES `broadcast_station_ige` WRITE;
/*!40000 ALTER TABLE `broadcast_station_ige` DISABLE KEYS */;
INSERT INTO `broadcast_station_ige` VALUES (0,NULL,'0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(1,'NHK‘‡','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(2,'“ú–{ƒeƒŒƒr','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(3,'ƒeƒŒƒr’©“ú','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(4,'TBS','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(5,'ƒtƒWƒeƒŒƒr','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(6,'ƒeƒŒƒr“Œ‹','0','2021-05-18 12:00:00','2021-05-18 12:00:00');
/*!40000 ALTER TABLE `broadcast_station_ige` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dog_country_kanno`
--

DROP TABLE IF EXISTS `dog_country_kanno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dog_country_kanno` (
  `id` int(11) NOT NULL,
  `country` varchar(256) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dog_country_kanno`
--

LOCK TABLES `dog_country_kanno` WRITE;
/*!40000 ALTER TABLE `dog_country_kanno` DISABLE KEYS */;
INSERT INTO `dog_country_kanno` VALUES (0,NULL,'0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(1,'ƒƒLƒVƒR','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(2,'ƒCƒMƒŠƒX','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(3,'ƒhƒCƒc','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(4,'ƒCƒ^ƒŠƒA','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(5,'ƒI[ƒXƒgƒ‰ƒŠƒA','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(6,'“ú–{','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(7,'ƒtƒ‰ƒ“ƒX','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(8,'’†‘','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(9,'ƒAƒƒŠƒJ','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(10,'ƒRƒ“ƒS','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(11,'ƒƒVƒA','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(12,'ƒXƒCƒX','0','2020-05-21 00:00:00','2020-05-21 00:00:00');
/*!40000 ALTER TABLE `dog_country_kanno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dog_main_kanno`
--

DROP TABLE IF EXISTS `dog_main_kanno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dog_main_kanno` (
  `dog_id` int(11) NOT NULL,
  `dog_name` varchar(256) NOT NULL,
  `country_id` int(11) DEFAULT NULL,
  `size_id` int(11) NOT NULL,
  `charcter` varchar(256) NOT NULL,
  `image` varchar(256) NOT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`dog_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dog_main_kanno`
--

LOCK TABLES `dog_main_kanno` WRITE;
/*!40000 ALTER TABLE `dog_main_kanno` DISABLE KEYS */;
INSERT INTO `dog_main_kanno` VALUES (1,'ƒS[ƒ‹ƒfƒ“EƒŒƒgƒŠ[ƒo[',2,4,'‰·Œú‚ÅŒ«‚­ƒtƒŒƒ“ƒhƒŠ[BƒZƒ‰ƒs[Œ¢‚È‚Ç‚ÉŒü‚­Œ¢í','/dogKanno/20200605152150187.jpg','0','2020-05-21 00:00:00','2020-06-05 15:21:50'),(2,'ƒ‰ƒuƒ‰ƒh[ƒ‹EƒŒƒgƒŠ[ƒo[',2,4,'‰j‚®‚±‚Æ‚ª“¾ˆÓB–Ó“±Œ¢‚Æ‚µ‚Ä‚àŠˆ–ô‚·‚éB','Lab.png','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(3,'ƒˆ[ƒNƒVƒƒ[EƒeƒŠƒA',2,1,'‹C•i‚ ‚Ó‚ê‚é«ŠiB–Ñ‚ª’·‚­—lX‚ÈƒJƒbƒgƒXƒ^ƒCƒ‹‚ªŠy‚µ‚ß‚éB','yorkey.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(4,'ƒ|ƒƒ‰ƒjƒAƒ“',3,1,'DŠïS‚ª‹­‚­—EŠ¸BSNS‚Å•—‚É‚©‚ê‚é“®‰æ‚ª˜b‘è‚É‚È‚Á‚½B','pome.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(5,'ÄŒ¢',6,2,'½À‚È«Ši‚ª¢ŠE’†‚Ål‹C‚ğŒÄ‚ñ‚Å‚¢‚éB','shiba.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(6,'ƒpƒsƒˆƒ“',7,2,'‚È‚Å‚ç‚ê‚é‚±‚Æ‚ğD‚ŞBü‚è–Ñ‚ª‚©‚í‚¢‚¢B','papi.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(7,'ƒ{[ƒ_[ƒRƒŠ[',2,3,'”²ŒQ‚Ì‰^“®_ŒoB–q—rŒ¢‚Æ‚µ‚Ä—p‚¢‚ç‚ê‚Ä‚«‚½B','border.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(8,'ƒLƒƒƒoƒŠƒAEƒLƒ“ƒOEƒ`ƒƒ[ƒ‹ƒYEƒXƒpƒjƒGƒ‹',2,2,'–¾‚é‚­—z‹CBâ‚µ‚ª‚è‚â‚Èˆê–Ê‚àB','cavalier.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(9,'ƒh[ƒxƒ‹ƒ}ƒ“',3,4,'—˜Œû‚ÅŒx‰úS‚ª‹­‚­AŒx@Œ¢‚È‚Ç‚Æ‚µ‚ÄŠˆ–ô‚·‚éB','doberman.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(10,'ƒgƒCƒv[ƒhƒ‹',7,2,'ƒtƒŒƒ“ƒhƒŠ[‚©‚Â–Ñ‚ª”²‚¯‚É‚­‚¢‚½‚ßA‰îŒì{İ‚È‚Ç‚Å‚ÌƒZƒ‰ƒs[Œ¢‚ÉŒü‚¢‚Ä‚¢‚éB','toypoo.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(11,'ƒ~ƒjƒ`ƒ…ƒAEƒ_ƒbƒNƒXƒtƒ“ƒh',3,2,'ŠÃ‚¦‚ñ–VB“·’·’Z‘«‚Ìƒ‹ƒbƒNƒX‚Åˆ¤‚³‚ê‚Ä‚¢‚éB','dachs.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(12,'ƒVƒFƒbƒgƒ‰ƒ“ƒhEƒV[ƒvƒhƒbƒO',2,2,'Ó”CŠ´‚ª‹­‚­—pS[‚¢‚ªˆ¤‘z‚Ì‚æ‚¢Œ¢íB','sheltie.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(13,'ƒXƒRƒeƒBƒbƒVƒ…EƒeƒŠƒA',2,2,'Šˆ”­‚Åñ—ÌŒ¢‚ç‚µ‚¢r‚Á‚Û‚³‚à‚ÂB','scottish.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(14,'ƒCƒ^ƒŠƒAƒ“EƒOƒŒ[ƒnƒEƒ“ƒh',4,2,'‰¸‚â‚©‚È«ŠiBƒXƒ^ƒCƒ‹”²ŒQ‚Å‚æ‚­‘–‚éB','italian.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(15,'H“cŒ¢',6,4,'“V‘R‹L”O•¨‚É“o˜^‚³‚ê‚Ä‚¢‚éB“~‚ÌŠ¦‚³‚É‹­‚¢B','akitainu.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(16,'ƒWƒƒƒbƒNEƒ‰ƒbƒZƒ‹EƒeƒŠƒA',5,2,'ÌƒLƒcƒlë‚è‚ğ‚µ‚Ä‚¢‚½‚½‚ß“®‚­‚à‚Ì‚Ér•q‚É”½‰‚·‚éB','jack.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(17,'ƒ~ƒjƒ`ƒ…ƒAEƒVƒ…ƒiƒEƒU[',3,2,'‹¦’²«‚ª‚ ‚èA”‚¢å‚É“O’ê“I‚És‚­‚·B','schnauzer.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(18,'ƒAƒƒŠƒJƒ“EƒRƒbƒJ[EƒXƒpƒjƒGƒ‹',9,3,'—z‹C‚È«ŠiB–Ñ¿‚ªŒ¦…‚Ì‚æ‚¤‚É_‚ç‚©‚¢B','american.jpg','0','2020-05-21 00:00:00','2020-06-08 13:30:10'),(19,'ƒoƒZƒ“ƒW[',10,3,'—˜Œû‚Ål—Ş‚É‚Æ‚Á‚Ä—‘z‚ÌŒ¢‚Æ‚¢‚í‚ê‚Ä‚¢‚éB','basenji.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(20,'ƒuƒ‹ƒhƒbƒO',2,3,'Œµ‚Â‚¢Œ©‚½–Ú‚ÌŠ„‚É—D‚µ‚¢«Ši‚ğ‚µ‚Ä‚¢‚éB','bull.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(21,'ƒVƒxƒŠƒAƒ“EƒnƒXƒL[',9,4,'’‡ŠÔˆÓ¯‚ª‹­‚¢BŒ¢‚¼‚è‚ğŒ¡ˆø‚·‚éƒJƒbƒR‚¢‚¢Œ¢B','husky.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(22,'ƒo[ƒj[ƒYEƒ}ƒEƒ“ƒeƒ“EƒhƒbƒO',12,4,'‚â‚ñ‚¿‚á‚ÅŠÃ‚¦‚ñ–VB”û–Ñ‚ª‚ ‚é‚æ‚¤‚ÈŠç—§‚¿‚ğ‚µ‚Ä‚¢‚éB','bernese.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(23,'ƒZƒ“ƒgEƒo[ƒi[ƒh',12,5,'‚±‚ÌŒ¢‚ªå–ğ‚Ìƒx[ƒg[ƒxƒ“‚Æ‚¢‚¤ƒRƒƒfƒB‰f‰æ‚ª‚ ‚è‚Ü‚·B','st.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(24,'ƒOƒŒ[ƒgEƒsƒŒƒj[ƒY',7,5,'ˆ¤î[‚­—D‰ë‚È•µˆÍ‹C‚ğ‚Á‚Ä‚¢‚éB','grate.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(25,'ƒ{ƒ‹ƒ]ƒC',11,4,'ƒIƒIƒJƒ~‚Ìë—Â‚ğ‚µ‚Ä‚¢‚½B‘Ì‚‚ª‘å‚«‚­ƒXƒŒƒ“ƒ_[‚È‚©‚ç‚¾‚Â‚«B','borzoi.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(26,'ƒVƒFƒp[ƒh',3,4,'ŒP—ûŒü‚«AƒVƒ‡[Œü‚«‚È‚Ç‚Ìƒ^ƒCƒv•Ê‚É«Ši‚ªˆÙ‚È‚é‚ª‚¢‚¸‚ê‚à—âÃ‚³‚ğ‚à‚Á‚Ä‚¢‚éB','shepherd.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(27,'b”ãŒ¢',6,3,'H“cŒ¢‚É‚Â‚®“ñ”Ô–Ú‚Ì“V‘R‹L”O•¨B‚µ‚Â‚±‚­‚µ‚Ä‚à“{‚ç‚È‚¢B','kai.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(28,'ƒ`ƒƒƒEEƒ`ƒƒƒE',8,3,'”ÔŒ¢‚ÉŒü‚¢‚Ä‚¢‚éBƒuƒ‹[ƒuƒ‰ƒbƒN‚Ìã‚ª“Á’¥B','chow.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(29,'ƒ`ƒƒ',1,1,'Œ£g“I‚ÅŠÃ‚¦ãèBŒx‰úS‚ª‹­‚­Š„‚Æ–i‚¦‚éB','chihuahua.png','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(30,'ƒpƒO',8,2,'‚Ô‚³ƒJƒ‘ã•\Bl‰ù‚±‚­”ÔŒ¢‚É‚ÍŒü‚©‚È‚¢B','pug.jpg','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(31,'–kŠC“¹Œ¢',6,3,'–^CM‚Å‚¨•ƒ‚³‚ñ–ğ‚É‹N—p‚³‚êA’–Ú‚ğW‚ß‚½B','/dogKanno/20200605141724403.jpg','0','2020-06-05 14:17:24','2020-06-05 16:28:41');
/*!40000 ALTER TABLE `dog_main_kanno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dog_size_kanno`
--

DROP TABLE IF EXISTS `dog_size_kanno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dog_size_kanno` (
  `id` int(11) NOT NULL,
  `size` varchar(256) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dog_size_kanno`
--

LOCK TABLES `dog_size_kanno` WRITE;
/*!40000 ALTER TABLE `dog_size_kanno` DISABLE KEYS */;
INSERT INTO `dog_size_kanno` VALUES (0,NULL,'0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(1,'’´¬Œ^','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(2,'¬Œ^','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(3,'’†Œ^','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(4,'‘åŒ^','0','2020-05-21 00:00:00','2020-05-21 00:00:00'),(5,'’´‘åŒ^','0','2020-05-21 00:00:00','2020-05-21 00:00:00');
/*!40000 ALTER TABLE `dog_size_kanno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drama_main_ige`
--

DROP TABLE IF EXISTS `drama_main_ige`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `drama_main_ige` (
  `id` int(11) NOT NULL,
  `drama_title` varchar(255) NOT NULL,
  `genre_id` int(11) DEFAULT NULL,
  `broadcast_station_id` int(11) DEFAULT NULL,
  `start_season` varchar(11) NOT NULL,
  `day_of_week` varchar(2) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drama_main_ige`
--

LOCK TABLES `drama_main_ige` WRITE;
/*!40000 ALTER TABLE `drama_main_ige` DISABLE KEYS */;
INSERT INTO `drama_main_ige` VALUES (1,'â‘Î—ë“x',1,5,'2020“~','Œ','1Šú‚ÍãŒËÊA‚»‚êˆÈ~‚Í‘ò‘ºˆê÷å‰‰‚ÌŒY–ƒhƒ‰ƒ}B','0','2021-05-18 12:00:00','2021-05-27 15:43:25'),(2,'•a‰@‚Ì¡‚µ•û',2,6,'2020“~','Œ','“|YŠë‹@‚©‚çŠïÕ‚Ì•œŠˆ‚ğ‹‚°‚½•a‰@‚ÌÀ˜b‚ªƒ‚ƒfƒ‹Aå‰‰‚Í¬òF‘¾˜YB','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(3,'‚â‚ß‚é‚Æ‚«‚àA‚·‚±‚â‚©‚È‚é‚Æ‚«‚à',3,2,'2020“~','Œ','“¯–¼¬à‚ğ“¡ƒ–’J‘¾•ãå‰‰‚ÅÀÊ‰»B','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(4,'10‚Ì”é–§',4,5,'2020“~','‰Î','å‰‰‚ÍŒüˆä—B—lX‚È”é–§‚É–|˜M‚³‚ê‚éB','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(5,'—ö‚Í‚Â‚Ã‚­‚æ‚Ç‚±‚Ü‚Å‚à',3,4,'2020“~','‰Î','–Ÿ‰æ‚ÌÀÊ‰»B²“¡Œ’Aã”’Î–G‰¹‚ªo‰‰‚µAw—ö‚Â‚Ãx‚Ìˆ¤Ì‚Å‚à‚¨‚È‚¶‚İB','0','2021-05-18 12:00:00','2021-05-31 10:40:10'),(6,'SEDAI WARS',5,4,'2020“~','…','‹ß–¢—ˆ‚Ì“ú–{‚ª•‘‘äBR“c—T‹Må‰‰B','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(7,'’m‚ç‚È‚­‚Ä‚¢‚¢ƒRƒg',5,2,'2020“~','…','‚¨d–Œnƒqƒ…[ƒ}ƒ“ƒhƒ‰ƒ}BTŠ§•ÒW•”‚ğ•‘‘ä‚É‹LÒ‚ÌålŒö‚ğ‹g‚—R—¢q‚ª‰‰‚¶‚éB','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(8,'–l‚Í‚Ç‚±‚©‚ç',4,6,'2020“~','…','“¯–¼–Ÿ‰æ‚ğ’†“‡—TãÄå‰‰‚ÅÀÊ‰»B“Áê”\—Í‚ğ‚à‚ÂålŒö‚ÌÂtƒTƒXƒyƒ“ƒXB','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(9,'DASADA',6,2,'2020“~','–Ø','HŒ³N‚ÌŠé‰æB“úŒüâ46‚ªå‰‰‚ğ–±‚ß‚éŠw‰€ƒhƒ‰ƒ}B','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(10,'—ˆ¢‚Å‚Í‚¿‚á‚ñ‚Æ‚µ‚Ü‚·',3,6,'2020“~','–Ø','“à“c—‰›å‰‰‚Ìƒ‰ƒuƒRƒƒfƒBB–Ÿ‰æ‚ÌÀÊ‰»B','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(11,'ƒPƒCƒW‚ÆƒPƒ“ƒW',1,3,'2020“~','–Ø','‹Ë’JŒ’‘¾‚Æ“Œo¹‘å‚ªƒ_ƒuƒ‹å‰‰‚ÌŠ®‘SƒIƒŠƒWƒiƒ‹ƒXƒg[ƒŠ[B','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(12,'ƒAƒ‰ƒCƒu‚ª‚ñê–åˆã‚ÌƒJƒ‹ƒe',2,5,'2020“~','–Ø','‚ª‚ñ‚É—§‚¿Œü‚©‚¤2l‚Ì—ˆã‚ÌƒƒfƒBƒJƒ‹ƒqƒ…[ƒ}ƒ“ƒhƒ‰ƒ}B','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(13,'ƒ‰ƒ“ƒ`‡ƒRƒ“’T’ã',3,2,'2020“~','–Ø','å‰‰‚Í’nã”g˜Aƒhƒ‰‰å‰‰‚ÌR–{”üŒB“ä‚ğ‰ğ‚¢‚Ä‚¢‚­B','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(14,'‚ä‚éƒLƒƒƒ“¢',7,6,'2020“~','‹à','ƒ\ƒƒLƒƒƒ“ƒv‚ğ‚·‚é—q‚Z¶’B‚Ì‚ä‚é‚â‚©‚È“úí•`‚­B•ŸŒ´—yå‰‰B','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(15,'’“İŒY–2',1,6,'2020“~','‹à','›“‡i‰‰‚¶‚é\"’“İ‚³‚ñ\"‚ª’¬‚Ì•½˜a‚ğç‚é‚½‚ß‚É•±“¬‚·‚éB','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(16,'•aº‚Å”O•§‚ğ¥‚¦‚È‚¢‚Å‚­‚¾‚³‚¢',2,4,'2020“~','‹à','‘m—µ‚Å‹~‹}‹~–½ˆã‚Æ‚¢‚¤ålŒö‚ªŠ‹“¡‚·‚ép‚ğ•`‚­Aˆã—Ãƒqƒ…[ƒ}ƒ“ƒhƒ‰ƒ}','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(17,'—q‚Z¶‚Ì–³‘ÊŒ­‚¢',6,3,'2020“~','‹à','–Ÿ‰æ‚ÌÀÊ‰»B—q‚Z¶’B‚Ì“úí‚ğ•`‚­ƒRƒƒfƒBB','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(18,'ƒgƒbƒvƒiƒCƒt',2,2,'2020“~','“y','èp‚Ì“VË‚ªW‚¤•a‰@‚Ì”]_ŒoŠO‰È‚ª•‘‘äBå‰‰‚Í“VŠC—SŠóB','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(19,'ƒeƒZƒEƒX‚Ì‘D',8,4,'2020“~','“ú','’|“à—Á^‰‰‚¶‚éålŒö‚ªA•ƒe‚Ì–Œ‚ğ‰ğŒˆ‚·‚é‚½‚ßƒ^ƒCƒ€ƒXƒŠƒbƒv‚·‚éB','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(20,'SUITS2',NULL,5,'2020t','Œ','‘S•Ä‚Ì‘åƒqƒbƒgƒhƒ‰ƒ}‚ÌƒV[ƒYƒ“‚QB•q˜r•ÙŒìm‚Æ“VË•è‚Å–â‘è‚ğ‰ğŒˆ‚µ‚Ä‚¢‚­B','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(21,'³‚µ‚¢ƒƒbƒNƒoƒ“ƒh‚Ìì‚è•û',NULL,2,'2020t','‰Î','•sŠí—p‚Åƒ_ƒƒ_ƒ‚¾‚¯‚Çˆ¤‚·‚×‚«4l‚ªƒgƒbƒvƒŒƒxƒ‹‚Ì‰¹ŠyƒtƒFƒX‚ğ–Úw‚·•¨ŒêB“¡ˆä—¬¯A_R’q—må‰‰B','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(22,'’T’ãE—R—˜—Ù‘¾˜Y',4,5,'2020t','‰Î','’nã”g‰å‰‰‚Ì‹gìWi‚Æu‘¸~‚ªƒoƒfƒB‚Æ‚È‚èA‹“s‚ÌŠï‰ö‚È¢ŠE‚ğŒ»‘ã•—‚É‰ğß‚µ‚Ä‚­B','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(23,'ƒnƒPƒ“‚Ì•iŠi',5,2,'2020t','…','2007”N‚É•ú‘—‚³‚ê‚½‚¨d–ƒhƒ‰ƒ}‚Ì‘±•ÒB“­‚­‚±‚Æ‚Ì–{¿‚É”—‚éB','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(24,'ƒŒƒ“ƒ^ƒ‹‚È‚ñ‚à‚µ‚È‚¢l',NULL,6,'2020t','–Ø','‘“c‹M‹vå‰‰BTwitter‚Å˜b‘è‚Æ‚È‚Á‚½ƒŒƒ“ƒ^ƒ‹‚È‚ñ‚à‚µ‚È‚¢l‚ğƒ‚ƒfƒ‹‚Éƒhƒ‰ƒ}‰»B','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(25,'BG`g•ÓŒxŒìl`',11,3,'2020t','–Ø','–Ø‘º‘ñÆå‰‰B–¯ŠÔƒ{ƒfƒB[ƒK[ƒh‚Ìp‚ğ•`‚­ƒVƒŠ[ƒYìB','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(26,'MIU404',1,4,'2020t','‹à','ˆ»–ì„‚Æ¯–ìŒ¹ƒ_ƒuƒ‹å‰‰A–ì–ØˆŸ‹Iq‚ª‹r–{‚Ìl‹CìB‹@“®‘{¸‘à‚Ì•¨ŒêB','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(27,'–¢–Œx@',1,2,'2020t','“y','’†“‡Œ’lA•½–ì‡—s‚ªƒ_ƒuƒ‹å‰‰BŠØ‘‚Ìl‹C‰f‰æ‚ğ“ú–{”Å‚ÉƒŠƒƒCƒNB','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(28,'DIVER|“Áêö“ü”Ç|',1,5,'2020‰Ä','‰Î','•Ÿm‘“‘¿‚ª‰‚Ìƒ_[ƒNƒq[ƒ[–ğBˆ«‚Ì‘gD‚Éö“ü‚µ‚Ä–Œ‰ğŒˆ‚µ‚Ä‚¢‚­B','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(29,'„‚Ì‰Æ­•vƒiƒMƒT‚³‚ñ',3,4,'2020‰Ä','‰Î','‰Æ–‚ª‚Å‚«‚È‚¢ƒLƒƒƒŠƒAƒE[ƒ}ƒ“‚ÌålŒö‚ª‚¨‚¶‚³‚ñ‰Æ­•v‚ğŒÙ‚¤‚±‚Æ‚©‚çn‚Ü‚éƒ‰ƒuƒRƒB','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(30,'„‚½‚¿‚Í‚Ç‚¤‚©‚µ‚Ä‚¢‚é',8,2,'2020‰Ä','…','˜V•Ü˜a‰Ùq“X‚ğ•‘‘ä‚ÉA•l•Ó”ü”g‚Æ‰¡•l—¬¯‰‰‚¶‚é2l‚Ì—ö–Í—l‚ğ•`‚«‚Â‚Â–Œ‚É”—‚éƒ‰ƒuƒ~ƒXƒeƒŠ[B','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(31,'ƒAƒ“ƒTƒ“ƒOƒVƒ“ƒfƒŒƒ‰',2,5,'2020‰Ä','–Ø','ÎŒ´‚³‚Æ‚İå‰‰B•a‰@–òÜt‚ª•±“¬‚µ‚È‚ª‚çŠ³Ò‚ÆŒü‚«‡‚¤p‚ğ•`‚­B','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(32,'”Ş—‚ª¬•§‚Å‚«‚È‚¢——R',NULL,1,'2020‰Ä','“y','ŠO‘l—¯Šw¶‚Æ—H—ì‚ªD‚è‚È‚·‚¿‚å‚Á‚ÆØ‚È‚¢ƒ‰ƒuƒRƒƒfƒBB','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(33,'eƒoƒJÂt”’‘',9,2,'2020‰Ä','“ú','–º‚ğ“Mˆ¤‚·‚é‚ ‚Ü‚è“¯‚¶‘åŠw‚Ö“üŠw‚µ‚½•ƒiƒ€ƒƒcƒˆƒVj‚Æ–ºi‰i–ì‰èˆèj‚ÌãJ‚ğ•`‚­ƒz[ƒ€ƒRƒƒfƒBB','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(38,'—ö‚ÍDeep‚É',3,2,'2021t','…','ÎŒ´‚³‚Æ‚İ‚Æˆ»–ì„','0','2021-05-27 16:37:53','2021-05-27 16:38:20');
/*!40000 ALTER TABLE `drama_main_ige` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drink_category_yoshimoto`
--

DROP TABLE IF EXISTS `drink_category_yoshimoto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `drink_category_yoshimoto` (
  `category_id` int(11) NOT NULL,
  `category_name` varchar(256) NOT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drink_category_yoshimoto`
--

LOCK TABLES `drink_category_yoshimoto` WRITE;
/*!40000 ALTER TABLE `drink_category_yoshimoto` DISABLE KEYS */;
INSERT INTO `drink_category_yoshimoto` VALUES (0,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(1,'…','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(2,'—Î’ƒ','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(3,'”’ƒ','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(4,'g’ƒ','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(5,'ƒR[ƒq[','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(6,'ƒRƒRƒA','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(7,'‰Ê`ˆù—¿','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(8,'’Y_ˆù—¿','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(9,'ƒXƒ|[ƒcˆù—¿','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(10,'ƒmƒ“ƒAƒ‹ƒR[ƒ‹','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(11,'ƒr[ƒ‹','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(12,'ƒƒCƒ“','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(13,'’‘ƒnƒC','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(14,'ƒEƒBƒXƒL[','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(15,'Ä’‘','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(16,'‹“û','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(17,'“¤“û','0','2020-05-19 00:00:00','2020-05-19 00:00:00');
/*!40000 ALTER TABLE `drink_category_yoshimoto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drink_main_yoshimoto`
--

DROP TABLE IF EXISTS `drink_main_yoshimoto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `drink_main_yoshimoto` (
  `drink_id` int(11) NOT NULL,
  `drink_name` varchar(256) NOT NULL,
  `category_id` int(11) DEFAULT NULL,
  `maker_id` int(11) DEFAULT NULL,
  `image` varchar(256) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`drink_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drink_main_yoshimoto`
--

LOCK TABLES `drink_main_yoshimoto` WRITE;
/*!40000 ALTER TABLE `drink_main_yoshimoto` DISABLE KEYS */;
INSERT INTO `drink_main_yoshimoto` VALUES (1,'ƒRƒJEƒR[ƒ‰@ƒ[ƒ',8,2,'/DrinkImageYoshimoto/coke.jpg','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(2,'‚¨[‚¢‚¨’ƒ',2,3,'/DrinkImageYoshimoto/20200602141508665.jpg','0','2020-05-19 00:00:00','2020-06-02 14:15:08'),(3,'ƒUEƒvƒŒƒ~ƒAƒ€Eƒ‚ƒ‹ƒc',11,1,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(4,'ƒAƒTƒqƒX[ƒp[ƒhƒ‰ƒC',11,5,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(5,'ƒ~ƒ‹ƒNƒRƒRƒA',6,16,'/DrinkImageYoshimoto/20200602141621489.jpg','0','2020-05-19 00:00:00','2020-06-02 14:16:21'),(6,'–¾¡‚¨‚¢‚µ‚¢‹“û',16,11,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(7,'”~‚æ‚ë‚µ',7,7,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(8,'ƒRƒoƒ‰ƒTƒ|[ƒg',8,NULL,'/DrinkImageYoshimoto/kobara.jpg','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(9,'ƒAƒNƒGƒŠƒAƒX',9,2,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(10,'REAL@GOLD',8,2,'/DrinkImageYoshimoto/gold.jpg','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(11,'‚¢‚ë‚Í‚·@‚à‚à',1,2,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(12,'ƒgƒƒsƒJ[ƒi@ƒ}ƒ‹ƒ`ƒrƒ^ƒ~ƒ“',7,5,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(13,'MBèåèØ‚»‚Î’ƒ',NULL,NULL,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(14,'Œ’Nƒ~ƒlƒ‰ƒ‹‚Ş‚¬’ƒ',3,3,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(15,'ƒEƒFƒ‹ƒ`@ƒOƒŒ[ƒv',7,5,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(16,'ƒ~ƒE',1,7,'/DrinkImageYoshimoto/miu.jpg','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(17,'ƒLƒŠƒ“ƒŒƒ‚ƒ“',8,6,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(18,'ƒJƒ‹ƒsƒXƒEƒH[ƒ^[',NULL,5,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(19,'ƒƒOƒ~ƒ‹ƒN',16,15,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(20,'’²®“¤“û',17,NULL,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(21,'“¤“ûˆù—¿@ƒ\[ƒ_',17,NULL,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(22,'•XŒ‹ƒXƒgƒƒ“ƒO@‹•ôƒXƒp[ƒNƒŠƒ“ƒO',13,6,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(23,'ƒvƒŒƒ~ƒAƒ€ƒ{ƒX@ƒAƒƒ}ƒ[ƒXƒg',5,1,'/DrinkImageYoshimoto/boss.jpg','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(24,'ŒßŒã‚Ìg’ƒ@‚¨‚¢‚µ‚¢–³“œ',4,6,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(25,'‰¤—l‚Ì—ÜiÔj',12,NULL,'/DrinkImageYoshimoto/king.jpg','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(26,'‚Ì‚ñ‚ ‚é‹C•ª@ƒŒƒ‚ƒ“ƒTƒ[ƒeƒCƒXƒg',10,1,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(27,'ƒoƒ“ƒz[ƒeƒ“@ƒ~ƒ‹ƒN@ƒRƒRƒA',6,5,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(29,'‚¢‚¢‚Æ‚à',15,NULL,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(30,'Oƒc–îƒTƒCƒ_[',8,5,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(31,'ƒgƒƒsƒJ[ƒi 100%ƒIƒŒƒ“ƒW',7,6,NULL,'0','2020-05-29 15:28:29','2020-06-01 13:03:03'),(32,'Suntory Whisky Šp•r',14,1,NULL,'1','2020-06-01 11:50:00','2020-06-01 11:50:00'),(33,'ƒ|ƒJƒŠƒXƒEƒFƒbƒg',9,NULL,'/DrinkImageYoshimoto/20200602141840669.jpg','0','2020-06-01 12:02:34','2020-06-02 14:18:40');
/*!40000 ALTER TABLE `drink_main_yoshimoto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drink_maker_yoshimoto`
--

DROP TABLE IF EXISTS `drink_maker_yoshimoto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `drink_maker_yoshimoto` (
  `maker_id` int(11) NOT NULL,
  `maker_name` varchar(256) NOT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`maker_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drink_maker_yoshimoto`
--

LOCK TABLES `drink_maker_yoshimoto` WRITE;
/*!40000 ALTER TABLE `drink_maker_yoshimoto` DISABLE KEYS */;
INSERT INTO `drink_maker_yoshimoto` VALUES (0,'','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(1,'ƒTƒ“ƒgƒŠ[','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(2,'ƒRƒJEƒR[ƒ‰','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(3,'ˆÉ“¡‰€','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(4,'ƒ„ƒNƒ‹ƒg','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(5,'ƒAƒTƒq','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(6,'ƒLƒŠƒ“','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(7,'ƒ_ƒCƒh[','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(8,'ƒTƒbƒ|ƒ','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(9,'ƒJƒSƒ','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(10,'¬Šâˆä','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(11,'–¾¡','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(12,'“ú´','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(13,'‚æ‚Â—t','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(14,'ƒgƒ“ƒ{','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(15,'áˆó','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(16,'X‰i','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(17,'–¡‚Ì‘f','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(18,'ƒlƒXƒŒ','0','2020-05-19 00:00:00','2020-05-19 00:00:00'),(19,'ƒTƒ“ƒKƒŠƒA','0','2020-05-19 00:00:00','2020-05-19 00:00:00');
/*!40000 ALTER TABLE `drink_maker_yoshimoto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genre`
--

DROP TABLE IF EXISTS `genre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genre` (
  `id` int(11) NOT NULL,
  `genre` varchar(255) NOT NULL,
  `del_flg` int(1) DEFAULT NULL,
  `create_date` varchar(14) NOT NULL,
  `update_date` varchar(14) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genre`
--

LOCK TABLES `genre` WRITE;
/*!40000 ALTER TABLE `genre` DISABLE KEYS */;
INSERT INTO `genre` VALUES (0,'',0,'2017/11/08','2017/11/08'),(1,'ƒAƒNƒVƒ‡ƒ“',0,'2017/11/08','2017/11/08'),(2,'ƒTƒXƒyƒ“ƒX',0,'2017/11/08','2017/11/08'),(3,'ƒqƒ…[ƒ}ƒ“',0,'2017/11/08','2017/11/08'),(4,'ƒzƒ‰[',0,'2017/11/08','2017/11/08'),(5,'ƒRƒƒfƒB',0,'2017/11/08','2017/11/08');
/*!40000 ALTER TABLE `genre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genre_ige`
--

DROP TABLE IF EXISTS `genre_ige`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genre_ige` (
  `id` int(11) NOT NULL,
  `genre` varchar(255) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genre_ige`
--

LOCK TABLES `genre_ige` WRITE;
/*!40000 ALTER TABLE `genre_ige` DISABLE KEYS */;
INSERT INTO `genre_ige` VALUES (0,NULL,'0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(1,'ŒY–','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(2,'ˆã—Ã','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(3,'—öˆ¤','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(4,'ƒTƒXƒyƒ“ƒX','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(5,'Ğ‰ï”h','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(6,'Šw‰€','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(7,'lŠÔƒhƒ‰ƒ}','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(8,'ƒ~ƒXƒeƒŠ[','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(9,'ƒRƒƒfƒB','0','2021-05-18 12:00:00','2021-05-18 12:00:00'),(11,'ƒAƒNƒVƒ‡ƒ“','0','2021-05-18 12:00:00','2021-05-18 12:00:00');
/*!40000 ALTER TABLE `genre_ige` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genre_ishikawa`
--

DROP TABLE IF EXISTS `genre_ishikawa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genre_ishikawa` (
  `id` int(11) DEFAULT NULL,
  `genre` varchar(256) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genre_ishikawa`
--

LOCK TABLES `genre_ishikawa` WRITE;
/*!40000 ALTER TABLE `genre_ishikawa` DISABLE KEYS */;
INSERT INTO `genre_ishikawa` VALUES (0,NULL,'0','2020-03-24 11:40:38','2020-03-24 11:40:41'),(1,'åH','0','2020-03-24 11:40:58','2020-03-24 11:41:01'),(2,'åØ','0','2020-03-24 11:41:18','2020-03-24 11:41:21'),(3,'•›Ø','0','2020-03-24 11:41:36','2020-03-24 11:41:39');
/*!40000 ALTER TABLE `genre_ishikawa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location_takehara`
--

DROP TABLE IF EXISTS `location_takehara`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location_takehara` (
  `location_id` int(2) NOT NULL,
  `location_name` varchar(20) NOT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`location_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location_takehara`
--

LOCK TABLES `location_takehara` WRITE;
/*!40000 ALTER TABLE `location_takehara` DISABLE KEYS */;
INSERT INTO `location_takehara` VALUES (0,'','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(1,'é“Œ','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(2,'é¼','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(3,'é“ì','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(4,'é–k','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(5,'•ª—Ş–³‚µ','0','2019-05-20 00:00:00','2019-05-20 00:00:00');
/*!40000 ALTER TABLE `location_takehara` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maker_mori`
--

DROP TABLE IF EXISTS `maker_mori`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `maker_mori` (
  `id` int(11) NOT NULL,
  `maker` varchar(256) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maker_mori`
--

LOCK TABLES `maker_mori` WRITE;
/*!40000 ALTER TABLE `maker_mori` DISABLE KEYS */;
INSERT INTO `maker_mori` VALUES (0,NULL,'0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(1,'ANCHORiƒAƒ“ƒJ[j','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(2,'ARGON18(ƒAƒ‹ƒSƒ“18j','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(3,'BianchiiƒrƒAƒ“ƒLj','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(4,'BH(ƒr[ƒGƒCƒ`)','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(5,'BMC(ƒr[ƒGƒ€ƒV[j','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(6,'BOMAiƒ{[ƒ}j','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(7,'CANYONiƒLƒƒƒjƒIƒ“j','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(8,'cerveloiƒT[ƒ”ƒFƒj','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(9,'CIPOLLINIiƒ`ƒbƒ|ƒŠ[ƒjj','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(10,'COLNAGOiƒRƒ‹ƒiƒSj','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(11,'CUBE BIKESiƒLƒ…[ƒuƒoƒCƒNƒXj','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(12,'DIAMOND BIKESiƒ_ƒCƒAƒ‚ƒ“ƒhƒoƒCƒNƒXj','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(13,'EDDYMERCKXiƒGƒfƒBƒƒ‹ƒNƒXj','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(14,'FACTORiƒtƒ@ƒNƒ^[j','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(15,'FELTiƒtƒFƒ‹ƒgj','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(16,'FUJIiƒtƒWj','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(17,'GIANTiƒWƒƒƒCƒAƒ“ƒgj','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(18,'KhodaaBloomiƒR[ƒ_[ƒuƒ‹[ƒ€j','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(19,'KUOTAiƒNƒI[ƒ^j','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(20,'MERIDAiƒƒŠƒ_j','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(21,'PINARELLOiƒsƒiƒŒƒj','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(22,'RIDLEYiƒŠƒhƒŒ[j','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(23,'SCOTTiƒXƒRƒbƒgj','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(24,'SPECIALIZEDiƒXƒyƒVƒƒƒ‰ƒCƒYƒhj','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(25,'TREKiƒgƒŒƒbƒNj','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(26,'WilieriƒEƒBƒŠƒG[ƒ‹j','0','2020-03-11 00:00:00','2020-03-11 00:00:00');
/*!40000 ALTER TABLE `maker_mori` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_actor`
--

DROP TABLE IF EXISTS `movie_actor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movie_actor` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `del_flg` int(1) DEFAULT NULL,
  `create_date` varchar(14) NOT NULL,
  `update_date` varchar(14) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_actor`
--

LOCK TABLES `movie_actor` WRITE;
/*!40000 ALTER TABLE `movie_actor` DISABLE KEYS */;
INSERT INTO `movie_actor` VALUES (0,'',0,'2017/11/08','2017/11/08'),(1,'ƒgƒ€Eƒnƒ“ƒNƒX',0,'2017/11/08','2017/11/08'),(2,'ƒgƒr[Eƒ}ƒOƒƒCƒA',0,'2017/11/08','2017/11/08'),(3,'ƒWƒF[ƒ€ƒYEƒ}ƒJƒ”ƒHƒC',0,'2017/11/08','2017/11/08'),(4,'ƒiƒ^ƒŠ[Eƒ|[ƒgƒ}ƒ“',0,'2017/11/08','2017/11/08'),(5,'ƒAƒ“EƒnƒTƒEƒFƒC',0,'2017/11/08','2017/11/08');
/*!40000 ALTER TABLE `movie_actor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie_main`
--

DROP TABLE IF EXISTS `movie_main`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `movie_main` (
  `id` int(11) NOT NULL,
  `movie_title` varchar(255) NOT NULL,
  `genre_id` int(11) DEFAULT NULL,
  `actor_id` int(11) DEFAULT NULL,
  `release_year` int(4) NOT NULL,
  `run_time` int(3) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `del_flg` int(1) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `genre_id` (`genre_id`),
  KEY `actor_id` (`actor_id`),
  CONSTRAINT `movie_main_ibfk_1` FOREIGN KEY (`genre_id`) REFERENCES `genre` (`id`),
  CONSTRAINT `movie_main_ibfk_2` FOREIGN KEY (`actor_id`) REFERENCES `movie_actor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_main`
--

LOCK TABLES `movie_main` WRITE;
/*!40000 ALTER TABLE `movie_main` DISABLE KEYS */;
INSERT INTO `movie_main` VALUES (1,'ƒXƒpƒCƒ_[ƒ}ƒ“3',1,2,2007,155,'ƒXƒpƒCƒ_[ƒ}ƒ“‚Ì‰f‰æ‚Ì’†‚Å‚Íˆê”ÔD‚«',1,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(2,'X-MEN FC',1,3,2011,132,'X-MEN’a¶”é˜bA‚Î‚¿‚Ú‚±–Ê”’‚¢B',0,'2017-11-08 00:00:00','2021-05-27 15:33:27'),(3,'ƒŒƒIƒ“',1,4,1994,110,'ƒ}ƒ`ƒ‹ƒ_‚ª‚©‚í‚¢‚¢',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(4,'ƒ_[ƒNƒiƒCƒgƒ‰ƒCƒWƒ“ƒO',1,5,2012,165,'DCƒRƒ~ƒbƒNŠæ’£‚ê',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(5,'ƒxƒCƒr[ƒhƒ‰ƒCƒo[',1,NULL,2017,113,'‘±•Ò‚ª§ì‚³‚ê‚é‚»‚¤',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(6,'ƒgƒ‰ƒ“ƒX',2,3,2013,101,'ƒ_ƒj[Eƒ{ƒCƒ‹ŠÄ“Â',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(7,'ƒtƒBƒ‹ƒX',2,3,2013,97,'ƒXƒRƒbƒgƒ‰ƒ“ƒh‚ÌÅˆ«ŒY–',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(8,'‰Ø—í‚È‚éƒMƒƒƒcƒr[',2,2,2013,143,'‹‰Øˆºà£',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(9,'ƒuƒŠƒbƒWƒIƒuƒXƒpƒC',2,1,2015,144,'ƒAƒJƒfƒ~[•‰‰’j—DÜóÜ',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(10,'ƒ_Eƒ”ƒBƒ“ƒ`EƒR[ƒh',2,1,2006,174,'ƒIƒhƒŒƒCEƒgƒgƒD˜V‚¯‚½‚È‚ ',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(11,'ƒtƒHƒŒƒXƒgƒKƒ“ƒv',3,1,1994,142,'Œ¾‚í‚¸‚Æ’m‚ê‚½–¼Œ¾‚Ì•óŒÉ',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(12,'Š®‘S‚È‚éƒ`ƒFƒbƒNƒƒCƒg',3,2,2014,116,'ƒ{ƒr[ƒtƒBƒbƒVƒƒ[',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(13,'‚ ‚Ì –l‚ç‚Í',3,2,2001,90,'á‚©‚è‚µƒfƒBƒJƒvƒŠƒI',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(14,'ƒŒƒ~ƒ[ƒ‰ƒuƒ‹',3,5,2012,160,'‰Ì•”•ª‚ÍƒAƒeƒŒƒR‚Å‚Í‚ ‚è‚Ü‚¹‚ñ',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(15,'ƒOƒŠ[ƒ“ƒ}ƒCƒ‹',3,1,1999,189,'wƒVƒ‡[ƒVƒƒƒ“ƒN‚Ì‹ó‚Éx‚à‚¢‚¢‚Å‚·',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(16,'ƒuƒ‰ƒbƒNƒXƒƒ“',4,4,2011,108,'‰ºè‚Èƒzƒ‰[‚æ‚è•|‚¢‚©‚à',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(17,'IT chapter1',4,NULL,2017,135,'TVƒ€[ƒr[•Ò‚à‚Ç‚¤‚¼',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(18,'ƒLƒƒƒŠ[',4,NULL,1976,98,'ƒXƒeƒB[ƒuƒ“EƒLƒ“ƒO‚Ìˆ—ì',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(19,'ƒXƒvƒŠƒbƒg',4,3,2017,117,'ƒVƒƒƒ}ƒ‰ƒ“ì•i‚ğŒ©‚Ä‚¨‚­‚Æ‹g',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(20,'ƒ~ƒXƒ^[ƒKƒ‰ƒX',4,3,2019,129,'ƒXƒvƒŠƒbƒg‚Ì‘±•Ò',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(21,'ƒ}ƒCEƒCƒ“ƒ^[ƒ“',5,5,2015,121,'wƒvƒ‰ƒ_‚ğ’…‚½ˆ«–‚x‚à‚¨‚·‚·‚ß',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(22,'ƒ^[ƒ~ƒiƒ‹',5,1,2004,128,'‹ó`‚ÉZ‚ñ‚Å‚İ‚½‚¢',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(23,'ƒyƒlƒƒs',5,3,2008,104,'Œ»‘ã‚Ì‚¨‚Æ‚¬˜b',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(24,'ƒAƒŠƒXƒCƒ“ƒƒ“ƒ_[ƒ‰ƒ“ƒh',5,5,2010,113,'‰f‘œ”ü‚·‚²‚¢',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(25,'ƒLƒƒƒbƒc•ƒhƒbƒOƒX',5,2,2001,87,'Œ¢‚Í‚©‚í‚¢‚¢',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(26,'‚Â‚®‚È‚¢',NULL,3,2007,130,'‰AŸT‚È‚É‚Í‚¨‚·‚·‚ß‚µ‚Ü‚¹‚ñ',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(27,'ƒvƒ‰ƒCƒh‚Æ•ÎŒ©',NULL,NULL,2005,135,'ƒRƒŠƒ“Eƒtƒ@[ƒX‚Ìƒhƒ‰ƒ}”Å‚à—Ç‚«',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(28,'ƒOƒŒƒCƒeƒXƒgƒVƒ‡[ƒ}ƒ“',3,NULL,2017,105,'ŒÂl“I‚Éƒ‰Eƒ‰Eƒ‰ƒ“ƒh‰z‚¦',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(29,'ƒrƒbƒO',5,1,1988,130,'‘f“G‚È‹C‚É‚È‚ê‚é',0,'2017-11-08 00:00:00','2017-11-08 00:00:00'),(30,'IT chapter2',4,3,2019,NULL,'‚â‚½‚ç‹‰Ø‚È”o—Dw',0,'2017-11-08 00:00:00','2017-11-08 00:00:00');
/*!40000 ALTER TABLE `movie_main` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `music`
--

DROP TABLE IF EXISTS `music`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `music` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `author` varchar(255) CHARACTER SET utf8 DEFAULT 'unknown',
  `rating` int(11) DEFAULT 0,
  `comment` varchar(255) DEFAULT NULL,
  `category_id` int(11) unsigned DEFAULT 0,
  `video_url` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `version` int(11) DEFAULT 0,
  PRIMARY KEY (`id`),
  KEY `fk_music_type` (`category_id`),
  CONSTRAINT `fk_music_type` FOREIGN KEY (`category_id`) REFERENCES `music_category` (`id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `music`
--

LOCK TABLES `music` WRITE;
/*!40000 ALTER TABLE `music` DISABLE KEYS */;
INSERT INTO `music` VALUES (4,'S‘¾?','”C??',5,'”N‘ã”ä?‹v?“Iˆêñ‰ÌC“–”Nœk—¬sC?İˆË‘R—Lœk‘½lŠì?B',3,'https://www.youtube.com/embed/ZSWeurc1yMw','2018-03-19 15:12:14','2018-03-19 15:12:14',5),(9,'•Y—m?ŠC—ˆŠÅ?','ˆ¡ˆ¡',5,'',3,'https://www.youtube.com/embed/hNQohQBFnwI','2018-03-19 16:05:12','2018-03-19 16:05:12',2),(10,'á‚Ì‰Ø','’†“‡”ü‰Ã',5,'',6,'https://www.youtube.com/embed/mF5Qq2YheTg','2018-03-19 17:18:19','2019-03-28 15:26:31',2),(11,'MY ALL','à_è?',5,'',5,'https://www.youtube.com/embed/PKptgq8jTYw','2018-03-19 17:27:07','2018-03-19 17:27:07',1),(12,'Time after time `‰Ô•‘‚¤ŠX‚Å`','?–Ø–ƒˆß',5,'',4,'https://www.youtube.com/embed/Ep_W5rYXyi0','2018-03-19 17:28:57','2018-03-19 17:28:57',1),(13,'–²“Iêy“H','¼—²q',5,'',6,'https://www.youtube.com/embed/Vn6xGeMY9w8','2018-03-19 17:31:46','2018-03-19 17:31:46',1),(14,'big big world','Emilia',5,'',5,'https://www.youtube.com/embed/wpkS2DU_qMs','2018-03-19 17:33:04','2018-03-19 17:33:04',0);
/*!40000 ALTER TABLE `music` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `music_category`
--

DROP TABLE IF EXISTS `music_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `music_category` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `category` varchar(255) NOT NULL DEFAULT '',
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL,
  `is_delete` tinyint(1) NOT NULL DEFAULT 0,
  `delete_date` datetime DEFAULT NULL,
  `version` int(11) DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `music_category`
--

LOCK TABLES `music_category` WRITE;
/*!40000 ALTER TABLE `music_category` DISABLE KEYS */;
INSERT INTO `music_category` VALUES (0,'',NULL,NULL,0,NULL,0),(1,'DJ',NULL,NULL,0,NULL,0),(2,'Light',NULL,NULL,0,NULL,0),(3,'China',NULL,NULL,0,NULL,0),(4,'ACG',NULL,NULL,0,NULL,0),(5,'Pop',NULL,NULL,0,NULL,0),(6,'Classical',NULL,NULL,0,NULL,0);
/*!40000 ALTER TABLE `music_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nbaplayers_main_takahashi`
--

DROP TABLE IF EXISTS `nbaplayers_main_takahashi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nbaplayers_main_takahashi` (
  `id` int(11) DEFAULT NULL,
  `player_image` varchar(256) DEFAULT NULL,
  `player_name` varchar(256) DEFAULT NULL,
  `position_id` int(11) DEFAULT NULL,
  `team_id` int(30) DEFAULT NULL,
  `height` int(3) DEFAULT NULL,
  `weight` int(3) DEFAULT NULL,
  `comment` varchar(256) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nbaplayers_main_takahashi`
--

LOCK TABLES `nbaplayers_main_takahashi` WRITE;
/*!40000 ALTER TABLE `nbaplayers_main_takahashi` DISABLE KEYS */;
INSERT INTO `nbaplayers_main_takahashi` VALUES (1,NULL,'ƒŒƒuƒƒ“EƒWƒF[ƒ€ƒX',3,23,206,113,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(2,NULL,'ƒXƒeƒtƒBƒ“EƒJƒŠ[',1,21,191,86,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(3,NULL,'ƒPƒrƒ“Eƒfƒ…ƒ‰ƒ“ƒg',3,2,208,108,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(4,NULL,'ƒ„ƒjƒXEƒAƒ“ƒeƒgƒNƒ“ƒ|',4,10,211,109,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(5,NULL,'ƒNƒƒCEƒŒƒi[ƒh',3,22,201,104,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(6,NULL,'“ñƒRƒ‰EƒˆƒLƒbƒ`',5,16,213,113,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(7,NULL,'ƒWƒF[ƒ€ƒYEƒn[ƒfƒ“',2,2,196,99,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(8,NULL,'ƒWƒ‡ƒGƒ‹EƒGƒ“ƒr[ƒh',5,4,213,113,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(9,NULL,'ƒ‹ƒJEƒhƒ“ƒ`ƒbƒ`',1,26,201,98,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(10,NULL,'ƒfƒCƒ~ƒAƒ“EƒŠƒ‰[ƒh',1,19,188,88,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(11,NULL,'ƒAƒ“ƒ\ƒj[EƒfƒCƒrƒX',4,23,208,114,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(12,NULL,'ƒWƒ~[Eƒoƒgƒ‰[',3,13,201,104,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(13,NULL,'ƒJƒCƒŠ[EƒA[ƒrƒ“ƒO',1,2,188,87,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(14,NULL,'ƒUƒCƒIƒ“EƒEƒBƒŠƒAƒ€ƒ\ƒ“',4,29,198,128,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(15,NULL,'ƒWƒFƒCƒ\ƒ“EƒeƒCƒ^ƒ€',3,1,203,94,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(16,NULL,'ƒuƒ‰ƒbƒhƒŠ[Eƒr[ƒ‹',2,15,191,93,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(17,NULL,'ƒNƒŠƒXEƒ|[ƒ‹',1,24,183,79,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(18,NULL,'ƒNƒŒƒCEƒgƒ“ƒvƒ\ƒ“',2,21,198,97,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(19,NULL,'ƒWƒ…ƒŠƒAƒXEƒ‰ƒ“ƒhƒ‹',4,3,203,113,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(20,NULL,'ƒfƒrƒ“EƒuƒbƒJ[',2,24,196,95,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(21,NULL,'ƒhƒmƒoƒ“Eƒ~ƒbƒ`ƒFƒ‹',2,20,185,97,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(22,NULL,'ƒ|[ƒ‹EƒWƒ‡[ƒW',2,22,203,99,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(23,NULL,'ƒJ[ƒ‹EƒAƒ“ƒ\ƒj[ƒ^ƒEƒ“ƒY',5,17,211,112,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(24,NULL,'ƒ‰ƒbƒZƒ‹EƒEƒGƒXƒgƒuƒ‹ƒbƒN',1,15,191,90,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(25,NULL,'ƒ‹ƒfƒBEƒSƒxƒA',5,20,216,110,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(26,NULL,'ƒUƒbƒNEƒ‰ƒr[ƒ“',2,6,198,90,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(27,NULL,'ƒgƒŒƒCEƒ„ƒ“ƒO',1,11,185,81,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(28,NULL,'ƒVƒFƒCEƒMƒ‹ƒWƒƒƒX=ƒAƒŒƒNƒTƒ“ƒ_[',2,18,196,81,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(29,NULL,'ƒfƒBƒAƒƒ“EƒtƒHƒbƒNƒX',1,25,191,79,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(30,NULL,'ƒoƒ€EƒAƒfƒoƒˆ',5,13,206,115,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(31,NULL,'ƒxƒ“EƒVƒ‚ƒ“ƒY',1,4,208,105,'','1','2021-06-08 15:26:54','2021-06-08 15:26:54'),(32,NULL,'”ª‘º—Û',4,15,203,103,'','0','2021-06-09 14:05:57','2021-06-09 14:05:57');
/*!40000 ALTER TABLE `nbaplayers_main_takahashi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `penguin_main_kawamura`
--

DROP TABLE IF EXISTS `penguin_main_kawamura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `penguin_main_kawamura` (
  `id` int(11) NOT NULL,
  `name` varchar(256) NOT NULL,
  `attribute_id` int(11) NOT NULL,
  `comment` varchar(256) DEFAULT NULL,
  `image` varchar(256) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL COMMENT '0ï¼šæœ‰åŠ¹ã€€1ï¼šç„¡åŠ¹',
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `penguin_main_kawamura`
--

LOCK TABLES `penguin_main_kawamura` WRITE;
/*!40000 ALTER TABLE `penguin_main_kawamura` DISABLE KEYS */;
INSERT INTO `penguin_main_kawamura` VALUES (1,'ƒRƒEƒeƒCƒyƒ“ƒMƒ“',1,'“ì‹É‘å—¤ü•Ó‚Ì’è’…•Xã‚É¶‘§@‘Ì‚Ì‘å‚«‚³No.1i“ú–{‚Ì…‘°ŠÙ‚ÅŒ©‚é–‚ªo—ˆ‚éj','/penguinKawamura/ƒRƒEƒeƒC_penguin.jpg','0','2019-12-03 15:08:00','2020-03-23 10:08:48'),(2,'ƒLƒ“ƒOƒyƒ“ƒMƒ“',1,'ˆŸ“ì‹É‚Ì“‡X‚É¶‘§i“ú–{‚Ì…‘°ŠÙ‚ÅŒ©‚é–‚ªo—ˆ‚éj','/penguinKawamura/ƒLƒ“ƒO_penguin.jpg','0','2019-12-03 15:08:00','2019-12-03 15:08:00'),(3,'ƒAƒfƒŠ[ƒyƒ“ƒMƒ“',2,'“ì‹É‘å—¤‚Ì‰ˆŠİˆæAü•Ó‚Ì“‡X‚É¶‘§@ICƒJ[ƒhSuica‚Ìƒ‚ƒfƒ‹‚É‚È‚Á‚½ƒyƒ“ƒMƒ“i“ú–{‚Ì…‘°ŠÙ‚ÅŒ©‚é–‚ªo—ˆ‚éj','/penguinKawamura/ƒAƒfƒŠ[_penguin.jpg','0','2019-12-03 15:08:00','2019-12-03 15:08:00'),(4,'ƒWƒFƒ“ƒc[ƒyƒ“ƒMƒ“',2,'“ì‹É‘å—¤‚Ì•X‚Ì’£‚Á‚Ä‚¢‚È‚¢’nˆæAˆŸ“ì‹É‚Ì“‡X‚É¶‘§@—Bˆê‘«‚ÌF‚ªƒIƒŒƒ“ƒW‚Ìƒyƒ“ƒMƒ“@‰j‚¬‚Ì‘¬‚³No.1i“ú–{‚Ì…‘°ŠÙ‚ÅŒ©‚é–‚ªo—ˆ‚éj','/penguinKawamura/ƒWƒFƒ“ƒc[_penguin.jpg','0','2019-12-03 15:08:00','2019-12-03 15:08:00'),(5,'ƒqƒQƒyƒ“ƒMƒ“',2,'“ì‹É”¼“‡‚É¶‘§@i“ú–{‚Ì…‘°ŠÙ‚ÅŒ©‚é–‚ªo—ˆ‚éj','/penguinKawamura/ƒqƒQ_penguin.jpg','0','2019-12-03 15:08:00','2019-12-03 15:08:00'),(6,'ƒKƒ‰ƒpƒSƒXƒyƒ“ƒMƒ“',3,'ƒKƒ‰ƒpƒSƒX”“‡‚É¶‘§@ƒtƒ“ƒ{ƒ‹ƒgƒyƒ“ƒMƒ“‘®‚Ì’†‚Å‚­‚¿‚Î‚µ‚Ì×‚³No.1i“ú–{‚Å‚ÍŒ©‚ê‚È‚¢j','/penguinKawamura/ƒKƒ‰ƒpƒSƒX_penguin.jpg','0','2019-12-03 15:08:00','2019-12-03 15:08:00'),(7,'ƒP[ƒvƒyƒ“ƒMƒ“',3,'“ìƒAƒtƒŠƒJ‹¤˜a‘‚Ì‰ˆŠİ•”‚É¶‘§@ƒAƒtƒŠƒJ‚É¶‘§‚·‚éƒyƒ“ƒMƒ“‚ÍƒP[ƒvƒyƒ“ƒMƒ“‚¾‚¯i“ú–{‚Ì…‘°ŠÙ‚ÅŒ©‚é–‚ªo—ˆ‚éj','/penguinKawamura/ƒP[ƒv_penguin.jpg','0','2019-12-03 15:08:00','2019-12-03 15:08:00'),(8,'ƒtƒ“ƒ{ƒ‹ƒgƒyƒ“ƒMƒ“',3,'ƒtƒ“ƒ{ƒ‹ƒgŠC—¬‚ª—¬‚ê‚é“ìƒAƒƒŠƒJ¼•”‚É¶‘§@Š¦‚¢‚Ì‚ª‹êè@“ú–{‚Å”ˆç”No.1‚Ìƒyƒ“ƒMƒ“i“ú–{‚Ì…‘°ŠÙ‚ÅŒ©‚é–‚ªo—ˆ‚éj','/penguinKawamura/ƒtƒ“ƒ{ƒ‹ƒg_penguin.jpg','0','2019-12-03 15:08:00','2019-12-03 15:08:00'),(9,'ƒ}ƒ[ƒ‰ƒ“ƒyƒ“ƒMƒ“',3,'ƒ`ƒŠEƒAƒ‹ƒ[ƒ“ƒ`ƒ“EƒtƒH[ƒNƒ‰ƒ“ƒh”“‡‚É¶‘§@•v•w‚Ì’‡‚Ì—Ç‚³No.1i“ú–{‚Ì…‘°ŠÙ‚ÅŒ©‚é–‚ªo—ˆ‚éj','/penguinKawamura/ƒ}ƒ[ƒ‰ƒ“_penguin.jpg','0','2019-12-03 15:08:00','2019-12-03 15:08:00'),(10,'ƒtƒBƒˆƒ‹ƒhƒ‰ƒ“ƒhƒyƒ“ƒMƒ“',4,'ƒtƒBƒˆƒ‹ƒh’nˆæEƒI[ƒNƒ‰ƒ“ƒh”“‡EƒXƒ`ƒ…ƒ[ƒg“‡‚È‚Ç‚É¶‘§i“ú–{‚Å‚ÍŒ©‚ê‚È‚¢j','/penguinKawamura/ƒtƒBƒˆƒ‹ƒhƒ‰ƒ“ƒh_penguin.jpg','0','2019-12-03 15:08:00','2019-12-03 15:08:00'),(11,'ƒVƒ…ƒŒ[ƒ^[ƒyƒ“ƒMƒ“',4,'ƒoƒEƒ“ƒeƒB”“‡EƒI[ƒNƒ‰ƒ“ƒh”“‡Eƒ}ƒbƒRƒŠ[“‡‚È‚Ç‚É¶‘§i“ú–{‚Å‚ÍŒ©‚ê‚È‚¢j','/penguinKawamura/ƒVƒ…ƒŒ[ƒ^[_penguin.jpg','0','2019-12-03 15:08:00','2019-12-03 15:08:00'),(12,'ƒXƒlƒA[ƒYƒyƒ“ƒMƒ“',4,'ƒXƒlƒA[ƒY“‡(ƒjƒ…[ƒW[ƒ‰ƒ“ƒh‚Ì“ì‚ÉˆÊ’u‚·‚é“‡)‚É¶‘§i“ú–{‚Å‚ÍŒ©‚ê‚È‚¢j','/penguinKawamura/ƒXƒlƒA[ƒY_penguin.jpg','0','2019-12-03 15:08:00','2019-12-03 15:08:00'),(13,'ƒ}ƒJƒƒjƒyƒ“ƒMƒ“',4,'ƒ`ƒŠ‚Ì“ì•”E‘å¼—m‚©‚çƒCƒ“ƒh—m‚É‚©‚¯‚Ä¶‘§@ƒyƒ“ƒMƒ“‚Ì’†‚ÅŒÂ‘Ì”No.1i“ú–{‚Ì…‘°ŠÙ‚ÅŒ©‚é–‚ªo—ˆ‚éj','/penguinKawamura/ƒ}ƒJƒƒj_penguin.jpg','0','2019-12-03 15:08:00','2019-12-03 15:08:00'),(14,'ƒƒCƒ„ƒ‹ƒyƒ“ƒMƒ“',4,'ƒI[ƒXƒgƒ‰ƒŠƒAEƒjƒ…[ƒW[ƒ‰ƒ“ƒhEƒ}ƒbƒRƒŠ[“‡‚É¶‘§i“ú–{‚Å‚ÍŒ©‚ê‚È‚¢j','/penguinKawamura/ƒƒCƒ„ƒ‹_penguin.jpg','0','2019-12-03 15:08:00','2019-12-03 15:08:00'),(15,'ƒCƒƒgƒrƒyƒ“ƒMƒ“',4,'ƒTƒEƒXƒVƒFƒgƒ‰ƒ“ƒh”“‡EƒLƒƒƒ“ƒxƒ‹“‡‚È‚Ç‚É¶‘§i“ú–{‚Ì…‘°ŠÙ‚ÅŒ©‚é–‚ªo—ˆ‚éj','/penguinKawamura/ƒCƒƒgƒr_penguin.jpg','0','2019-12-03 15:08:00','2019-12-03 15:08:00'),(16,'ƒLƒKƒVƒ‰ƒyƒ“ƒMƒ“',5,'ƒjƒ…[ƒW[ƒ‰ƒ“ƒh‚É¶‘§@ƒyƒ“ƒMƒ“—Ş‚Ì’†‚Å”‚Ì­‚È‚³No1i“ú–{‚Å‚ÍŒ©‚ê‚È‚¢j','/penguinKawamura/ƒLƒKƒVƒ‰_penguin.jpg','0','2019-12-03 15:08:00','2019-12-03 15:08:00'),(17,'ƒRƒKƒ^ƒyƒ“ƒMƒ“',6,'ƒjƒ…[ƒW[ƒ‰ƒ“ƒhEƒI[ƒXƒgƒ‰ƒŠƒA‚Ì“ìŠİ‚É¶‘§@‘Ì‚Ì¬‚³‚³No.1i“ú–{‚Ì…‘°ŠÙ‚ÅŒ©‚é–‚ªo—ˆ‚éj','/penguinKawamura/ƒRƒKƒ^_penguin.jpg','0','2019-12-03 15:08:00','2019-12-03 15:08:00'),(18,'ƒVƒƒcƒoƒTƒyƒ“ƒMƒ“',6,'ƒoƒ“ƒNƒX”¼“‡Eƒ‚ƒgƒiƒE“‡‚É¶‘§@i“ú–{‚Å‚ÍŒ©‚ê‚È‚¢j','/penguinKawamura/ƒVƒƒcƒoƒT_panguin.jpg','0','2019-12-03 15:08:00','2019-12-03 15:08:00');
/*!40000 ALTER TABLE `penguin_main_kawamura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfume_main_anzai`
--

DROP TABLE IF EXISTS `perfume_main_anzai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `perfume_main_anzai` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `song_name` varchar(256) NOT NULL,
  `release_year` int(4) NOT NULL,
  `lyricist_name` varchar(256) DEFAULT NULL,
  `album_id` int(11) DEFAULT NULL,
  `tieup_id` int(1) DEFAULT NULL,
  `comment` varchar(256) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfume_main_anzai`
--

LOCK TABLES `perfume_main_anzai` WRITE;
/*!40000 ALTER TABLE `perfume_main_anzai` DISABLE KEYS */;
INSERT INTO `perfume_main_anzai` VALUES (1,'OMAJINAI™ƒyƒƒŠ',2002,'ƒpƒbƒpƒ‰[‰Í‡',NULL,NULL,'L“‡‘ã‚Ìƒfƒrƒ…[‹È','0','2019-10-29 00:00:00','2019-11-06 13:04:05'),(2,'”Ş•åW’†',2002,'ƒpƒbƒpƒ‰[‰Í‡',NULL,NULL,'L“‡‘ã‚Ì–¼‹È','0','2019-10-29 00:00:00','2019-11-06 10:34:05'),(3,'ƒXƒEƒB[ƒgƒh[ƒiƒbƒc',2003,'–Ø‚Ìq',1,NULL,'‘S‘ƒCƒ“ƒfƒB[ƒYƒfƒrƒ…[‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(4,'ƒrƒ^ƒ~ƒ“ƒhƒƒbƒv',2004,'–Ø‚Ìq',1,NULL,'‚à‚¤‚â‚é–‚Ì‚È‚¢ƒAƒCƒhƒ‹‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(5,'ƒ‚ƒmƒNƒ[ƒ€ƒGƒtƒFƒNƒg',2004,'–Ø‚Ìq',1,NULL,'‚à‚¤‚â‚é–‚Ì‚È‚¢ƒAƒCƒhƒ‹‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(6,'ƒŠƒjƒAƒ‚[ƒ^[ƒK[ƒ‹',2005,'’†“cƒ„ƒXƒ^ƒJ',1,NULL,'ƒƒWƒƒ[ƒfƒrƒ…[‚Ì‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(7,'ƒGƒŒƒNƒgƒEƒ[ƒ‹ƒh',2006,'’†“cƒ„ƒXƒ^ƒJ',1,NULL,'ƒ‰ƒCƒu‚Å‚Í‚İ‚ñ‚È‚Å·‚èã‚ª‚é','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(8,'ƒp[ƒtƒFƒNƒgƒXƒ^[Eƒp[ƒtƒFƒNƒgƒXƒ^ƒCƒ‹',2006,'’†“cƒ„ƒXƒ^ƒJ',1,NULL,'“–”­”„‚³‚ê‚½ƒAƒ‹ƒoƒ€‚Ì—Bˆê‚ÌV‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(9,'ƒ`ƒ‡ƒRƒŒƒCƒgEƒfƒBƒXƒR',2007,'’†“cƒ„ƒXƒ^ƒJ',2,NULL,'ƒoƒŒƒ“ƒ^ƒCƒ“’è”Ô‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(10,'Twinkle Snow Powdery Snow',2007,'’†“cƒ„ƒXƒ^ƒJ',2,NULL,'ƒ`ƒ‡ƒRƒŒƒCƒgƒfƒBƒXƒR‚Æˆê”­•\‚³‚ê‚½','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(11,'ƒ|ƒŠƒŠƒYƒ€',2007,'’†“cƒ„ƒXƒ^ƒJ',2,1,'‚±‚Ì‹È‚Å”š”­“Iƒqƒbƒg','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(12,'SEVENTH HEAVEN',2007,'’†“cƒ„ƒXƒ^ƒJ',6,NULL,'‚½‚¾‚½‚¾‚©‚í‚¢‚¢','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(13,'Baby cruising Love',2008,'’†“cƒ„ƒXƒ^ƒJ',2,3,'‰f‰æuƒ‚ƒeƒLv‚Åg—p','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(14,'ƒ}ƒJƒƒj',2008,'’†“cƒ„ƒXƒ^ƒJ',2,NULL,'“~‚É‚¨ƒXƒXƒ‚Ìˆê‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(15,'GAME',2008,'’†“cƒ„ƒXƒ^ƒJ',2,NULL,'ƒAƒ‹ƒoƒ€‹ÈAƒ_ƒ“ƒX‚ª‚ß‚¿‚á‚­‚¿‚á‚©‚Á‚±‚¢‚¢','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(16,'ƒZƒ‰ƒ~ƒbƒNƒK[ƒ‹',2008,'’†“cƒ„ƒXƒ^ƒJ',2,2,'[–éƒhƒ‰ƒ}‚Åg‚í‚ê‚Ä‚¢‚½','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(17,'ƒV[ƒNƒŒƒbƒgƒV[ƒNƒŒƒbƒg',2008,'’†“cƒ„ƒXƒ^ƒJ',2,1,'ƒAƒCƒXuƒsƒmv‚ÌCM‚¾‚Á‚½‹C‚ª‚·‚é','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(18,'Puppy love',2008,'’†“cƒ„ƒXƒ^ƒJ',2,NULL,'‚İ‚ñ‚È‚Åã‰ºãã','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(19,'edge',2008,'’†“cƒ„ƒXƒ^ƒJ',3,NULL,'‚©‚Á‚±‚¢‚¢‚ª‚ß‚¿‚á‚­‚¿‚á‹È‚ª’·‚¢','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(20,'love the world',2008,'’†“cƒ„ƒXƒ^ƒJ',3,NULL,'ƒ‚ƒmƒNƒ‚ÌPV‚ªaV','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(21,'Dream Fighter',2008,'’†“cƒ„ƒXƒ^ƒJ',3,NULL,'‰‚ß‚Ä‚Ì•“¹ŠÙ‚Å”­•\‚³‚ê‚½','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(22,'ƒƒ“ƒ‹[ƒ€EƒfƒBƒXƒR',2009,'’†“cƒ„ƒXƒ^ƒJ',3,NULL,'V¶Šˆ‰‰‡ƒ\ƒ“ƒO','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(23,'I still love U',2009,'’†“cƒ„ƒXƒ^ƒJ',3,NULL,'‘«‚Â‚Ú‚µ‚È‚ª‚çPVB‚Á‚½‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(24,'NIGHT FLIGHT',2009,'’†“cƒ„ƒXƒ^ƒJ',3,1,'‚±‚ê‚àuƒsƒmv‚ÌCM‚Ì‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(25,'ƒiƒ`ƒ…ƒ‰ƒ‹‚É—ö‚µ‚Ä',2010,'’†“cƒ„ƒXƒ^ƒJ',4,1,'ƒAƒpƒŒƒ‹‚ÌCM‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(26,'VOICE',2010,'’†“cƒ„ƒXƒ^ƒJ',4,1,'PV‚ÌÅŒã‚«‚ê‚¢‚É‚Í‚Ü‚é','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(27,'FAKE IT',2010,'’†“cƒ„ƒXƒ^ƒJ',6,NULL,'ƒ‰ƒCƒu‚ª‚Ô‚¿ã‚ª‚é‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(28,'‚Ë‚¥',2010,'’†“cƒ„ƒXƒ^ƒJ',5,1,'ƒAƒpƒŒƒ‹‚ÌCM‹ÈAƒ_ƒ“ƒX‚ÌƒXƒeƒbƒv‚ª“Æ“Á','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(29,'”÷‚©‚ÈƒJƒIƒŠ',2011,'’†“cƒ„ƒXƒ^ƒJ',5,1,'u•XŒ‹v‚ÌCM@‰Âˆ¤‚¢','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(30,'ƒŒ[ƒU[ƒr[ƒ€',2011,'’†“cƒ„ƒXƒ^ƒJ',5,1,'u•XŒ‹v‚ÌCM@‚©‚Á‚±‚¢‚¢','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(31,'GLITTER',2011,'’†“cƒ„ƒXƒ^ƒJ',5,1,'u•XŒ‹v‚ÌCM@‚©‚Á‚±‚¢‚¢','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(32,'ƒXƒpƒCƒX',2011,'’†“cƒ„ƒXƒ^ƒJ',5,2,'u•XŒ‹v‚ÌCM@‚©‚Á‚±‚¢‚¢','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(33,'MY COLOR',2011,'’†“cƒ„ƒXƒ^ƒJ',5,NULL,'¢ŠE‚Å‚àˆ¤‚³‚ê‚½ˆê‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(34,'ƒRƒ~ƒ…ƒjƒP[ƒVƒ‡ƒ“',2012,'’†“cƒ„ƒXƒ^ƒJ',NULL,1,'ƒvƒ‹ƒvƒ‹‚Â‚ñ‚Â‚ñ','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(35,'Spring of Life',2012,'’†“cƒ„ƒXƒ^ƒJ',7,1,'ˆß‘•‚ªŒõ‚é','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(36,'Hurly Burly',2012,'’†“cƒ„ƒXƒ^ƒJ',10,1,'ƒ|ƒbƒv‚Èƒ_ƒ“ƒXƒiƒ“ƒo[','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(37,'Spending all my time',2012,'’†“cƒ„ƒXƒ^ƒJ',7,1,'ŠCŠOio‚·‚éÛ‚Éo‚µ‚½‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(38,'‚¾‚¢‚¶‚å‚Î‚È‚¢',2013,'’†“cƒ„ƒXƒ^ƒJ',7,NULL,'‚Ì‚Á‚¿‚ªŒC‚ğ‚Æ‚Î‚µ‚½‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(39,'–¢—ˆ‚Ìƒ~ƒ…[ƒWƒAƒ€',2013,'’†“cƒ„ƒXƒ^ƒJ',7,3,'‰f‰æuƒhƒ‰‚¦‚à‚ñv‚Ìå‘è‰Ì','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(40,'Magic of Love',2013,'’†“cƒ„ƒXƒ^ƒJ',7,1,'uƒsƒ…ƒŒƒOƒ~v‚ÌCM‹N—p','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(41,'Handy Man',2013,'’†“cƒ„ƒXƒ^ƒJ',7,NULL,'‚Ì‚Á‚¿‚ªŠCŠO‚Å·‘å‚ÉŠÔˆá‚¦‚½‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(42,'‚Ó‚è‚©‚¦‚é‚Æ‚¢‚é‚æ',2013,'’†“cƒ„ƒXƒ^ƒJ',7,NULL,'—H—ì‚Ì‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(43,'Party Maker',2013,'’†“cƒ„ƒXƒ^ƒJ',7,NULL,'·‚èã‚ª‚é‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(44,'1mm',2013,'’†“cƒ„ƒXƒ^ƒJ',7,NULL,'ÅI“dÔ‚É—h‚ç‚ê‚Ä‚é','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(45,'Sweet Refrain',2013,'’†“cƒ„ƒXƒ^ƒJ',8,2,'’·àV‚Ü‚³‚İå‰‰ƒhƒ‰ƒ}‚Ìå‘è‰Ì','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(46,'—ö‚Í‘OŒXp¨',2013,'’†“cƒ„ƒXƒ^ƒJ',8,NULL,'‚Ü‚¦‚Ì‚ß‚è','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(47,'Cling Cling',2014,'’†“cƒ„ƒXƒ^ƒJ',8,1,'ƒVƒ“ƒOƒ‹‚È‚Ì‚ÉCD‚ª‚©‚È‚è‘å‚«‚¢','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(48,'‚¢‚¶‚í‚é‚Èƒnƒ[',2014,'’†“cƒ„ƒXƒ^ƒJ',NULL,NULL,'Cling@Cling@‚ÌƒJƒbƒvƒŠƒ“ƒO','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(49,'DISPLAY',2014,'’†“cƒ„ƒXƒ^ƒJ',10,1,'‚SKƒeƒŒƒr‚ÌCM','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(50,'Hold Your Hand',2014,'’†“cƒ„ƒXƒ^ƒJ',8,2,'ƒtƒ@ƒ“‚Æì‚Á‚½PV‚ªˆóÛ“I','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(51,'Pick Me Up',2015,'’†“cƒ„ƒXƒ^ƒJ',8,1,'ˆÉ¨’O‚Æ‚ÌƒRƒ‰ƒ{','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(52,'Relax In The City',2015,'’†“cƒ„ƒXƒ^ƒJ',8,1,'ƒVƒ“ƒOƒ‹‚È‚Ì‚ÉCD‚ª‚©‚È‚è‘å‚«‚¢” ','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(53,'TOKIMEKI LIGHTS',2015,'’†“cƒ„ƒXƒ^ƒJ',8,NULL,'D‚«‚È‹È‚¾‚ªˆóÛ‚ª”–‚¢','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(54,'STAR TRAIN',2015,'’†“cƒ„ƒXƒ^ƒJ',8,3,'15”N‚Ì‚·‚×‚Ä‚ğ‹l‚ß‚ñ‚¾‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(55,'FLASH',2016,'’†“cƒ„ƒXƒ^ƒJ',8,3,'‰f‰æu‚¿‚Í‚â‚Ó‚év‚Åg—p‚³‚ê‚½','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(56,'STORY',2016,'’†“cƒ„ƒXƒ^ƒJ',8,1,'docomo‚ÌŠé‰æ‚Å4G‚ğg‚Á‚½‰‰o‚ª‚·‚²‚©‚Á‚½','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(57,'Next Stage with YOU',2016,'’†“cƒ„ƒXƒ^ƒJ',8,1,'ƒxƒ“ƒcCM‚É‹N—p','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(58,'Miracle Worker',2016,'’†“cƒ„ƒXƒ^ƒJ',8,NULL,'‹È‚Ì“r’†‚Ìu‚¨‚±‚¹ƒ~ƒ‰ƒR[v‚ª“Á’¥“I','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(59,'Cosmic Explorer',2016,'’†“cƒ„ƒXƒ^ƒJ',8,NULL,'ƒAƒ‹ƒoƒ€‰‚ß‚Ì‹ÈB','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(60,'TOKYO GIRL',2017,'’†“cƒ„ƒXƒ^ƒJ',9,2,'‹g‚—R—¢qå‰‰ƒhƒ‰ƒ}‚Ìå‘è‰Ì','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(61,'•óÎ‚Ì‰J',2017,'’†“cƒ„ƒXƒ^ƒJ',9,1,'¢Ora2£ TV CMƒ\ƒ“ƒO','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(62,'Everyday',2017,'’†“cƒ„ƒXƒ^ƒJ',9,1,'upnasonicv‚Ìô‘ó‹@‚ÌCM','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(63,'If you wanna',2017,'’†“cƒ„ƒXƒ^ƒJ',9,NULL,'ƒtƒ…[ƒ`ƒƒ[ƒx[ƒX‚ğæ‚è“ü‚ê‚½‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(64,'–³ŒÀ–¢—ˆ',2018,'’†“cƒ„ƒXƒ^ƒJ',9,3,'‰f‰æu‚¿‚Í‚â‚Ó‚év‚Åg—p‚³‚ê‚½','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(65,'Let Me Know',2018,'’†“cƒ„ƒXƒ^ƒJ',9,NULL,'PV‚ª‰Âˆ¤‚¢','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(66,'“V‹ó',2018,'’†“cƒ„ƒXƒ^ƒJ',9,1,'docomo‚ÌCM‚Åg—pA2019”NÅ‰‚É”â˜I‚µ‚½‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(67,'Tiny Baby',2018,'’†“cƒ„ƒXƒ^ƒJ',9,NULL,'ƒ‰ƒCƒu‰‰o‚ª‚·‚²‚¢','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(68,'Future Pop',2018,'’†“cƒ„ƒXƒ^ƒJ',9,NULL,'2019”Ng”’‚Å”â˜I‚µ‚½‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(69,'ƒiƒiƒiƒiƒiƒCƒ',2019,'’†“cƒ„ƒXƒ^ƒJ',10,1,'—·‚ğƒe[ƒ}‚Æ‚µ‚½‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(70,'Challenger',2019,'’†“cƒ„ƒXƒ^ƒJ',10,NULL,'’†“cƒ„ƒXƒ^ƒJ‚Æ‚Ìo‰ï‚¢‚Ì‹È','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(72,'Perfume',2006,'',NULL,NULL,'','0','2019-11-06 14:01:10','2019-11-06 14:01:10');
/*!40000 ALTER TABLE `perfume_main_anzai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `player_bt_kuramoto`
--

DROP TABLE IF EXISTS `player_bt_kuramoto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player_bt_kuramoto` (
  `id` int(11) DEFAULT NULL,
  `bt_info` varchar(5) DEFAULT NULL,
  `del_flg` int(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `player_bt_kuramoto`
--

LOCK TABLES `player_bt_kuramoto` WRITE;
/*!40000 ALTER TABLE `player_bt_kuramoto` DISABLE KEYS */;
INSERT INTO `player_bt_kuramoto` VALUES (0,NULL,0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(1,'‰E“ŠE‰E‘Å',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(2,'‰E“ŠE¶‘Å',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(3,'‰E“ŠE—¼‘Å',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(4,'¶“ŠE‰E‘Å',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(5,'¶“ŠE¶‘Å',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(6,'¶“ŠE—¼‘Å',0,'2021-05-19 00:00:00','2021-05-19 00:00:00');
/*!40000 ALTER TABLE `player_bt_kuramoto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `player_main_kuramoto`
--

DROP TABLE IF EXISTS `player_main_kuramoto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player_main_kuramoto` (
  `id` int(11) DEFAULT NULL,
  `player_name` varchar(256) DEFAULT NULL,
  `position_id` int(11) DEFAULT NULL,
  `bt_id` int(11) DEFAULT NULL,
  `player_age` int(2) DEFAULT NULL,
  `player_years` int(2) DEFAULT NULL,
  `player_place` varchar(256) DEFAULT NULL,
  `del_flg` int(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `player_main_kuramoto`
--

LOCK TABLES `player_main_kuramoto` WRITE;
/*!40000 ALTER TABLE `player_main_kuramoto` DISABLE KEYS */;
INSERT INTO `player_main_kuramoto` VALUES (3,'O“ˆˆê‹P',1,3,9,9,'•Ÿ‰ªŒ§',0,'2021-05-19 00:00:00','2021-06-02 11:27:40'),(4,'RèNW',1,1,28,7,'“Œ‹“s',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(5,'à_Œû—y‘å',1,5,26,5,'²‰êŒ§',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(6,'•½“c^Œá',1,1,31,8,'RŒûŒ§',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(7,'Oã•ü–ç',1,1,32,8,'Šò•ŒŒ§',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(8,'F.ƒƒƒ',1,1,26,1,'ƒhƒ~ƒjƒJ‹¤˜a‘',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(9,'M..ƒs[ƒvƒ‹ƒY',1,1,29,2,'ƒAƒƒŠƒJ',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(10,'»“c‹B÷',1,5,25,8,'–kŠC“¹',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(11,'E.ƒGƒXƒRƒo[',1,5,29,5,'ƒxƒlƒYƒGƒ‰',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(12,'‘‹g—C÷',1,1,29,12,'‘åã•{',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(13,'’†ìŒÕ‘å',1,1,21,4,'˜a‰ÌRŒ§',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(14,'‚érl',2,1,28,10,'•Ÿ‰ªŒ§',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(15,'—äˆä”Šó',2,1,29,8,'‰«“êŒ§',1,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(16,'’†ˆä‘å‰î',3,1,31,14,'OdŒ§',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(17,'–qGŒá',3,1,23,1,'’·–ìŒ§',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(18,'‘å˜a',3,1,33,16,'­™“‡Œ§',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(19,'“c’†r‘¾',3,2,27,4,'_“ŞìŒ§',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(20,'‹{è•q˜Y',3,1,32,9,'²‰êŒ§',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(21,'’m–ì’¼l',3,1,22,3,'VŠƒŒ§',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(22,'R‰ºK‹P',3,2,28,7,'ç—tŒ§',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(23,'N.ƒ\ƒg',3,1,32,4,'ƒvƒGƒ‹ƒgƒŠƒR',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(24,'ŒKŒ´«u',4,1,27,10,'‘åã•{',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(25,'²–ìŒb‘¾',4,2,26,5,'‰ªRŒ§',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(26,'_—¢˜a‹B',4,2,27,4,'‰«“êŒ§',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(27,'T.ƒI[ƒXƒeƒBƒ“',4,1,29,2,'ƒAƒƒŠƒJ',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(28,'‰³â’q',4,2,27,10,'_“ŞìŒ§',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(29,'ŠÖª‘å‹C',4,5,25,8,'ˆ¤’mŒ§',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(30,'¡‰i¸‘¾',1,5,27,6,'•Ÿ‰ªŒ§',0,'2021-06-01 15:31:56','2021-06-01 15:31:56'),(31,'“í–{‘×j',4,2,25,4,'‘åã•{',0,'2021-06-01 15:37:26','2021-06-01 15:37:26');
/*!40000 ALTER TABLE `player_main_kuramoto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `player_position_kuramoto`
--

DROP TABLE IF EXISTS `player_position_kuramoto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `player_position_kuramoto` (
  `id` int(11) DEFAULT NULL,
  `position_name` varchar(3) DEFAULT NULL,
  `del_flg` int(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `player_position_kuramoto`
--

LOCK TABLES `player_position_kuramoto` WRITE;
/*!40000 ALTER TABLE `player_position_kuramoto` DISABLE KEYS */;
INSERT INTO `player_position_kuramoto` VALUES (0,NULL,0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(1,'“Šè',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(2,'•ßè',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(3,'“à–ìè',0,'2021-05-19 00:00:00','2021-05-19 00:00:00'),(4,'ŠO–ìè',0,'2021-05-19 00:00:00','2021-05-19 00:00:00');
/*!40000 ALTER TABLE `player_position_kuramoto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `position_takahashi`
--

DROP TABLE IF EXISTS `position_takahashi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `position_takahashi` (
  `id` int(11) DEFAULT NULL,
  `position` varchar(256) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `position_takahashi`
--

LOCK TABLES `position_takahashi` WRITE;
/*!40000 ALTER TABLE `position_takahashi` DISABLE KEYS */;
INSERT INTO `position_takahashi` VALUES (0,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(1,'ƒ|ƒCƒ“ƒgƒK[ƒh','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(2,'ƒVƒ…[ƒeƒBƒ“ƒOƒK[ƒh','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(3,'ƒXƒ‚[ƒ‹ƒtƒHƒ[ƒh','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(4,'ƒpƒ[ƒtƒHƒ[ƒh','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(5,'ƒZƒ“ƒ^[','0','2021-05-18 00:00:00','2021-05-18 00:00:00');
/*!40000 ALTER TABLE `position_takahashi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resipe_main_ishikawa`
--

DROP TABLE IF EXISTS `resipe_main_ishikawa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resipe_main_ishikawa` (
  `id` int(11) DEFAULT NULL,
  `resipe_title` varchar(256) DEFAULT NULL,
  `resipe_title2` varchar(256) DEFAULT NULL,
  `vegetable_id1` int(11) DEFAULT NULL,
  `vegetable_id2` int(11) DEFAULT NULL,
  `genre_id` int(11) DEFAULT NULL,
  `cook_time` int(3) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resipe_main_ishikawa`
--

LOCK TABLES `resipe_main_ishikawa` WRITE;
/*!40000 ALTER TABLE `resipe_main_ishikawa` DISABLE KEYS */;
INSERT INTO `resipe_main_ishikawa` VALUES (1,'ƒJƒŒ[','‚©‚ê[',1,2,1,40,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(2,'ƒNƒŠ[ƒ€ƒVƒ`ƒ…[','‚­‚è[‚Ş‚µ‚¿‚ã[',1,2,1,40,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(3,'“÷‚¶‚á‚ª','‚É‚­‚¶‚á‚ª',1,2,1,40,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(4,'ƒ[ƒ‹ƒLƒƒƒxƒc','‚ë[‚é‚«‚á‚×‚Â',3,4,2,50,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(5,'ƒ|ƒgƒt','‚Û‚Æ‚Ó',2,3,3,30,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(6,'”’Øƒ~ƒ‹ƒtƒB[ƒ†','‚Í‚­‚³‚¢‚İ‚é‚Ó‚¡[‚ä',5,0,2,25,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(7,'|“Ø','‚·‚Ô‚½',1,3,2,15,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(8,'‰Ä–ìØƒOƒ‰ƒ^ƒ“','‚È‚Â‚â‚³‚¢‚®‚ç‚½‚ñ',7,8,3,15,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(9,'‚İ‚¼‚ê“ç','‚İ‚¼‚ê‚È‚×',5,11,2,20,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(10,'‚«‚ñ‚Ò‚ç','‚«‚ñ‚Ò‚ç',1,10,3,20,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(11,'ƒs[ƒ}ƒ“‚Ì“÷‹l‚ß','‚Ò[‚Ü‚ñ‚Ì‚É‚­‚Ã‚ß',3,6,2,20,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(12,'ƒnƒ“ƒo[ƒO','‚Í‚ñ‚Î[‚®',3,0,2,20,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(13,'eq˜¥','‚¨‚â‚±‚Ç‚ñ',3,0,1,15,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(14,'â¡‚²‚Í‚ñ','‚½‚¯‚Ì‚±‚²‚Í‚ñ',12,0,1,90,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(15,'‹˜¥','‚¬‚ã‚¤‚Ç‚ñ',3,0,1,15,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(16,'‚©‚Ú‚¿‚á‚ÌÏ•¨','‚©‚Ú‚¿‚á‚Ì‚É‚à‚Ì',9,0,3,25,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(17,'“Ø`','‚Æ‚ñ‚¶‚é',1,3,3,20,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(18,'ŒI‚²”Ñ','‚­‚è‚²‚Í‚ñ',13,0,1,90,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(19,'ƒ|ƒeƒgƒTƒ‰ƒ_','‚Û‚Ä‚Æ‚³‚ç‚¾',2,3,3,15,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(20,'ƒiƒ|ƒŠƒ^ƒ“','‚È‚Û‚è‚½‚ñ',6,8,1,15,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(21,'ƒ‰ƒ^ƒgƒ…ƒ†','‚ç‚½‚Æ‚¡‚ä',7,8,3,40,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(22,'ƒrƒVƒ\ƒ[ƒY','‚Ñ‚µ‚»‚í[‚¸',2,0,3,20,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(23,'ƒgƒ}ƒgÏ','‚Æ‚Ü‚Æ‚É',3,7,3,20,'0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(24,'ƒ|ƒ‚ƒh[ƒ','‚Û‚à‚Ç[‚ë',7,8,1,15,'0','2018-10-10 00:00:00','2018-10-10 00:00:00');
/*!40000 ALTER TABLE `resipe_main_ishikawa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `team_takahashi`
--

DROP TABLE IF EXISTS `team_takahashi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `team_takahashi` (
  `id` int(11) DEFAULT NULL,
  `team_name` varchar(256) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team_takahashi`
--

LOCK TABLES `team_takahashi` WRITE;
/*!40000 ALTER TABLE `team_takahashi` DISABLE KEYS */;
INSERT INTO `team_takahashi` VALUES (0,NULL,'0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(1,'ƒ{ƒXƒgƒ“EƒZƒ‹ƒeƒBƒbƒNƒX','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(2,'ƒuƒ‹ƒbƒNƒŠƒ“Eƒlƒbƒc','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(3,'ƒjƒ…[ƒˆ[ƒNEƒjƒbƒNƒX','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(4,'ƒtƒBƒ‰ƒfƒ‹ƒtƒBƒAEƒZƒuƒ“ƒeƒBƒVƒNƒT[ƒY','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(5,'ƒgƒƒ“ƒgEƒ‰ƒvƒ^[ƒY','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(6,'ƒVƒJƒSEƒuƒ‹ƒY','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(7,'ƒNƒŠ[ƒuƒ‰ƒ“ƒgEƒLƒƒƒoƒŠƒA[ƒY','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(8,'ƒfƒgƒƒCƒgEƒsƒXƒgƒ“ƒY','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(9,'ƒCƒ“ƒfƒBƒAƒiEƒyƒCƒT[ƒY','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(10,'ƒ~ƒ‹ƒEƒH[ƒL[EƒoƒbƒNƒX','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(11,'ƒAƒgƒ‰ƒ“ƒ^Eƒz[ƒNƒX','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(12,'ƒVƒƒ[ƒƒbƒgEƒz[ƒlƒbƒc','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(13,'ƒ}ƒCƒAƒ~Eƒq[ƒg','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(14,'ƒI[ƒ‰ƒ“ƒhEƒ}ƒWƒbƒN','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(15,'ƒƒVƒ“ƒgƒ“EƒEƒBƒU[ƒY','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(16,'ƒfƒ“ƒo[EƒiƒQƒbƒc','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(17,'ƒ~ƒlƒ\ƒ^EƒeƒBƒ“ƒo[ƒEƒ‹ƒuƒY','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(18,'ƒIƒNƒ‰ƒzƒ}ƒVƒeƒBEƒTƒ“ƒ_[','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(19,'ƒ|[ƒgƒ‰ƒ“ƒhEƒgƒŒƒCƒ‹ƒuƒŒƒCƒU[ƒY','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(20,'ƒ†ƒ^EƒWƒƒƒY','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(21,'ƒS[ƒ‹ƒfƒ“ƒXƒeƒCƒgEƒEƒHƒŠƒA[ƒY','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(22,'ƒƒTƒ“ƒ[ƒ‹ƒXEƒNƒŠƒbƒp[ƒY','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(23,'ƒƒTƒ“ƒ[ƒ‹ƒXEƒŒƒCƒJ[ƒY','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(24,'ƒtƒFƒjƒbƒNƒXEƒTƒ“ƒY','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(25,'ƒTƒNƒ‰ƒƒ“ƒgEƒLƒ“ƒOƒX','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(26,'ƒ_ƒ‰ƒXEƒ}[ƒxƒŠƒbƒNƒX','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(27,'ƒqƒ…[ƒXƒgƒ“EƒƒPƒbƒc','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(28,'ƒƒ“ƒtƒBƒXEƒOƒŠƒYƒŠ[ƒY','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(29,'ƒjƒ…[ƒI[ƒŠƒ“ƒYEƒyƒŠƒJƒ“ƒY','0','2021-05-18 00:00:00','2021-05-18 00:00:00'),(30,'ƒTƒ“ƒAƒ“ƒgƒjƒIEƒXƒp[ƒY','0','2021-05-18 00:00:00','2021-05-18 00:00:00');
/*!40000 ALTER TABLE `team_takahashi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tieup_anzai`
--

DROP TABLE IF EXISTS `tieup_anzai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tieup_anzai` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tieup` varchar(256) NOT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tieup_anzai`
--

LOCK TABLES `tieup_anzai` WRITE;
/*!40000 ALTER TABLE `tieup_anzai` DISABLE KEYS */;
INSERT INTO `tieup_anzai` VALUES (0,'','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(1,'CM','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(2,'ƒhƒ‰ƒ}','0','2019-10-29 00:00:00','2019-10-29 00:00:00'),(3,'‰f‰æ','0','2019-10-29 00:00:00','2019-10-29 00:00:00');
/*!40000 ALTER TABLE `tieup_anzai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tokyo_main_takehara`
--

DROP TABLE IF EXISTS `tokyo_main_takehara`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tokyo_main_takehara` (
  `id` int(2) NOT NULL,
  `ward_name` varchar(20) NOT NULL,
  `symbol` varchar(256) DEFAULT NULL,
  `location_id` int(1) NOT NULL,
  `population` int(7) DEFAULT NULL,
  `area` float DEFAULT NULL,
  `ward_office` varchar(20) DEFAULT NULL,
  `average_annual_income` int(4) DEFAULT NULL,
  `official_land_price` int(7) DEFAULT NULL,
  `performer` varchar(10) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tokyo_main_takehara`
--

LOCK TABLES `tokyo_main_takehara` WRITE;
/*!40000 ALTER TABLE `tokyo_main_takehara` DISABLE KEYS */;
INSERT INTO `tokyo_main_takehara` VALUES (1,'ç‘ã“c','/tokyoTakehara/chiyoda.jpg',5,64533,11.66,'‹ã’i‰º',784,6330721,'÷–ØŠó—Ñ','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(2,'’†‰›','/tokyoTakehara/chuo.png',1,163185,10.21,'V•x’¬',556,8219777,'á—Ñ³‹±','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(3,'`','/tokyoTakehara/minato.png',3,258075,20.37,'‘å–å',902,3611975,'ŠÖª‹Î','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(4,'Vh','/tokyoTakehara/shinjuku.png',2,347661,18.22,'Vh¼Œû',477,3263794,'ƒ‹[‘åÄ','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(5,'•¶‹','/tokyoTakehara/bunkyo.png',4,232801,11.29,'ŒãŠy‰€',544,1181450,'–ìX‘º^','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(6,'‘ä“Œ','/tokyoTakehara/taito.png',1,206816,10.11,'ã–ì',385,1376259,'“VŠC—SŠó','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(7,'–n“c','/tokyoTakehara/sumida.png',1,268192,13.77,'ó‘',350,589458,'‘å’|ˆê÷','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(8,']“Œ','/tokyoTakehara/koto.png',1,516636,40.16,'“Œ—z’¬',389,583708,'“cD','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(9,'•iì','/tokyoTakehara/shinagawa.png',3,407084,22.84,'‰º_–¾',427,1160600,'‰““¡Œ›ˆê','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(10,'–Ú•','/tokyoTakehara/meguro.png',3,286462,14.67,'’†–Ú•',537,1195400,'ò’J‚µ‚°‚é','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(11,'‘å“c','/tokyoTakehara/ota.png',3,737700,60.83,'Š—“c',395,627693,'•Ğ‹Ë‚Í‚¢‚è','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(12,'¢“c’J','/tokyoTakehara/setagaya.png',2,933708,58.05,'¢“c’J',506,690153,'’†ˆä‹Mˆê','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(13,'a’J','/tokyoTakehara/shibuya.png',2,233060,15.11,'a’J',703,4234271,'‹g‰i¬•S‡','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(14,'’†–ì','/tokyoTakehara/nakano.png',2,328215,15.59,'’†–ì',387,812547,'“c’†—T“ñ','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(15,'™•À','/tokyoTakehara/suginami.png',2,582864,34.06,'“ìˆ¢²ƒ–’J',436,617023,'¼“c—´•½','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(16,'–L“‡','/tokyoTakehara/toshima.png',4,300512,13.01,'“Œ’r‘Ü',412,1147581,'R‰º’B˜Y','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(17,'–k','/tokyoTakehara/kita.png',4,352806,20.61,'‰¤q',344,657836,'ŒÃŠÚˆÉ’m˜Y','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(18,'rì','/tokyoTakehara/arakawa.png',4,217692,10.16,'rì“ñ’š–Ú',345,605586,'•Ğ‰ª’ß‘¾˜Y','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(19,'”Â‹´','/tokyoTakehara/itabashi.png',4,581066,32.22,'”Â‹´‹æ–ğŠ‘O',350,475214,'ˆîŠ_Œá˜Y','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(20,'—û”n','/tokyoTakehara/nerima.png',2,737906,48.08,'—û”n',395,435136,'ãŒËÊ','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(21,'‘«—§','/tokyoTakehara/adachi.png',4,681309,53.25,'”~“‡',324,367663,'ƒr[ƒg‚½‚¯‚µ','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(22,'Š‹ü','/tokyoTakehara/katsushika.png',1,453522,34.8,'¼Vˆä‘åt¼',333,362640,'“ñ‹{˜a–ç','0','2019-05-20 00:00:00','2019-05-20 00:00:00'),(23,']ŒËì','/tokyoTakehara/edogawa.png',1,693519,49.9,'V¬Šâ',346,392703,'¼è‚µ‚°‚é','0','2019-05-20 00:00:00','2019-05-20 00:00:00');
/*!40000 ALTER TABLE `tokyo_main_takehara` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `triathlon_main_mori`
--

DROP TABLE IF EXISTS `triathlon_main_mori`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `triathlon_main_mori` (
  `id` int(11) NOT NULL,
  `name` varchar(256) NOT NULL,
  `type_id` int(11) DEFAULT NULL,
  `maker_id` int(11) DEFAULT NULL,
  `price` int(7) DEFAULT NULL,
  `image` varchar(256) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `triathlon_main_mori`
--

LOCK TABLES `triathlon_main_mori` WRITE;
/*!40000 ALTER TABLE `triathlon_main_mori` DISABLE KEYS */;
INSERT INTO `triathlon_main_mori` VALUES (1,'RS9s',1,1,800000,'/TriathlonMori/001.jpg','0','2020-03-11 00:00:00','2020-03-23 15:02:09'),(2,'RT9',2,1,410000,'/TriathlonMori/002.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(3,'GALLIUM PRO',1,2,380000,'/TriathlonMori/003.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(4,'E-119 TRI+',2,2,576000,'/TriathlonMori/004.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(5,'OLTRE XR4',1,3,1780000,'/TriathlonMori/005.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(6,'AQUILA CV',2,3,900000,'/TriathlonMori/006.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(7,'G8 PRO',1,4,748000,'/TriathlonMori/007.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(8,'AEROLIGHT',2,4,1050000,'/TriathlonMori/008.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(9,'Timemachine Road 01',1,5,880000,'/TriathlonMori/009.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(10,'Timemachine 01',2,5,870000,'/TriathlonMori/010.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(11,'VIDE pro CT-RTV',1,6,500000,'/TriathlonMori/011.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(12,'SWOOP CT-TT',2,6,418000,'/TriathlonMori/012.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(13,'Ultomate CF Evo',1,7,899000,'/TriathlonMori/013.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(14,'Speedmax CF SLX LTD',2,7,1109000,'/TriathlonMori/014.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(15,'S5',1,8,1580000,'/TriathlonMori/015.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(16,'P5X',2,8,2280000,'/TriathlonMori/016.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(17,'RB1K \"THE ONE\"',1,9,720000,'/TriathlonMori/017.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(18,'NKTT',2,9,990000,'/TriathlonMori/018.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(19,'C64',1,10,738000,'/TriathlonMori/019.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(20,'K.one',2,10,620000,'/TriathlonMori/020.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(21,'LITENING C:68X SLT',1,11,1176000,'/TriathlonMori/021.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(22,'AERIUM C:68 SLT',2,11,1387000,'/TriathlonMori/022.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(23,'TRILLIANT',2,12,470000,'/TriathlonMori/023.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(24,'CARBONADO',2,12,370000,'/TriathlonMori/024.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(25,'525',1,13,466000,'/TriathlonMori/025.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(26,'LUGANO68',2,13,278000,'/TriathlonMori/026.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(27,'O2 V.A.M',1,14,590000,'/TriathlonMori/027.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(28,'SLICK',2,14,680000,'/TriathlonMori/028.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(29,'FR FRD',1,15,1980000,'/TriathlonMori/029.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(30,'IA FRD',2,15,2480000,'/TriathlonMori/030.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(31,'TRANSONIC 1.1',1,16,340000,'/TriathlonMori/031.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(32,'NORCOM STRAIGHT 1.1',2,16,290000,'/TriathlonMori/032.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(33,'PROPEL ADVANCED SL',1,17,1300000,'/TriathlonMori/033.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(34,'TRINITY ADVANCE PRO 1',2,17,690000,'/TriathlonMori/034.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(35,'STRAUSS PRO',1,18,248000,'/TriathlonMori/035.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(36,'STRAUSS TRI',2,18,199000,'/TriathlonMori/036.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(37,'KHAN',1,19,365000,'/TriathlonMori/037.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(38,'KT05',2,19,460000,'/TriathlonMori/038.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(39,'SCULTURA 10K-E',1,20,1200000,'/TriathlonMori/039.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(40,'TIME WARP TRI 10K-E',2,20,1350000,'/TriathlonMori/040.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(41,'DOGMA F12',1,21,1300000,'/TriathlonMori/041.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(42,'BOLIDE TR+',2,21,1570000,'/TriathlonMori/042.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(43,'HELIUM SLX',1,22,365000,'/TriathlonMori/043.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(44,'DEAN',2,22,323000,'/TriathlonMori/044.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(45,'FOIL PREMIUM',1,23,1118000,'/TriathlonMori/045.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(46,'PLASMA RC',2,23,1190000,'/TriathlonMori/046.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(47,'S-Works VENGE',1,24,1375000,'/TriathlonMori/047.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(48,'S-Works Shiv',2,24,1404000,'/TriathlonMori/048.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(49,'Madone SLR 9',1,25,1281000,'/TriathlonMori/049.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(50,'Speed Concept',2,25,510000,'/TriathlonMori/050.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(51,'ZERO SLR',1,26,590000,'/TriathlonMori/051.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(52,'TURBINE',2,26,650000,'/TriathlonMori/052.jpg','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(53,'‚±‚¶‚ë‚¤',0,0,100,'/TriathlonMori/20200323150234372.jpg','0','2020-03-19 11:02:07','2020-03-23 15:02:34'),(54,'‚à‚à',1,8,9999999,NULL,'1','2020-03-23 09:12:05','2020-03-23 09:12:05'),(55,'‚à‚à',1,10,1,'/TriathlonMori/20200323150336788.jpg','0','2020-03-23 15:03:36','2020-03-23 15:03:36');
/*!40000 ALTER TABLE `triathlon_main_mori` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `type_mori`
--

DROP TABLE IF EXISTS `type_mori`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `type_mori` (
  `id` int(11) NOT NULL,
  `type` varchar(256) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime NOT NULL,
  `update_date` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `type_mori`
--

LOCK TABLES `type_mori` WRITE;
/*!40000 ALTER TABLE `type_mori` DISABLE KEYS */;
INSERT INTO `type_mori` VALUES (0,NULL,'0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(1,'ƒ[ƒhƒoƒCƒN','0','2020-03-11 00:00:00','2020-03-11 00:00:00'),(2,'ƒ^ƒCƒ€ƒgƒ‰ƒCƒAƒ‹ƒoƒCƒNiTT)','0','2020-03-11 00:00:00','2020-03-11 00:00:00');
/*!40000 ALTER TABLE `type_mori` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `password` varchar(50) CHARACTER SET utf8 NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Spring','Boot');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vegetable_ishikawa`
--

DROP TABLE IF EXISTS `vegetable_ishikawa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vegetable_ishikawa` (
  `id` int(11) DEFAULT NULL,
  `vegetable` varchar(256) DEFAULT NULL,
  `del_flg` varchar(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `update_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vegetable_ishikawa`
--

LOCK TABLES `vegetable_ishikawa` WRITE;
/*!40000 ALTER TABLE `vegetable_ishikawa` DISABLE KEYS */;
INSERT INTO `vegetable_ishikawa` VALUES (1,'‚É‚ñ‚¶‚ñ','0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(2,'‚¶‚á‚ª‚¢‚à','0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(3,'‚½‚Ü‚Ë‚¬','0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(4,'ƒLƒƒƒxƒc','0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(5,'”’Ø','0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(6,'ƒs[ƒ}ƒ“','0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(7,'ƒgƒ}ƒg','0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(8,'ƒiƒX','0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(9,'‚©‚Ú‚¿‚á','0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(10,'‚²‚Ú‚¤','0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(11,'‚¾‚¢‚±‚ñ','0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(12,'â¡','0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(13,'ŒI','0','2018-10-10 00:00:00','2018-10-10 00:00:00'),(0,'','0','2018-10-10 00:00:00','2018-10-10 00:00:00');
/*!40000 ALTER TABLE `vegetable_ishikawa` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-09 16:14:57
