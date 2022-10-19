package com.miia.harjoitustyo.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.miia.harjoitustyo.data.Course;

@Service
public class CourseFileService implements Serializable {

    public void writeCoursesToFile(List<Course> courses) throws IOException {
        try {
        FileWriter fw = new FileWriter(new File("courses.txt"));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
        public List<Course> readCoursesFromFile() throws IOException {
            List<Course> courses = new ArrayList<>();
            try {
                FileInputStream fi = new FileInputStream(new File("students.txt"));
                ObjectInputStream oi = new ObjectInputStream(fi);
    
                courses.add((Course) oi.readObject());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
    
    
            return courses;
        }
}
