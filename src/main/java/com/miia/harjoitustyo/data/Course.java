package com.miia.harjoitustyo.data;

public class Course {
    private long CourseId;
    private String Teacher;
    private String ClassId;
    private String CourseName;
    private static long CourseIdCounter = 0;


    //konstruktorit
    public Course(){

    }
    
    public Course (String Teacher, String ClassId, String CourseName){
        this.CourseId = CourseIdCounter++;
        this.Teacher = Teacher;
        this.ClassId = ClassId;
        this.CourseName = CourseName;
    }

    // getterit ja setterit
    public long getCourseId() {
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