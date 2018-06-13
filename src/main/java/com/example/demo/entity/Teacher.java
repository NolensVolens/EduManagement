package com.example.demo.entity;

import javax.persistence.*;

/**
 * 教师实体类
 */
@Entity
public class Teacher {

    //教师编号
    @Id
    private Long tno;
    //教师名
    private String tname;
    //学历
    @Enumerated(EnumType.STRING)
    private EducationEnum education;
    //职称
    @Enumerated(EnumType.STRING)
    private TitleEnum title;

    public Long getTno() {
        return tno;
    }

    public void setTno(Long tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public EducationEnum getEducation() {
        return education;
    }

    public void setEducation(EducationEnum education) {
        this.education = education;
    }

    public TitleEnum getTitle() {
        return title;
    }

    public void setTitle(TitleEnum title) {
        this.title = title;
    }
}
