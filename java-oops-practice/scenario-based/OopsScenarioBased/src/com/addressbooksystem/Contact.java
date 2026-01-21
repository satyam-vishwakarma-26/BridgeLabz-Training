package com.addressbooksystem;

// Represents a contact in address book
public class Contact{
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Address address;
    public Contact(String firstName,String lastName,String phone,String email,Address address){
        this.firstName=firstName;
        this.lastName=lastName;
        this.phone=phone;
        this.email=email;
        this.address=address;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Address getAddress(){
        return address;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setAddress(Address address){
        this.address=address;
    }

    // Display contact details
    public void display(){
        System.out.println(firstName+" "+lastName+" | "+phone+" | "+email+" | "+address.getCity()+","+address.getState()+"-"+address.getZip());
    }
}
