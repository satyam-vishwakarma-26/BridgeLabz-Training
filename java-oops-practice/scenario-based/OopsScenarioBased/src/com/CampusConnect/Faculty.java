package com.CampusConnect;
/* ---------- Faculty Class ---------- */
class Faculty extends Person{
    private String department;

    public Faculty(int id,String name,String email,String department){
        super(id,name,email);
        this.department=department;
    }

    //assign grade to student
    public void assignGrade(Student student,int grade){
        student.addGrade(grade);
        System.out.println("Grade "+grade+" assigned to "+student.name);
    }

    //overridden method
    public void printDetails(){
        super.printDetails();
        System.out.println("Role: Faculty");
        System.out.println("Department: "+department);
    }
}