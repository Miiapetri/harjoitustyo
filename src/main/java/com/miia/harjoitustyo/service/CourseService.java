package com.miia.harjoitustyo.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miia.harjoitustyo.data.Course;

@Service
public class CourseService {

    @Autowired
    CourseFileService myService;
    private List<Course> courses = new ArrayList<>();

    public CourseService() throws IOException {
        try {
            courses = myService.readCoursesFromFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public List<Course> getCourse(){
    return new ArrayList<>(courses);
    }
}
