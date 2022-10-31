package com.miia.harjoitustyo.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.miia.harjoitustyo.data.Student;

@Service
public class StudentFileService {
    Gson gson = new Gson();

    public void writeStudentToFile(Student student) throws IOException {
        FileWriter f = new FileWriter(new File("students.txt"), true);
        f.write(gson.toJson(student)+ System.lineSeparator());
        f.close();
    }

    public List<Student> writeStudentsToFile(List<Student> students) throws IOException {
        FileWriter fi = new FileWriter(new File("students.txt"), false);
        for (Student student : students) {
            fi.write(gson.toJson(student) + System.lineSeparator());
        }
        fi.close();
        return students;
    }

    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();

        try{
            Scanner sc = new Scanner(new File("students.txt"));
            while ( sc.hasNextLine()) {
                students.add(gson.fromJson(sc.nextLine(), Student.class));
            }
            sc.close();
            return students;
        } catch (FileNotFoundException e) {
            return students;
        }
    }
//     public void writeStudentsToFile(String student) throws IOException {
//     try {
//     FileOutputStream f = new FileOutputStream("students.txt");
//     ObjectOutputStream o = new ObjectOutputStream(f);
//     //for (Student student : students) {
//         o.writeObject(student + System.lineSeparator());
//     //}
//     o.close();
//     f.close();
    
//     } catch(IOException e) {
//         e.printStackTrace();
//     }
// }

//     public List<Student> readStudentsFromFile() throws IOException {
//         List<Student> students = new ArrayList<>();
//         try {
//             FileInputStream fi = new FileInputStream("students.txt");
//             ObjectInputStream oi = new ObjectInputStream(fi);
            
//             students.add((Student) oi.readObject());

//             oi.close();
//             fi.close();

//         } catch (FileNotFoundException e) {
//             e.printStackTrace();
//         } catch (IOException e) {
//             e.printStackTrace();
//         } catch (ClassNotFoundException e) {
//             e.printStackTrace();
//         }


//         return students;
//     }
}
