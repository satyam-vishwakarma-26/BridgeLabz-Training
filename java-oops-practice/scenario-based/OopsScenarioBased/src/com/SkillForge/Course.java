package com.SkillForge;
public class Course{

    private String title;
    private String instructor;
    private String level;
    private String[] modules;
    private double rating;           //protected logic
    private String[] reviews;         //read-only

    //constructor with default modules
    public Course(String title,String instructor,String level){
        this.title=title;
        this.instructor=instructor;
        this.level=level;
        this.modules=new String[]{"Intro","Basics","Advanced"};
        this.reviews=new String[]{"Great course","Very helpful"};
        calculateRating();
    }

    //constructor with custom modules
    public Course(String title,String instructor,String level,String[] modules){
        this.title=title;
        this.instructor=instructor;
        this.level=level;
        this.modules=modules;
        this.reviews=new String[]{"Excellent","Well structured"};
        calculateRating();
    }

    //encapsulated rating logic
    private void calculateRating(){
        rating=4.5;
    }

    public String getTitle(){
        return title;
    }

    public int getTotalModules(){
        return modules.length;
    }

    public void showCourse(){
        System.out.println("\nCourse Title : "+title);
        System.out.println("Instructor  : "+instructor);
        System.out.println("Level       : "+level);
        System.out.println("Rating      : "+rating);
        System.out.println("Modules:");
        for(String m:modules){
            System.out.println(" - "+m);
        }
    }

    //polymorphism based on course level
    public void printCertificateFormat(){
        if(level.equalsIgnoreCase("Beginner")){
            System.out.println("Certificate Type: Basic Completion Certificate 🟢");
        }else if(level.equalsIgnoreCase("Intermediate")){
            System.out.println("Certificate Type: Skill Achievement Certificate 🔵");
        }else{
            System.out.println("Certificate Type: Professional Certificate 🟣");
        }
    }

    //read-only access to reviews
    public void showReviews(){
        System.out.println("\nCourse Reviews:");
        for(String r:reviews){
            System.out.println("- "+r);
        }
    }
}
