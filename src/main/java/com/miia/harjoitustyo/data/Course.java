package com.miia.harjoitustyo.data;

public class Course {
    private int courseId;
    private String teacher;
    private String ClassId;
    private String CourseName;
    private static int CourseIdCounter = 0;


    //konstruktorit
    public Course(){
        
    }
    
    public Course (String teacher, String ClassId, String CourseName, int courseId){
        this.teacher = teacher;
        this.ClassId = ClassId;
        this.CourseName = CourseName;
        this.courseId = CourseIdCounter++;
    }

    // getterit ja setterit
    public int getCourseId() {
    return this.courseId;
    }
    public String getTeacher() {
    return this.teacher;
    }
    public String getClassId() {
    return this.ClassId;
    }
    public String getCourseName() {
    return this.CourseName;
    }


    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    public void setClassId(String ClassId) {
        this.ClassId = ClassId;
    }
    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }
    
}