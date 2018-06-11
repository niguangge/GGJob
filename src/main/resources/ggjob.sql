/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : ggjob

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2018-06-11 21:40:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for comment_info
-- ----------------------------
DROP TABLE IF EXISTS `comment_info`;
CREATE TABLE `comment_info` (
  `comment_id` int(100) unsigned NOT NULL AUTO_INCREMENT,
  `offer_id` int(100) DEFAULT NULL,
  `commentor_id` int(100) DEFAULT NULL,
  `comment_time` datetime DEFAULT NULL,
  `comment_content` varchar(255) DEFAULT NULL,
  `like_number` int(100) DEFAULT NULL,
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment_info
-- ----------------------------

-- ----------------------------
-- Table structure for comment_like_list
-- ----------------------------
DROP TABLE IF EXISTS `comment_like_list`;
CREATE TABLE `comment_like_list` (
  `comment_id` int(100) NOT NULL,
  `user_id` varchar(100) NOT NULL,
  `is_like` int(4) DEFAULT NULL COMMENT '1 is likw, -1 is dislike.',
  PRIMARY KEY (`comment_id`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment_like_list
-- ----------------------------

-- ----------------------------
-- Table structure for offer_info
-- ----------------------------
DROP TABLE IF EXISTS `offer_info`;
CREATE TABLE `offer_info` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `company_name` varchar(255) DEFAULT NULL,
  `education` varchar(255) DEFAULT NULL,
  `salary_month` varchar(255) DEFAULT NULL,
  `salary_year` varchar(255) DEFAULT NULL,
  `external_content` varchar(255) DEFAULT NULL,
  `comment_number` int(100) DEFAULT NULL,
  `trust` int(255) DEFAULT NULL,
  `heat` int(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `creator_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of offer_info
-- ----------------------------
INSERT INTO `offer_info` VALUES ('1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2018-05-30 23:29:44', '2018-05-30 23:29:46', null);
INSERT INTO `offer_info` VALUES ('2', '1', '1', '1', '1', '1', '1', '1', '1', '1', '54', '2018-05-30 23:27:02', '2018-05-30 23:56:36', '0');
INSERT INTO `offer_info` VALUES ('3', '1', '1', '1', '1', '1', '1', '1', '1', '1', '76', '2018-05-30 23:28:02', '2018-05-30 23:56:38', '0');
INSERT INTO `offer_info` VALUES ('4', '1', '1', '1', '1', '1', '1', '1', '1', '1', '45', '2018-05-30 23:29:02', '2018-05-30 23:56:45', '0');
INSERT INTO `offer_info` VALUES ('5', '1', '1', '1', '1', '1', '1', '1', '1', '1', '56', '2018-05-30 23:30:02', '2018-05-30 23:56:31', '0');
INSERT INTO `offer_info` VALUES ('6', '1', '1', '1', '1', '1', '1', '1', '1', '1', '321', '2018-05-30 23:10:02', '2018-05-30 23:56:22', '0');
INSERT INTO `offer_info` VALUES ('7', '1', '1', '1', '1', '1', '1', '1', '1', '1', '90', '2018-05-30 23:11:02', '2018-05-30 23:56:29', '0');
INSERT INTO `offer_info` VALUES ('8', '1', '1', '1', '1', '1', '1', '1', '1', '1', '34', '2018-05-30 23:17:02', '2018-05-30 23:56:24', '0');
INSERT INTO `offer_info` VALUES ('9', '1', '1', '1', '1', '1', '1', '1', '1', '1', '52', '2018-05-30 23:14:02', '2018-05-30 23:56:26', '0');
INSERT INTO `offer_info` VALUES ('10', '1', '1', '1', '1', '1', '1', '1', '1', '1', '67', '2018-05-30 23:12:02', '2018-05-30 23:56:27', '0');
INSERT INTO `offer_info` VALUES ('11', '1', '1', '1', '1', '1', '1', '1', '1', '1', '23', '2018-05-30 23:22:02', '2018-05-30 23:56:21', '0');

-- ----------------------------
-- Table structure for offer_trust_list
-- ----------------------------
DROP TABLE IF EXISTS `offer_trust_list`;
CREATE TABLE `offer_trust_list` (
  `offer_id` int(100) NOT NULL,
  `user_id` varchar(100) NOT NULL,
  `is_trust` int(4) DEFAULT NULL COMMENT '1 is trust, -1 is distrust.',
  PRIMARY KEY (`offer_id`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of offer_trust_list
-- ----------------------------

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` int(100) unsigned NOT NULL AUTO_INCREMENT,
  `wx_id` varchar(100) DEFAULT NULL,
  `user_name` varchar(100) DEFAULT NULL,
  `user_ip` varchar(255) DEFAULT NULL,
  `registration_time` datetime DEFAULT NULL,
  `latest_login_time` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('2', null, '2', '2', '2018-05-26 13:58:57', '2018-05-26 13:58:57');
INSERT INTO `user_info` VALUES ('3', null, '2', '2', '2018-05-26 14:50:47', '2018-05-26 14:50:47');
INSERT INTO `user_info` VALUES ('4', '1', '1', '1', '2018-05-29 00:26:47', '2018-05-29 00:26:47');

-- ----------------------------
-- Event structure for insertIntoOfferInfo
-- ----------------------------
DROP EVENT IF EXISTS `insertIntoOfferInfo`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` EVENT `insertIntoOfferInfo` ON SCHEDULE AT '2018-05-30 23:27:15' ON COMPLETION NOT PRESERVE ENABLE DO INSERT INTO `ggjob`.`offer_info` (`id`, `title`, `category`, `company_name`, `education`, `salary_month`, `salary_year`, `external_content`, `comment_number`, `trust`, `heat`, `create_time`, `update_time`, `creator_id`) VALUES ('2', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2018-05-30 23:27:02', '2018-05-30 23:27:07', '0')
;;
DELIMITER ;
