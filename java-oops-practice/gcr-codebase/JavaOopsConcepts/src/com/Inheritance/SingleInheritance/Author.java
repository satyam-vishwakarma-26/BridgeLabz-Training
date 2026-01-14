package com.Inheritance.SingleInheritance;

//Subclass
class Author extends Book{
String name;
String bio;

Author(String title,int publicationYear,String name,String bio){
    super(title,publicationYear);
    this.name=name;
    this.bio=bio;
}

@Override
void displayInfo(){
    super.displayInfo();
    System.out.println("Author: "+name);
    System.out.println("Bio: "+bio);
}
}
