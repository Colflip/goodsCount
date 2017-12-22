/*
Navicat MySQL Data Transfer

Source Server         : goods
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : goods

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-12-23 00:56:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goodsinfo
-- ----------------------------
DROP TABLE IF EXISTS `goodsinfo`;
CREATE TABLE `goodsinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(120) NOT NULL,
  `price` double(10,2) NOT NULL,
  PRIMARY KEY (`id`,`name`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goodsinfo
-- ----------------------------
INSERT INTO `goodsinfo` VALUES ('1', 'guazi', '10.00');
INSERT INTO `goodsinfo` VALUES ('2', 'huasheng', '20.00');
INSERT INTO `goodsinfo` VALUES ('3', 'qishui', '30.00');
INSERT INTO `goodsinfo` VALUES ('4', '苹果', '50.00');
SET FOREIGN_KEY_CHECKS=1;
