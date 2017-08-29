-- MySQL dump 10.13  Distrib 5.6.24, for osx10.8 (x86_64)
--
-- Host: 127.0.0.1    Database: resume
-- ------------------------------------------------------
-- Server version	5.7.9

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
-- Table structure for table `t_resume_detail`
--

DROP TABLE IF EXISTS `t_resume_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_resume_detail` (
  `id` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `mobile` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `avatar` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL,
  `live_address` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL,
  `working_years` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gender` varchar(4) COLLATE utf8_unicode_ci DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `work_state` varchar(4) COLLATE utf8_unicode_ci DEFAULT NULL,
  `is_recommend` varchar(4) COLLATE utf8_unicode_ci DEFAULT NULL,
  `home_city` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `qq` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `id_code` varchar(18) COLLATE utf8_unicode_ci DEFAULT NULL,
  `links` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL,
  `now_salary` varchar(12) COLLATE utf8_unicode_ci DEFAULT NULL,
  `intent_city` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `intent_work` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL,
  `intent_industry` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL,
  `arrival_time` datetime DEFAULT NULL,
  `self_evaluation` varchar(2048) COLLATE utf8_unicode_ci DEFAULT NULL,
  `hope_salary_low` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `hope_salary_high` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `face` varchar(4) COLLATE utf8_unicode_ci DEFAULT NULL,
  `hunyin` varchar(4) COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_by` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_modified_by` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_modified_time` datetime DEFAULT NULL,
  `option_time` datetime DEFAULT NULL,
  `mobile_phone` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `t_resume_detail_education_experience`
--

DROP TABLE IF EXISTS `t_resume_detail_education_experience`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_resume_detail_education_experience` (
  `id` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `resume_id` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `university_name` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL,
  `major_name` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `major_desc` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL,
  `degree` varchar(4) COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_by` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_modified_by` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_modified_time` datetime DEFAULT NULL,
  `option_time` datetime DEFAULT NULL,
  `mobile_phone` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `t_resume_detail_project_experience`
--

DROP TABLE IF EXISTS `t_resume_detail_project_experience`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_resume_detail_project_experience` (
  `id` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `resume_id` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `project_name` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL,
  `project_desc` text COLLATE utf8_unicode_ci,
  `reponsibility` text COLLATE utf8_unicode_ci,
  `create_by` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_modified_by` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_modified_time` datetime DEFAULT NULL,
  `option_time` datetime DEFAULT NULL,
  `mobile_phone` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `t_resume_detail_skills`
--

DROP TABLE IF EXISTS `t_resume_detail_skills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_resume_detail_skills` (
  `id` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `resume_id` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `skill_name` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `create_by` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_modified_by` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_modified_time` datetime DEFAULT NULL,
  `option_time` datetime DEFAULT NULL,
  `mobile_phone` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `t_resume_detail_work_experience`
--

DROP TABLE IF EXISTS `t_resume_detail_work_experience`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_resume_detail_work_experience` (
  `id` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `resume_id` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `company_name` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `company_type` varchar(4) COLLATE utf8_unicode_ci DEFAULT NULL,
  `department` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `size` varchar(12) COLLATE utf8_unicode_ci DEFAULT NULL,
  `work_desc` text COLLATE utf8_unicode_ci,
  `create_by` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_modified_by` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_modified_time` datetime DEFAULT NULL,
  `option_time` datetime DEFAULT NULL,
  `mobile_phone` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `t_sys_dynamic`
--

DROP TABLE IF EXISTS `t_sys_dynamic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_sys_dynamic` (
  `id` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `content` varchar(256) COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_by` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_modified_by` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_modified_time` datetime DEFAULT NULL,
  `option_time` datetime DEFAULT NULL,
  `mobile_phone` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `status` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `t_sys_login`
--

DROP TABLE IF EXISTS `t_sys_login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_sys_login` (
  `id` varchar(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `login_name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(128) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_by` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_modified_by` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_modified_time` datetime DEFAULT NULL,
  `option_time` datetime DEFAULT NULL,
  `mobile_phone` varchar(16) COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `t_sys_resume_count`
--

DROP TABLE IF EXISTS `t_sys_resume_count`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_sys_resume_count` (
  `id` varchar(32) COLLATE utf8_unicode_ci NOT NULL,
  `total_vips` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `status` varchar(8) COLLATE utf8_unicode_ci DEFAULT NULL,
  `create_by` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_modified_by` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_modified_time` datetime DEFAULT NULL,
  `option_time` datetime DEFAULT NULL,
  `total_companies` int(11) DEFAULT NULL,
  `total_resumes` int(11) DEFAULT NULL,
  `total_positions` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-08-29 22:28:14
