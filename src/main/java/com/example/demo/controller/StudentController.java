package com.example.demo.controller;

import com.example.demo.entity.GenderEnum;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 学生控制类
 * 处理传递参数
 */
@RequestMapping(value = "/student")
@RestController
//@RestController注解下默认类中的方法都会以json的格式返回
public class StudentController {

    @Autowired
    StudentService studentService;

    @ApiOperation(value ="增加一个学生对象" ,notes ="根据student对象创建用户" )
    @PostMapping(value ="/" )
    public Student addStudent(Student student){
        return studentService.addStudent(student);
    }

    @ApiOperation(value ="删除学生对象" ,notes = "根据url参数学号sno删除对象")
    @DeleteMapping(value = "/{sno}")
    public void delStudent(@PathVariable("sno") Long sno){
        studentService.delStudent(sno);
    }

    @ApiOperation(value = "更新学生对象",notes = "根据url参数学号sno更新对象信息")
    @PutMapping(value = "/{sno}")
    public Student updateStudent(@PathVariable("sno") Long sno,
                                 @RequestParam("sname") String sname,
                                 @RequestParam("sage") Integer sage,
                                 @RequestParam("ssex") GenderEnum ssex){
        return studentService.updateStudent(sno,sname,sage,ssex);
    }

    @ApiOperation(value = "查询学生对象" ,notes = "查询数据库中所有对象")
    @GetMapping(value = "/")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @ApiOperation(value ="查询学生对象" ,notes = "根据url参数学号sno查询对象")
    @GetMapping(value = "/no/{sno}")
    public Student getStudentBySno(@PathVariable("sno") Long sno){
        return studentService.getStudentBySno(sno);
    }

    @ApiOperation(value ="查询学生对象" ,notes = "根据url参数sname查询对象")
    @GetMapping(value = "/name/{sname}")
    public List<Student> getStudentBySname(@PathVariable("sname") String sname){
        return studentService.getStudentBySname(sname);
    }

}
