/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50620
 Source Host           : localhost:3306
 Source Schema         : springboot-demo

 Target Server Type    : MySQL
 Target Server Version : 50620
 File Encoding         : 65001

 Date: 04/09/2020 16:29:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `userName` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `passWord` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `realName` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'renfuh', '123', '任');
INSERT INTO `user` VALUES (2, 'dsad', 'dasd', 'dasdas');
INSERT INTO `user` VALUES (3, '1', '2', '3');
INSERT INTO `user` VALUES (4, '1', '1', '1');
INSERT INTO `user` VALUES (5, '3', '32', '32');

SET FOREIGN_KEY_CHECKS = 1;
