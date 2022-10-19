package com.miia.harjoitustyo.service;

import java.io.BufferedReader;
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

import com.miia.harjoitustyo.data.Student;

@Service
public class StudentFileService implements Serializable {
    
    public void writeStudentsToFile(List<Student> students) throws IOException {
    try {
    FileWriter fw = new FileWriter(new File("students.txt"));
    } catch(IOException e) {
        e.printStackTrace();
    }
}

    public List<Student> readStudentsFromFile() throws IOException {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fi = new FileInputStream(new File("students.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            students.add((Student) oi.readObject());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return students;
    }
}
