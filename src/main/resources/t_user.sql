/*
Navicat MySQL Data Transfer

Source Server         : mydb
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2017-03-02 09:10:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `USER_NAME` char(30) NOT NULL,
  `USER_PASSWORD` char(10) NOT NULL,
  `USER_EMAIL` char(30) NOT NULL,
  PRIMARY KEY (`USER_ID`),
  KEY `IDX_NAME` (`USER_NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=233 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '林炳文', '1234567@', 'ling20081005@126.com');
INSERT INTO `t_user` VALUES ('2', 'evan', '123', 'fff@126.com');
INSERT INTO `t_user` VALUES ('3', 'kaka', 'cadg', 'fwsfg@126.com');
INSERT INTO `t_user` VALUES ('4', 'simle', 'cscs', 'fsaf@126.com');
INSERT INTO `t_user` VALUES ('5', 'arthur', 'csas', 'fsaff@126.com');
INSERT INTO `t_user` VALUES ('6', '小德', 'yuh78', 'fdfas@126.com');
INSERT INTO `t_user` VALUES ('7', '小小', 'cvff', 'fsaf@126.com');
INSERT INTO `t_user` VALUES ('8', '林林之家', 'gvv', 'lin@126.com');
INSERT INTO `t_user` VALUES ('9', '林炳文Evankaka', 'dfsc', 'ling2008@126.com');
INSERT INTO `t_user` VALUES ('10', 'apple', 'uih6', 'ff@qq.com');
INSERT INTO `t_user` VALUES ('232', '强中强', 'sdf', '强中强');
