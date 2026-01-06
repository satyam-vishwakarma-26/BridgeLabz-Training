package com.EduMentor;

public class Instructor extends User{

    private String specialization;

    public Instructor(int userId,String name,String email,String specialization){
        super(userId,name,email);
        this.specialization=specialization;
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Role: Instructor");
        System.out.println("Specialization: "+specialization);
    }
}
