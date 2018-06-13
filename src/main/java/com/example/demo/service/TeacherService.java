package com.example.demo.service;

import com.example.demo.dao.TeacherRepo;
import com.example.demo.entity.EducationEnum;
import com.example.demo.entity.Teacher;
import com.example.demo.entity.TitleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 教师service层
 * tno教师编号（主键，唯一，例如201601001，2016表示入职年份01表示所属学院001表示教师序号）;
 * tname教师姓名；
 * 学历（本科、硕士、博士）；
 * 职称（讲师、副教授、教授、高级工程师）。
 */
@Service
public class TeacherService {

    @Autowired
    TeacherRepo teacherRepo;

    /**
     * 增加教师对象
     * @param teacher
     * @return
     */
    public Teacher addTeacher(Teacher teacher){
        teacher.setTno(teacher.getTno());
        teacher.setEducation(teacher.getEducation());
        teacher.setTitle(teacher.getTitle());
        teacher.setTname(teacher.getTname());
        return teacherRepo.save(teacher);
    }

    /**
     * 根据教师编号删除对象
     * @param tno
     */
    public void delTeacher(Long tno){
        teacherRepo.deleteById(tno);
    }

    /**
     * 根据教师编号tno更新教师信息
     * @param tno
     * @param tname
     * @param education
     * @param title
     * @return
     */
    public Teacher updateTeacher(Long tno, String tname, EducationEnum education, TitleEnum title){
        Teacher teacher=new Teacher();
        teacher.setTno(tno);
        teacher.setTname(tname);
        teacher.setTitle(title);
        teacher.setEducation(education);
        return teacherRepo.save(teacher);
    }

    /**
     * 查询数据库中所有教师对象
     * @return
     */
    public List<Teacher> getAllTeachers(){
        return teacherRepo.findAll();
    }

    /**
     * 根据教师编号tno查询教师信息
     * @param sno
     * @return
     */
    public Teacher getTeacherByTno(Long sno){
        return teacherRepo.findById(sno).get();
    }

    /**
     * 根据姓名tname查询教师对象
     * @param tname
     * @return
     */
    public List<Teacher> getTeacherByTname(String tname){
        return teacherRepo.getTeacherByTname(tname);
    }
}
