package com.Inheritance.HybridInheritance;

//Chef subclass
class Chef extends Person implements Worker{
String specialty;

Chef(String name,int id,String specialty){
    super(name,id);
    this.specialty=specialty;
}

@Override
public void performDuties(){
    System.out.println("Chef cooks "+specialty+" dishes");
}
}
