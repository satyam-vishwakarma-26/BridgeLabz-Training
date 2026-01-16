package com.generics.resumescreeningsystem;
// Generic Resume class with bounded type parameter
public class Resume<T extends JobRole>{
    private String candidateName;
    private T role;
    public Resume(String candidateName,T role){
        this.candidateName=candidateName;
        this.role=role;
    }
    public T getRole(){
        return role;
    }
    public void display(){
        System.out.println("Candidate: "+candidateName+" | Role: "+role.getRoleName());
        role.evaluateSkills();
    }
}
