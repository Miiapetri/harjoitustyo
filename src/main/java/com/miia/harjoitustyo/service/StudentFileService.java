package com.miia.harjoitustyo.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.miia.harjoitustyo.data.Student;

@Service
public class StudentFileService {
    
    public void writeStudentsToFile(List<Student> students) throws IOException {
    try {
    FileOutputStream f = new FileOutputStream("./src/documents/students.txt");
    ObjectOutputStream o = new ObjectOutputStream(f);
    for (Student student : students) {
        o.writeObject(student + System.lineSeparator());
    }
    o.close();
    f.close();
    
    } catch(IOException e) {
        e.printStackTrace();
    }
}

    public List<Student> readStudentsFromFile() throws IOException {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fi = new FileInputStream("./src/documents/students.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);
            
            students.add((Student) oi.readObject());

            oi.close();
            fi.close();

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
