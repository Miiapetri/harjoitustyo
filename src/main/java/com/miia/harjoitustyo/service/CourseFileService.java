package com.miia.harjoitustyo.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.miia.harjoitustyo.data.Course;

@Service
public class CourseFileService implements Serializable {
    Gson gson = new Gson();

    public void writeCourseToFile(Course course) throws IOException {
        FileWriter f = new FileWriter(new File("courses.txt"), true);
        f.write(gson.toJson(course)+ System.lineSeparator());
        f.close();
    }

    public List<Course> writeCoursesToFile(List<Course> courses) throws IOException {
        FileWriter fi = new FileWriter(new File("course.txt"), true);
        for (Course course : courses) {
            fi.write(gson.toJson(course)+ System.lineSeparator());
        }
        fi.close();
        return courses;
    }

    
    public List<Course> getAllCourses(){
        List<Course> courses = new ArrayList<>();

        try{
            Scanner sc = new Scanner(new File("courses.txt"));
            while( sc.hasNextLine()) {
                courses.add(gson.fromJson(sc.nextLine(), Course.class));
            }
            sc.close();
            return courses;
        } catch ( FileNotFoundException e){
            return courses;
        }
    }


        // public List<Course> readCoursesFromFile() throws IOException {
        //     List<Course> courses = new ArrayList<>();
        //     try {
        //         FileInputStream fi = new FileInputStream("./documents/courses.txt");
        //         ObjectInputStream oi = new ObjectInputStream(fi);
        //         courses = (List<Course>) oi.readObject();
    
        //         courses.add((Course) oi.readObject());
        //         oi.close();
        //         fi.close();
        //     } catch (FileNotFoundException e) {
        //         e.printStackTrace();
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     } catch (ClassNotFoundException e) {
        //         e.printStackTrace();
        //     }
    
    
        //     return null;
        // }
}
