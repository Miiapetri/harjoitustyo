package com.miia.harjoitustyo.data;

public class Student {
    private String fname;
    private String lname;
    private int age;
    private int grade;
    private long StudentId;
    private static long idCounter=0;


    // konstruktorit
    public Student(){

    }

    public Student(String fname, String lname, int age, int grade){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.grade = grade;
        this.StudentId = idCounter++;

    }

    // getterit ja setterit 
    public String getfname() {
    return this.fname;
    }
    public String getLname() {
        return this.lname;
    }
    public long getStudentId() {
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
    
}