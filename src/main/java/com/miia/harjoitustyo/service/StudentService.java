package com.miia.harjoitustyo.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miia.harjoitustyo.data.Student;

@Service
public class StudentService {

    @Autowired
    StudentFileService myService;

    private List<Student> students = new ArrayList<>();

     public StudentService(){
    
     }

    @PostConstruct
    public void init() throws IOException{
    try {
    students = myService.readStudentsFromFile();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents(){
        return new ArrayList<>(students);
    }
}
