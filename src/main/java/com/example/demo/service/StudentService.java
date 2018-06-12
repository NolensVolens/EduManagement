package com.example.demo.service;

import com.example.demo.dao.StudentRepo;
import com.example.demo.entity.GenderEnum;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 学生service层
 * 底层业务逻辑
 * 增删改查
 * 学号Long sno;姓名String sname;年龄Integer sage;性别GenderEnum ssex;
 */
@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    /**
     * 增加学生对象
     * @param student
     * @return
     */
    public Student addStudent(Student student){
        student.setSage(student.getSage());
        student.setSname(student.getSname());
        student.setSsex(student.getSsex());
        return studentRepo.save(student);
    }

    /**
     * 根据sno（学号）删除学生对象
     * @param sno
     */
    public void delStudent(Long sno){
        studentRepo.deleteById(sno);
    }

    /**
     * 根据sno更新学生信息
     * @param sno
     * @param sname
     * @param sage
     * @param ssex
     * @return
     */
    public Student updateStudent(Long sno,String sname,Integer sage,GenderEnum ssex){
        Student stu=new Student();
        stu.setSno(sno);
        stu.setSname(sname);
        stu.setSage(sage);
        stu.setSsex(ssex);
        return studentRepo.save(stu);
    }

    /**
     * 查询数据库中所有学生对象
     * @return
     */
    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }
    /**
     * 根据学号sno查询对象
     * @param sno
     * @return
     */
    public Student getStudentBySno(Long sno){
        return studentRepo.findById(sno).get();
    }

    /**
     * 根据姓名sname查询学生对象
     * @param sname
     * @return
     */
    public List<Student> getStudentBySname(String sname){
        return studentRepo.getStudentBySname(sname);
    }


}
