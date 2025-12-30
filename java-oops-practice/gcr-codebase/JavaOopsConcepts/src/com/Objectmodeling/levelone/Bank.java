package com.Objectmodeling.levelone;
import java.util.ArrayList;

class Bank{
    String bankName;
    ArrayList<Customer> customers=new ArrayList<>();

    //constructor
    public Bank(String bankName){
        this.bankName=bankName;
    }

    //open account
    public void openAccount(String name,int accountNumber,double balance){
        Customer customer=new Customer(name,accountNumber,balance,this);
        customers.add(customer);
        System.out.println("Account opened successfully for "+name+" in "+bankName);
    }

    //show all customers
    public void showCustomers(){
        System.out.println("\nCustomers in "+bankName+":");
        for(Customer c:customers){
            System.out.println("- "+c.name+" (Account: "+c.accountNumber+")");
        }
    }

    //get customer by account number
    public Customer getCustomer(int accountNumber){
        for(Customer c:customers){
            if(c.accountNumber==accountNumber){
                return c;
            }
        }
        return null;
    }
}
