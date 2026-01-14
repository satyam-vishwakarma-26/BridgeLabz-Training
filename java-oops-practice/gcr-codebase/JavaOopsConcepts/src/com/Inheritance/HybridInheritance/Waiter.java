package com.Inheritance.HybridInheritance;

//Waiter subclass
class Waiter extends Person implements Worker{
int tablesAssigned;

Waiter(String name,int id,int tablesAssigned){
    super(name,id);
    this.tablesAssigned=tablesAssigned;
}

@Override
public void performDuties(){
    System.out.println("Waiter serves "+tablesAssigned+" tables");
}
}
