package com.ExamCell;

// Represents a student and score
public class Student{
    String name;
    int score;
    public Student(String name,int score){
        this.name=name;
        this.score=score;
    }

    // Display student info
    public void display(){
        System.out.println(name+" | Score: "+score);
    }
}
