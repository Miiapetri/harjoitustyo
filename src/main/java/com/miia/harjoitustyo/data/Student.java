package com.miia.harjoitustyo.data;

public class Student {
    private String fname;
    private String lname;
    private int age;
    private int grade;
    private int StudentId;
    private static int idCounter=0;


    // konstruktorit, joissa luodaan student oliot. studentid ei täälläkään toimi
    public Student(){

    }

    public Student(String fname, String lname, int age, int grade){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.grade = grade;
        this.StudentId = Student.idCounter;
        Student.idCounter++;

    }

    // getterit ja setterit 
    public String getfname() {
        return this.fname;
    }
    public String getLname() {
        return this.lname;
    }
    public int getStudentId() {
        return this.StudentId;
    }
    public String getName() {
        return this.fname;
    }
    public int getAge() {
       return this.age;
    }
    public int getGrade() {
    return this.grade;
    }
    
    public void setfname(String fname) {
        this.fname = fname;
    }
    public void setlname(String lname) {
        this.lname = lname;
    }
    public void setage(int age) {
        this.age = age;
    }
    public void setgrade(int grade) {
        this.grade = grade;
    }

    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }
    
}