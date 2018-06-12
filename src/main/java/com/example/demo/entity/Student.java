package com.example.demo.entity;


import javax.persistence.*;

/**
 * 学生实体类
 */
@Entity
public class Student {
    //学号
    @Id
    private Long sno;
    //姓名
    private String sname;
    //年龄
    private Integer sage;
    //性别
    @Enumerated(EnumType.STRING)
    private GenderEnum ssex;

    public Long getSno() {
        return sno;
    }

    public void setSno(Long sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public GenderEnum getSsex() {
        return ssex;
    }

    public void setSsex(GenderEnum ssex) {
        this.ssex = ssex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", ssex='" + ssex + '\'' +
                '}';
    }
}
