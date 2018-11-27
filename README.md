# 项目描述
* 快速实现一个动态网站，开发人员只用关心相关表的设计，sql的编写
# 系统架构
* 前端:thymeleaf
* 后端:springboot+mybatis
* 数据库:mysql 5.5以上
* jdk:1.7以上
## 相关插件
 * mybatis-generator-maven-plugin
    * 根据表结构一键生成对应model，开发只关心具体业务sql

 

# 相关文章资料

Spring Boot（1）工具安装：

http://www.jianshu.com/p/fb6ed37c90eb

Spring Boot（2）新建Spring Boot工程

http://www.jianshu.com/p/00fd73f515f6

Spring Boot（3）整合Mybatis

http://www.jianshu.com/p/8401e9304fa0

Spring Boot（4）整合thymeleaf

http://www.jianshu.com/p/8d2cc7207fb2

Spring Boot（5）一个极简且完整的后台框架

http://www.jianshu.com/p/923d26d705ed

Spring Boot（6）jar方式打包发布

http://www.jianshu.com/p/9cf6faa8595e

Spring Boot（7）war方式打包发布

http://www.jianshu.com/p/ae170a58f88c




#SQL语句拿走

````
CREATE DATABASE WEALTH;
USE WEALTH;

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `realName` varchar(45) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `phoneNumber` varchar(45) DEFAULT NULL,
  `headPicture` varchar(45) DEFAULT NULL,
  `addDate` date DEFAULT NULL,
  `updateDate` date DEFAULT NULL,
  `state` int(11) DEFAULT '0' COMMENT '1：正常\n2：冻结\n3：删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`userName`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `admin` VALUES (1,'admin','admin','面皮大师',28,'17788886666','','2017-06-15','2017-06-15',1);


CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `description` varchar(45) DEFAULT NULL,
  `category` int(11) DEFAULT NULL,
  `image` varchar(45) DEFAULT NULL,
  `content` mediumtext,
  `addDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL COMMENT '1，正常\n2，删除',
  `commendState` int(11) DEFAULT NULL COMMENT '1，正常\n2，推荐',
  `browses` int(11) DEFAULT NULL COMMENT '浏览数',
  `likes` int(11) DEFAULT NULL COMMENT '喜欢数',
  `comments` int(11) DEFAULT NULL COMMENT '回复数',
  `score` int(11) DEFAULT NULL COMMENT '分数，用于排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;



INSERT INTO `news` VALUES (1,'科技是第一生产力1','科技是第一生产力',2,NULL,'<p>科技是第一生产力<br></p>','2017-06-15 19:15:04','2017-06-15 19:15:04',1,1,0,0,0,0),(2,'科技是第一生产力2','科技是第一生产力2',2,'','科技是第一生产力2','2017-06-15 19:17:10','2017-06-15 19:17:10',1,1,0,0,0,0),(3,'科技是第一生产力3','科技是第一生产力3',2,'','科技是第一生产力3','2017-06-15 19:17:31','2017-06-15 19:17:31',1,1,0,0,0,0),(4,'科技是第一生产力4','科技是第一生产力4',2,'','科技是第一生产力4','2017-06-15 19:17:50','2017-06-15 19:17:50',1,1,0,0,0,0),(5,'科技是第一生产力5','科技是第一生产力5',2,'','科技是第一生产力5','2017-06-15 19:17:57','2017-06-15 19:17:57',1,1,0,0,0,0),(6,'科技是第一生产力6','科技是第一生产力6',2,'','科技是第一生产力6','2017-06-15 19:18:02','2017-06-15 19:18:02',1,1,0,0,0,0),(7,'科技是第一生产力7','科技是第一生产力7',2,'','科技是第一生产力7','2017-06-15 19:18:06','2017-06-15 19:18:06',1,1,0,0,0,0),(8,'科技是第一生产力8','科技是第一生产力8',2,'','科技是第一生产力8','2017-06-15 19:18:10','2017-06-15 19:18:10',1,1,0,0,0,0),(9,'科技是第一生产力9','科技是第一生产力9',2,'','科技是第一生产力9','2017-06-15 19:18:21','2017-06-15 19:18:21',1,1,0,0,0,0),(10,'科技是第一生产力10','科技是第一生产力10',2,'','科技是第一生产力10','2017-06-15 19:18:30','2017-06-15 19:18:30',1,1,0,0,0,0),(11,'财经天下1','财经天下1',1,'','财经天下1','2017-06-15 19:19:13','2017-06-15 19:19:13',1,1,0,0,0,0),(12,'财经天下2','财经天下2',1,'','财经天下2','2017-06-15 19:19:19','2017-06-15 19:19:19',1,1,0,0,0,0),(13,'财经天下3','财经天下3',1,'','财经天下3','2017-06-15 19:19:23','2017-06-15 19:19:23',1,2,0,0,0,0),(14,'财经天下4','财经天下4',1,'','财经天下4','2017-06-15 19:19:27','2017-06-15 19:19:27',1,1,0,0,0,0),(15,'财经天下5','财经天下5',1,'','财经天下5','2017-06-15 19:19:31','2017-06-15 19:19:31',1,1,0,0,0,0),(16,'财经天下6','财经天下6',1,'','财经天下6','2017-06-15 19:19:34','2017-06-15 19:19:34',1,1,0,0,0,0),(17,'财经天下7','财经天下7',1,'','财经天下7','2017-06-15 19:19:38','2017-06-15 19:19:38',2,2,0,0,0,0),(18,'财经天下8','财经天下8',1,'','财经天下8','2017-06-15 19:19:42','2017-06-15 19:19:42',1,1,0,0,0,0),(19,'财经天下9','财经天下9',1,'','财经天下9','2017-06-15 19:19:45','2017-06-15 19:19:45',1,1,0,0,0,0),(20,'财经天下10','财经天下10',1,'','财经天下10','2017-06-15 19:19:53','2017-06-15 19:19:53',1,2,0,0,0,0),(21,'体育人生1','体育人生1',3,'','体育人生1','2017-06-15 19:20:55','2017-06-15 19:20:55',1,2,0,0,0,0),(22,'体育人生2','体育人生2',3,'','体育人生2','2017-06-15 19:21:03','2017-06-15 19:21:03',2,1,0,0,0,0),(23,'体育人生3','体育人生3',3,'','体育人生3','2017-06-15 19:21:07','2017-06-15 19:21:07',2,2,0,0,0,0),(24,'体育人生4','体育人生4',3,'','体育人生4','2017-06-15 19:21:11','2017-06-15 19:21:11',2,1,0,0,0,0),(25,'体育人生5','体育人生5',3,'','体育人生5','2017-06-15 19:21:14','2017-06-15 19:21:14',2,2,0,0,0,0),(26,'特泰尼克号update','一个美好的故事update',3,'/userfiles/20170704160534_351.png','<p>一个美好的故事update<br></p>','2017-07-04 11:11:18','2017-07-04 16:05:34',2,2,11,12,15,111),(27,'张学友芜湖演唱会','张学友芜湖演唱会一票难求',5,'/userfiles/20170704143344_119.png','<div class=\"container content\">    <h3 class=\"text-center\">云堆微软文分发介绍</h3>    <p class=\"text-center\">自媒体真实流量分发 · 品效合一</p>    <img src=\"http://www.yunduimedia.com/imgs/weixin/weixin01_89df947.png\" width=\"992\" height=\"369\">  </div>            <h3>云堆投放优势</h3>            <img src=\"http://www.yunduimedia.com/imgs/weixin/weixin02_ed2c3a3.png\" width=\"992\" height=\"340\">','2017-07-04 14:33:44','2017-07-04 14:33:44',2,1,0,0,0,0),(28,'','',0,'','','2017-07-05 11:35:19','2017-07-05 11:35:19',2,1,0,0,0,0),(29,'标题','',1,'','<p><br></p>','2017-07-05 11:46:14','2017-07-05 14:03:27',1,1,0,0,0,0);


DROP TABLE IF EXISTS `news_category`;

CREATE TABLE `news_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(45) DEFAULT NULL,
  `image` varchar(45) DEFAULT NULL,
  `addDate` datetime DEFAULT NULL,
  `state` int(11) DEFAULT NULL COMMENT '1，正常\n2，删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;



INSERT INTO `news_category` VALUES (1,'财经','财经','','2017-06-15 18:59:37',1),(2,'科技','科技','','2017-06-15 18:59:46',1),(3,'体育','体育','','2017-06-15 18:59:55',1),(4,'人文','人文','','2017-06-15 19:00:06',2),(5,'娱乐','娱乐八卦','/userfiles/20170704110957.png','2017-07-04 11:09:57',2),(6,'历史','历史文学','/userfiles/20170705113505.png','2017-07-05 11:34:31',1);


````

