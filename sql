-- --------------------------------------------------------
-- 主机:                           localhost
-- 服务器版本:                        5.7.17-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 equation_editor 的数据库结构
CREATE DATABASE IF NOT EXISTS `equation_editor` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `equation_editor`;

-- 导出  表 equation_editor.t_equation 结构
CREATE TABLE IF NOT EXISTS `t_equation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `equation_type` tinyint(4) NOT NULL COMMENT '1标准公式 2用户公式',
  `equation_category` tinyint(4) NOT NULL,
  `equaiont_name` varchar(1024) NOT NULL,
  `equation_img` varchar(128) NOT NULL,
  `equaiont_latex` text NOT NULL,
  `is_deleted` tinyint(4) NOT NULL,
  `create_time` datetime NOT NULL,
  `last_update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 数据导出被取消选择。
-- 导出  表 equation_editor.t_equation_symbol 结构
CREATE TABLE IF NOT EXISTS `t_equation_symbol` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `symbol_name` varchar(64) NOT NULL,
  `symbol_category` tinyint(4) NOT NULL,
  `symbol_html_content` text NOT NULL,
  `symbol_latex` varchar(1024) NOT NULL,
  `is_deleted` tinyint(4) NOT NULL,
  `create_time` datetime NOT NULL,
  `last_update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 数据导出被取消选择。
-- 导出  表 equation_editor.t_user 结构
CREATE TABLE IF NOT EXISTS `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  `is_deleted` tinyint(4) NOT NULL,
  `create_time` datetime NOT NULL,
  `last_update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 数据导出被取消选择。
-- 导出  表 equation_editor.t_user_equation 结构
CREATE TABLE IF NOT EXISTS `t_user_equation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `equation_id` int(11) NOT NULL,
  `is_deleted` tinyint(4) NOT NULL,
  `create_time` datetime NOT NULL,
  `last_update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 数据导出被取消选择。
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
