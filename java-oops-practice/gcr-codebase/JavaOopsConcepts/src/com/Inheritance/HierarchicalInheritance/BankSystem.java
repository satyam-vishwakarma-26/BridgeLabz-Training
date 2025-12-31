package com.Inheritance.HierarchicalInheritance;

//Main class
public class BankSystem{
public static void main(String[] args){
    SavingsAccount s=new SavingsAccount("SA101",50000,4.5);
    CheckingAccount c=new CheckingAccount("CA102",30000,10000);
    FixedDepositAccount f=new FixedDepositAccount("FD103",100000,24);

    s.displayAccountType();
    System.out.println("-----");
    c.displayAccountType();
    System.out.println("-----");
    f.displayAccountType();
}
}
