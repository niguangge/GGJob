/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : ggjob

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2018-05-26 11:56:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for comment_trust_list
-- ----------------------------
DROP TABLE IF EXISTS `comment_trust_list`;
CREATE TABLE `comment_trust_list` (
  `comment_id` int(100) NOT NULL,
  `user_id` varchar(100) NOT NULL,
  `is_trust` tinyint(4) DEFAULT NULL COMMENT '0 is trust, 1 is distrust.',
  PRIMARY KEY (`comment_id`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for offer_comments
-- ----------------------------
DROP TABLE IF EXISTS `offer_comments`;
CREATE TABLE `offer_comments` (
  `offer_id` int(100) unsigned NOT NULL,
  `comment_id` int(100) NOT NULL,
  `commentor_id` varchar(100) DEFAULT NULL,
  `comment_content` varchar(255) DEFAULT NULL,
  `like_number` int(100) DEFAULT NULL,
  PRIMARY KEY (`offer_id`,`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for offer_info
-- ----------------------------
DROP TABLE IF EXISTS `offer_info`;
CREATE TABLE `offer_info` (
  `offer_id` int(100) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `creator_id` varchar(255) NOT NULL,
  `create_time` varchar(255) DEFAULT NULL,
  `content` varchar(500) DEFAULT NULL,
  `trust_number` int(100) DEFAULT NULL,
  `heat` int(100) DEFAULT NULL,
  `comments_number` int(100) DEFAULT NULL,
  PRIMARY KEY (`offer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for offer_trust_list
-- ----------------------------
DROP TABLE IF EXISTS `offer_trust_list`;
CREATE TABLE `offer_trust_list` (
  `offer_id` int(100) NOT NULL,
  `user_id` varchar(100) NOT NULL,
  `is_trust` tinyint(4) DEFAULT NULL COMMENT '0 is trust, 1 is distrust.',
  PRIMARY KEY (`offer_id`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL COMMENT '主键',
  `name` varchar(20) DEFAULT NULL,
  `birthday` date DEFAULT NULL COMMENT '生日',
  `address` varchar(256) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` varchar(100) NOT NULL,
  `user_name` varchar(100) DEFAULT NULL,
  `user_ip` varchar(255) DEFAULT NULL,
  `registration_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `latest_login_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
