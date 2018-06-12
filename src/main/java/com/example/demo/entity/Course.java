//package com.example.demo.entity;
//
//import javax.persistence.*;
//
///**
// * 课程实体类
// */
//@Entity
//public class Course {
//    //课程编号
//    @Id
//    @GeneratedValue
//    private String cno;
//    //课程名字
//    private String cname;
//    //授课教师编号
//    private String tno;
//    //课程属性
//    @Enumerated(EnumType.STRING)
//    private CourseAttriEnum courseAttribute;
//    //课程类别
//    @Enumerated(EnumType.STRING)
//    private CourseCateEnum courseCategory;
//    //学分
//    private Integer credit;
//
//    public String getCno() {
//        return cno;
//    }
//
//    public void setCno(String cno) {
//        this.cno = cno;
//    }
//
//    public String getCname() {
//        return cname;
//    }
//
//    public void setCname(String cname) {
//        this.cname = cname;
//    }
//
//    public String getTno() {
//        return tno;
//    }
//
//    public void setTno(String tno) {
//        this.tno = tno;
//    }
//
//    public CourseAttriEnum getCourseAttribute() {
//        return courseAttribute;
//    }
//
//    public void setCourseAttribute(CourseAttriEnum courseAttribute) {
//        this.courseAttribute = courseAttribute;
//    }
//
//    public CourseCateEnum getCourseCategory() {
//        return courseCategory;
//    }
//
//    public void setCourseCategory(CourseCateEnum courseCategory) {
//        this.courseCategory = courseCategory;
//    }
//
//    public Integer getCredit() {
//        return credit;
//    }
//
//    public void setCredit(Integer credit) {
//        this.credit = credit;
//    }
//}
