package com.Objectmodeling.levelone;

public class BankAssociation{
    public static void main(String[] args){

        //create bank
        Bank bank=new Bank("State Bank of India");

        //open accounts
        bank.openAccount("Rohan",101,5000);
        bank.openAccount("Amit",102,12000);
        bank.openAccount("Neha",103,8000);

        //show bank customers
        bank.showCustomers();

        //customer viewing balance
        Customer customer=bank.getCustomer(102);
        if(customer!=null){
            System.out.println();
            customer.viewBalance();
        }
    }
}
