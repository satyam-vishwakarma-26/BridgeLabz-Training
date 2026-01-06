package com.EduMentor;

public class Learner extends User implements ICertifiable{

    private String courseType; //Short / Full-time

    public Learner(int userId,String name,String email,String courseType){
        super(userId,name,email);
        this.courseType=courseType;
    }

    //polymorphism
    public void generateCertificate(){
        if(courseType.equalsIgnoreCase("Short")){
            System.out.println("Certificate: Short Course Completion");
        }else{
            System.out.println("Certificate: Full-Time Program Completion");
        }
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Role: Learner");
        System.out.println("Course Type: "+courseType);
    }
}
