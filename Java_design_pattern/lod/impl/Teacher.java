package lod.impl;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private String clazz;
    private static List<Student> studentList;
    public Teacher(){}
    public Teacher(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }
    static {
        studentList=new ArrayList<>();
        studentList.add(new Student("花花",10,588));
        studentList.add(new Student("小明",8,594));
        studentList.add(new Student("豆豆",7,613));
        studentList.add(new Student("小丽",3,690));
        studentList.add(new Student("小李",12,572));
        studentList.add(new Student("小豆",6,637));
    }
    public int clazzTotalScore(){
        int totalScore=0;
        for(Student stu:studentList){
            totalScore+=stu.getGrade();
        }
        return totalScore;
    }
    public double clazzAverageScore(){
        double totalScore=0;
        for(Student stu:studentList){
            totalScore+=stu.getGrade();
        }
        return (int) totalScore/studentList.size();
    }
    public int clazzStudentCount(){
        return studentList.size();
    }
    public String getName(){
        return name;
    }
    public String getClazz(){
        return clazz;
    }
}
