package com.generics.resumescreeningsystem;
// Base abstract class for all job roles
public abstract class JobRole{
    protected String roleName;
    protected JobRole(String roleName){
        this.roleName=roleName;
    }
    public String getRoleName(){
        return roleName;
    }
    public abstract void evaluateSkills();
}
