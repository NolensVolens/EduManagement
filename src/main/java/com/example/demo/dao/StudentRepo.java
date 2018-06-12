package com.example.demo.dao;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Long> {
    //根据对象属性（姓名）查找对象
    List<Student> getStudentBySname(String sname);
}
