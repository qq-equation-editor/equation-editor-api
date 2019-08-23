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
  `equation_type` tinyint(4) NOT NULL COMMENT '1模板公式 2用户公式',
  `equation_category` tinyint(4) NOT NULL,
  `equation_name` varchar(1024) NOT NULL,
  `equation_img` varchar(128) DEFAULT NULL,
  `equation_latex` text NOT NULL,
  `is_deleted` tinyint(4) NOT NULL,
  `create_time` datetime NOT NULL,
  `last_update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4;

-- 正在导出表  equation_editor.t_equation 的数据：~9 rows (大约)
/*!40000 ALTER TABLE `t_equation` DISABLE KEYS */;
INSERT INTO `t_equation` (`id`, `equation_type`, `equation_category`, `equation_name`, `equation_img`, `equation_latex`, `is_deleted`, `create_time`, `last_update_time`) VALUES
	(1, 1, 1, 'name', 'image/img.png', '{\\frac{{a}}{{b}} \\pm \\frac{{c}}{{d}}=\\frac{{ad \\pm bc}}{{bd}}}', 0, '2019-08-21 17:45:28', '2019-08-22 14:11:16'),
	(5, 2, 1, 'first', '', '\\sqrt{2}-\\sqrt{2}=0', 0, '2019-08-21 20:01:08', '2019-08-21 20:01:08'),
	(6, 2, 1, 'dfdf', '', 'haoma', 0, '2019-08-21 20:02:16', '2019-08-21 20:02:16'),
	(7, 2, 1, 'www', '', '\\sqrt{ }\\sqrt{ }\\sqrt{ }\\sqrt{ }\\sqrt{ }\\sqrt{ }haomalatex', 0, '2019-08-21 20:02:34', '2019-08-21 20:02:34'),
	(8, 2, 1, '22', '', '\\sqrt{ }sss', 1, '2019-08-21 20:12:24', '2019-08-22 17:34:42'),
	(9, 2, 1, '', '', '', 1, '2019-08-21 20:12:44', '2019-08-22 17:34:17'),
	(10, 2, 1, 'EWEE', '', 'S\\sqrt{WW}', 0, '2019-08-21 20:12:58', '2019-08-21 20:12:58'),
	(11, 2, 1, 'third', '', '\\sqrt{sdssdf}+S\\sqrt{WW}', 1, '2019-08-21 20:15:20', '2019-08-22 19:14:07'),
	(12, 2, 1, 'haode', '', '_{ }^{ }\\begin{matrix}\\\\\\end{matrix}\\begin{bmatrix}wdf_{sdf}^{sd}\\\\wdfwdf_{sdf}^{sd}\\end{bmatrix}', 1, '2019-08-22 13:31:43', '2019-08-22 17:34:40'),
	(13, 2, 1, 'wwwwwwwwwwwwfdfdfdfwfdf', '', 'sdfdsf', 1, '2019-08-22 17:16:44', '2019-08-22 17:19:57'),
	(14, 2, 1, 'uuu', '', '\\sqrt{2}-\\sqrt{2}=0d=\\sqrt[3]{\\left(x_2-x_1\\right)^2+sdf}', 0, '2019-08-22 20:06:08', '2019-08-22 20:06:08');
/*!40000 ALTER TABLE `t_equation` ENABLE KEYS */;

-- 导出  表 equation_editor.t_equation_symbol 结构
CREATE TABLE IF NOT EXISTS `t_equation_symbol` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `symbol_name` varchar(64) DEFAULT NULL,
  `symbol_category` tinyint(4) NOT NULL,
  `symbol_html_content` text NOT NULL,
  `symbol_latex` varchar(1024) NOT NULL,
  `is_left` tinyint(4) unsigned NOT NULL DEFAULT '0',
  `is_deleted` tinyint(4) unsigned NOT NULL DEFAULT '0',
  `create_time` datetime NOT NULL,
  `last_update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8mb4;

