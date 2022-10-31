package com.miia.harjoitustyo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public List<Course> getCourses() throws ClassNotFoundException, IOException{
        return myService2.getAllCourses();
    }

    @GetMapping("students")
    public List<Student> getStudents() throws ClassNotFoundException, IOException{
        return myService.getAllStudents();
    }

    @PostMapping("addcourse")
        public String addCourse(@RequestBody Course course) throws IOException{
            myService2.addCourse(course);
            return "";
        }
    

    @PostMapping("addstudent")
        public String addStudent(@RequestBody Student student) throws IOException{
            myService.addStudent(student);
            return "";
        }

    @GetMapping("studentbyname/{fname}")
        public Student getStudentByName(@PathVariable String fname){
            return myService.getStudentbyName(fname);
        }
    
     
    
}
