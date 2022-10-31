package com.miia.harjoitustyo.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miia.harjoitustyo.data.Course;

@Service
public class CourseService {

    @Autowired
    CourseFileService myService;
    
    private List<Course> courses = new ArrayList<>();

    public CourseService() {
 
    }

    @PostConstruct
    public void init() throws IOException {
        // try {
        //     courses = myService.readCoursesFromFile();
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }
    }

    public List<Course> getAllCourses() throws IOException, ClassNotFoundException {
        courses.addAll(myService.getAllCourses());
        return myService.getAllCourses();
    }

    public void addCourse(Course course) throws IOException{
        myService.writeCourseToFile(course);
        courses.add(course);
    }

    public List<Course> getCourses() throws ClassNotFoundException, IOException {
        return myService.getAllCourses();
    }

    public Course getCoursebyName(String CourseName){
        List<Course> cName = myService.getAllCourses();
        Course name = new Course();
        for (Course course : cName) {
            if(course.getCourseName().equals(CourseName)){
                name = course;
            }
            
        }
        return name;
    }
}