-- 正在导出表  equation_editor.t_equation_symbol 的数据：~79 rows (大约)
/*!40000 ALTER TABLE `t_equation_symbol` DISABLE KEYS */;
INSERT INTO `t_equation_symbol` (`id`, `symbol_name`, `symbol_category`, `symbol_html_content`, `symbol_latex`, `is_left`, `is_deleted`, `create_time`, `last_update_time`) VALUES
	(2, 'sqrt', 2, '<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA8AAAAMCAYAAAC9QufkAAAACXBIWXMAAAsSAAALEgHS3X78AAAAX0lEQVQoz62SQQ7AIAgEd4x/9U2+dnsiIW0Nte2eTGAWELCtlYB1UFJXIdtsw4ADHGNcOphzUlbOyfEOs6YP+h/O85ZwtZKy8huDllvcNegB2gbwat67XXM+z6efJUkHIaYyUXRQm3kAAAAASUVORK5CYII=">', '\\sqrt{}', 1, 0, '2019-08-20 20:04:44', '2019-08-23 14:57:28'),
	(3, NULL, 2, 'bm', ' \\begin{bmatrix}{} \\\\{}\\end{bmatrix}', 1, 0, '2019-08-22 10:58:25', '2019-08-23 15:17:26'),
	(4, NULL, 2, '<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAYAAAATCAYAAACz13xgAAAACXBIWXMAAAsSAAALEgHS3X78AAAAMUlEQVQY092PIQ7AMBSFoNn9r8zsxL6oalLke0EgED88AJXfUW0xcPRw6rDaM24pfwG1GQ8fkEm2AwAAAABJRU5ErkJggg==">', ' \\begin{matrix}{}\\\\{}\\end{matrix}', 1, 0, '2019-08-22 10:58:25', '2019-08-23 15:20:55'),
	(5, NULL, 2, '|', '^{}_{}', 1, 0, '2019-08-22 10:58:25', '2019-08-23 13:39:22'),
	(6, 'plus', 2, '<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAwAAAAMCAYAAABWdVznAAAACXBIWXMAAAsSAAALEgHS3X78AAAALklEQVQoz2PcsWPHfwYcwN3dnRFdjImBRDCqYXBoYCGkgJGRESUlMP7//58kDQD+xQkXQnvqswAAAABJRU5ErkJggg==">', '_{}', 1, 0, '2019-08-20 20:04:16', '2019-08-23 15:42:07'),
	(7, 'plus', 2, '<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAwAAAAMCAYAAABWdVznAAAACXBIWXMAAAsSAAALEgHS3X78AAAAM0lEQVQoz2P8//8/Az7AyMiIooBl586dOHW4u7szoouxMBAA////R9HExEAiGNUwODQAAMmuCxmtkDKPAAAAAElFTkSuQmCC">', '^{}', 1, 0, '2019-08-20 20:04:16', '2019-08-23 15:41:55'),
	(8, NULL, 2, '<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAARCAYAAAAPFIbmAAAACXBIWXMAAAsSAAALEgHS3X78AAAAU0lEQVQoz9WRwQ2AMAwD7YpdM1OmPT6oqiIK4cm9LefkGJBtdAFYhaEGBl5DQ5Jss56sHNUlItiGVjJzykcELfHfhm4nqFtZErvHfvrdbHpqa4mfV+wif5H1hOoAAAAASUVORK5CYII=">', '\\int{}', 0, 0, '2019-08-22 14:13:05', '2019-08-23 15:14:38'),
	(9, NULL, 2, '<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA8AAAARCAYAAAACCvahAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2ZpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDo4MzBBMkExOEZDNzRFODExOURGOUQxQkMyMDkyOTA0MyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDo0QjkzMzQzRDc1MzcxMUU4OUQ2NEM4RTA4REE2QkZBRCIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDo0QjkzMzQzQzc1MzcxMUU4OUQ2NEM4RTA4REE2QkZBRCIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChXaW5kb3dzKSI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOkYyODI0NTQ0MkE3NUU4MTE5REY5RDFCQzIwOTI5MDQzIiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOjgzMEEyQTE4RkM3NEU4MTE5REY5RDFCQzIwOTI5MDQzIi8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+82a9OAAAAHJJREFUeNq8k2EKwCAIhXvRXb3/Cd62H4VzzXLChKDC72lqIFm6ARiH8x5lYbUkDDpyGL4y9By89JsRerB9IyKcvRnW0RGEWqNgnsBWtcMC9SVNfoG94i1h7oIWDoG6z3T6jFnf0xOWmu12U/rzSx4CDAA76iVNsFwD9wAAAABJRU5ErkJggg==">', '\\sum', 1, 0, '2019-08-22 14:13:05', '2019-08-23 15:07:43'),
	(10, '&gt;', 1, '&gt;', '>', 0, 0, '2019-08-20 20:04:44', '2019-08-23 13:42:12'),
	(11, '&lt;', 1, '&lt;', '<', 0, 0, '2019-08-20 20:04:44', '2019-08-23 13:42:14'),
	(12, '*', 1, '*', '*', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(13, '+', 1, '+', '+', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(14, '-', 1, '-', '-', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(15, '=', 1, '=', '=', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(16, '¬', 1, '¬', '¬', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(17, '±', 1, '±', '±', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(18, '×', 1, '×', '×', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(19, '÷', 1, '÷', '÷', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(20, '∀', 1, '∀', '∀', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(21, '∃', 1, '∃', '∃', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(22, '∄', 1, '∄', '∄', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(23, '∅', 1, '∅', '∅', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(24, '∆', 1, '∆', '∆', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(25, '∇', 1, '∇', '∇', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(26, '∈', 1, '∈', '∈', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(27, '∉', 1, '∉', '∉', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(28, '∓', 1, '∓', '∓', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(29, '∘', 1, '∘', '∘', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(30, '∙', 1, '∙', '∙', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(31, '∝', 1, '∝', '∝', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(32, '∠', 1, '∠', '∠', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(33, '∡', 1, '∡', '∡', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(34, '∢', 1, '∢', '∢', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(35, '∣', 1, '∣', '∣', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(36, '∥', 1, '∥', '∥', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(37, '∧', 1, '∧', '∧', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(38, '∨', 1, '∨', '∨', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(39, '∩', 1, '∩', '∩', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(40, '∪', 1, '∪', '∪', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(41, '∴', 1, '∴', '∴', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(42, '∵', 1, '∵', '∵', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(43, '∶', 1, '∶', '∶', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(44, '∽', 1, '∽', '∽', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(45, '≃', 1, '≃', '≃', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(46, '≈', 1, '≈', '≈', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(47, '≌', 1, '≌', '≌', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(48, '≐', 1, '≐', '≐', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(49, '≙', 1, '≙', '≙', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(50, '≜', 1, '≜', '≜', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(51, '≠', 1, '≠', '≠', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(52, '≡', 1, '≡', '≡', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(53, '≤', 1, '≤', '≤', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(54, '≥', 1, '≥', '≥', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(55, '≪', 1, '≪', '≪', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(56, '≫', 1, '≫', '≫', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(57, '≺', 1, '≺', '≺', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(58, '≻', 1, '≻', '≻', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(59, '⊂', 1, '⊂', '⊂', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(60, '⊃', 1, '⊃', '⊃', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(61, '⊄', 1, '⊄', '⊄', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(62, '⊅', 1, '⊅', '⊅', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(63, '⊆', 1, '⊆', '⊆', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(64, '⊇', 1, '⊇', '⊇', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(65, '⊕', 1, '⊕', '⊕', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(66, '⊗', 1, '⊗', '⊗', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(67, '⊙', 1, '⊙', '⊙', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(68, '⊢', 1, '⊢', '⊢', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(69, '⊣', 1, '⊣', '⊣', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(70, '⊤', 1, '⊤', '⊤', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(71, '⊥', 1, '⊥', '⊥', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(72, '⊲', 1, '⊲', '⊲', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(73, '⊳', 1, '⊳', '⊳', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(74, '□', 1, '□', '□', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(75, '▭', 1, '▭', '▭', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(76, '▱', 1, '▱', '▱', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(77, '▱', 1, '▱', '▱', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(78, '△', 1, '△', '△', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(79, '○', 1, '○', '○', 0, 0, '2019-08-20 20:04:44', '2019-08-20 20:04:56'),
	(80, 'plus', 2, '{', '\\sqrt[n]{x^n}', 1, 0, '2019-08-20 20:04:16', '2019-08-23 14:47:10'),
	(81, 'sqrt', 2, '<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA8AAAAMCAYAAAC9QufkAAAACXBIWXMAAAsSAAALEgHS3X78AAAAZklEQVQoz6WSUQrAIAxDX8S7eiZPm/2sUNikur0vkSZNrbINgCQD2BY3cbeiU5DNtsWSHMIxxiPBnFNl51wc5zDrO/FWNH7QqnlLcbWSsvMXg5Yjnhr0ENqWJK/mfdu14nuePhbABeq4OVHfmjITAAAAAElFTkSuQmCC">', '\\sqrt[{}]{}', 1, 0, '2019-08-20 20:04:44', '2019-08-23 14:58:25');
/*!40000 ALTER TABLE `t_equation_symbol` ENABLE KEYS */;

-- 导出  表 equation_editor.t_user 结构
CREATE TABLE IF NOT EXISTS `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  `is_deleted` tinyint(4) NOT NULL,
  `create_time` datetime NOT NULL,
  `last_update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_user_name` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- 正在导出表  equation_editor.t_user 的数据：~4 rows (大约)
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` (`id`, `user_name`, `password`, `is_deleted`, `create_time`, `last_update_time`) VALUES
	(1, 'xiexie', 'xiexie', 0, '2019-08-21 19:12:18', '2019-08-21 19:12:18'),
	(3, '11', '11', 0, '2019-08-21 19:53:05', '2019-08-21 19:53:05'),
	(4, '222', '222', 0, '2019-08-21 19:53:26', '2019-08-21 19:53:26'),
	(5, '123', '123', 0, '2019-08-21 20:02:15', '2019-08-21 20:02:15');
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;

-- 导出  表 equation_editor.t_user_equation 结构
CREATE TABLE IF NOT EXISTS `t_user_equation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `equation_id` int(11) NOT NULL,
  `is_deleted` tinyint(4) NOT NULL,
  `create_time` datetime NOT NULL,
  `last_update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `idx_user_id_equation_id` (`user_id`,`equation_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4;

-- 正在导出表  equation_editor.t_user_equation 的数据：~12 rows (大约)
/*!40000 ALTER TABLE `t_user_equation` DISABLE KEYS */;
INSERT INTO `t_user_equation` (`id`, `user_id`, `equation_id`, `is_deleted`, `create_time`, `last_update_time`) VALUES
	(1, 4, 2, 0, '2019-08-21 20:00:16', '2019-08-21 20:00:16'),
	(2, 4, 3, 0, '2019-08-21 20:00:18', '2019-08-21 20:00:18'),
	(3, 4, 4, 0, '2019-08-21 20:00:21', '2019-08-21 20:00:21'),
	(4, 4, 5, 0, '2019-08-21 20:01:08', '2019-08-21 20:01:08'),
	(5, 5, 6, 0, '2019-08-21 20:02:16', '2019-08-21 20:02:16'),
	(6, 5, 7, 0, '2019-08-21 20:02:34', '2019-08-21 20:02:34'),
	(7, 4, 8, 1, '2019-08-21 20:12:24', '2019-08-22 17:34:42'),
	(8, 4, 9, 1, '2019-08-21 20:12:44', '2019-08-22 17:34:17'),
	(9, 4, 10, 0, '2019-08-21 20:12:58', '2019-08-21 20:12:58'),
	(10, 4, 11, 1, '2019-08-21 20:15:20', '2019-08-22 19:14:07'),
	(11, 4, 12, 1, '2019-08-22 13:31:44', '2019-08-22 17:34:40'),
	(12, 4, 13, 1, '2019-08-22 17:16:44', '2019-08-22 17:20:12'),
	(13, 4, 14, 0, '2019-08-22 20:06:08', '2019-08-22 20:06:08');
/*!40000 ALTER TABLE `t_user_equation` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
