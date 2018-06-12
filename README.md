# EduManagement
springboot springcloud vue maven
##
版本管理工具：git tortoisegit
#####新建项目 EduManagment
######在application.yml中配置数据库相关信息
######在pom.xml中引入了spring boot、mysql和swagger相关依赖
######设计数据表
![](https://i.imgur.com/kScLs2T.jpg)
**问题：教师表需要有学院字段吗
课程表上课时间的设计
成绩表需要分成必修选修两种吗？**
######创建学生、教师实体类及性别、学历、职称枚举类

##TODO
项目架构(每一层需要哪些类) 
###实体类entity 
###dao层（jpa）
###controller层
###service层

6.12
课程实体类 成绩表类，课程属性枚举类，课程类别枚举类
学生增删改查