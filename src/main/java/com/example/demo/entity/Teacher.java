package com.example.demo.entity;

import javax.persistence.*;

/**
 * 教师实体类
 */
@Entity
public class Teacher {

    //教师编号
    @Id
    private String tno;
    //教师名
    private String tname;
    //学历
    @Enumerated(EnumType.STRING)
    private EducationEnum education;
    //职称
    @Enumerated(EnumType.STRING)
    private TitleEnum title;

}
