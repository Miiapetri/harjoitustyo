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
    public void init() throws IOException {
    //students = myService.writeStudentsToFile(students);
    }
     
     public List<Student> getAllStudents() throws IOException, ClassNotFoundException {
        students.addAll(myService.getAllStudents());
        return myService.getAllStudents();
     }



    public void addStudent(Student student) throws IOException{
        myService.writeStudentToFile(student);
        students.add(student);
    }

    public List<Student> getStudents() throws ClassNotFoundException, IOException{

        return myService.getAllStudents();
        //return new ArrayList<>(students);
    }

    public List<Student> getStudentbyName(String fname) {
        List<Student> names = new ArrayList<>();

        for (Student student : names) {
            student.getfname().equals(fname);
        }

        return names;
    }
}
