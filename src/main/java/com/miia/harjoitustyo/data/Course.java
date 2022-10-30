package com.miia.harjoitustyo.data;

public class Course {
    private int CourseId;
    private String Teacher;
    private String ClassId;
    private String CourseName;
    private static int CourseIdCounter = 0;


    //konstruktorit
    public Course(){

    }
    
    public Course (String Teacher, String ClassId, String CourseName, int CourseId){
        this.Teacher = Teacher;
        this.ClassId = ClassId;
        this.CourseName = CourseName;
        this.CourseId = CourseIdCounter++;
    }

    // getterit ja setterit
    public int getCourseId() {
    return this.CourseId;
    }
    public String getTeacher() {
    return this.Teacher;
    }
    public String getClassId() {
    return this.ClassId;
    }
    public String getCourseName() {
    return this.CourseName;
    }


    public void setTeacher(String Teacher) {
        this.Teacher = Teacher;
    }
    public void setClassId(String ClassId) {
        this.ClassId = ClassId;
    }
    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }
    
}