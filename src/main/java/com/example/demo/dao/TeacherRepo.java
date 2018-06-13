package com.example.demo.dao;

import com.example.demo.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepo extends JpaRepository<Teacher,Long> {
    //根据姓名查询教师对象
    List<Teacher> getTeacherByTname(String tname);
}
