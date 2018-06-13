package com.example.demo.controller;

import com.example.demo.entity.EducationEnum;
import com.example.demo.entity.Teacher;
import com.example.demo.entity.TitleEnum;
import com.example.demo.service.TeacherService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 教师控制层
 */
@RequestMapping(value = "/teacher")
@RestController
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @ApiOperation(value ="增加教师对象" ,notes ="根据teacher对象创建用户" )
    @PostMapping(value = "/")
    public Teacher addTeacher(Teacher teacher){
        return teacherService.addTeacher(teacher);
    }

    @ApiOperation(value ="删除教师对象" ,notes ="根据参数教师编号tno删除对象" )
    @DeleteMapping("/{tno}")
    public void delTeacher(@PathVariable("tno") Long tno){
        teacherService.delTeacher(tno);
    }

    @ApiOperation(value ="更新教师对象" ,notes ="根据参数教师编号tno更新对象信息" )
    @PutMapping("/{tno}")
    public Teacher updateTeacher(@PathVariable("tno") Long tno,
                                 @RequestParam("tname") String tname,
                                 @RequestParam("title")TitleEnum title,
                                 @RequestParam("education")EducationEnum education){
        return teacherService.updateTeacher(tno,tname,education,title);
    }

    @ApiOperation(value = "查询教师对象",notes = "获取数据库中所有教师对象")
    @GetMapping(value = "/")
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }

    @ApiOperation(value ="查询教师对象" ,notes = "根据参数教师编号tno获得对象")
    @GetMapping(value = "/no/{tno}")
    public Teacher getTeacherByTno(@PathVariable("tno") Long tno){
        return teacherService.getTeacherByTno(tno);
    }

    @ApiOperation(value = "查询教师对象",notes = "根据参数教师姓名tname获得对象")
    @GetMapping(value = "/name/{tname}")
    public List<Teacher> getTeacherByTname(@PathVariable("tname") String tname){
        return teacherService.getTeacherByTname(tname);
    }
}
