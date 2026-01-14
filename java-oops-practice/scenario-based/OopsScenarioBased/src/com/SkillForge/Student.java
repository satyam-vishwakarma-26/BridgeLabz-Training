package com.SkillForge;
public class Student extends User implements ICertifiable{

    private int completedModules;
    private int score;
    private Course enrolledCourse;

    //contructor 
    public Student(String name,String email){
        super(name,email);
        this.completedModules=0;
        this.score=0;
    }

    //method
    public void enrollCourse(Course course){
        this.enrolledCourse=course;
        System.out.println("Enrolled in course: "+course.getTitle());
    }

  //progress tracking using operators
    public void completeModule(){
        completedModules++;
        score+=10; 
    }

    @Override
    public void generateCertificate(){
        if(enrolledCourse==null){
            System.out.println("No course enrolled");
            return;
        }

        if(completedModules==enrolledCourse.getTotalModules()){
            System.out.println("\n--- Certificate ---");
            System.out.println("Student: "+name);
            System.out.println("Course : "+enrolledCourse.getTitle());
            enrolledCourse.printCertificateFormat();
        }else{
            System.out.println("Course not completed yet ❌");
        }
    }

    public void showProgress(){
        System.out.println("Modules Completed: "+completedModules+
                "/"+enrolledCourse.getTotalModules());
        System.out.println("Score: "+score);
    }
}
