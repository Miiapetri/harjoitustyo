package com.miia.harjoitustyo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.miia.harjoitustyo.data.Course;
import com.miia.harjoitustyo.data.Student;
import com.miia.harjoitustyo.service.CourseService;
import com.miia.harjoitustyo.service.StudentService;

@RestController
public class RestiController {

    @Autowired
    StudentService myService;
    @Autowired
    CourseService myService2;

    @GetMapping("courses")
    public List<Course> getCourses(){
        return myService2.getCourse();
    }

    @GetMapping("students")
    public List<Student> getStudents(){
        return myService.getStudents();
    }

    @PostMapping("addcourse")
        public String addCourse(@RequestBody Course course){
            myService2.addCourse(course);
            return "";
        }
    

    @PostMapping("addstudent")
        public String addStudent(@RequestBody Student student){
            myService.addStudent(student);
            return "";
        }
    
     
    
}
