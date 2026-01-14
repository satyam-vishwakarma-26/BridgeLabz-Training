package com.Inheritance.HierarchicalInheritance;

//Main class
public class SchoolSystem{
public static void main(String[] args){
    Teacher t=new Teacher("Mr. Sharma",40,"Maths");
    Student s=new Student("Satyam",20,"B.Tech");
    Staff st=new Staff("Ramesh",35,"Administration");

    t.displayRole();
    System.out.println("-----");
    s.displayRole();
    System.out.println("-----");
    st.displayRole();
}
}
