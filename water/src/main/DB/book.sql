/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : db2

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2016-07-04 10:49:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `booktypes`
-- ----------------------------
DROP TABLE IF EXISTS `booktypes`;
CREATE TABLE `booktypes` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '���ͱ��',
  `typeName` varchar(100) NOT NULL COMMENT '��������',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=94 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of booktypes
-- ----------------------------
INSERT INTO `booktypes` VALUES ('1', '������������');
INSERT INTO `booktypes` VALUES ('2', '��������繤��');
INSERT INTO `booktypes` VALUES ('3', '��С˵');
INSERT INTO `booktypes` VALUES ('4', '�ƻ�С˵');
INSERT INTO `booktypes` VALUES ('5', '����');
INSERT INTO `booktypes` VALUES ('6', '��������');
INSERT INTO `booktypes` VALUES ('7', '91');
INSERT INTO `booktypes` VALUES ('8', '92');
INSERT INTO `booktypes` VALUES ('9', '93');
INSERT INTO `booktypes` VALUES ('91', '�������');
INSERT INTO `booktypes` VALUES ('92', '��ҵ���');
INSERT INTO `booktypes` VALUES ('93', '��������');