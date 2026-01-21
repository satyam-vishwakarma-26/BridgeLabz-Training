package com.addressbooksystem;
import java.util.*;

// Manages all contacts
public class AddressBook{
    private ArrayList<Contact> contacts=new ArrayList<>();

    // Add new contact with duplicate check
    public void addContact(Contact contact){
        for(Contact c:contacts){
            if(c.getFirstName().equalsIgnoreCase(contact.getFirstName())&&c.getLastName().equalsIgnoreCase(contact.getLastName())){
                System.out.println("Duplicate contact not allowed");
                return;
            }
        }
        contacts.add(contact);
        System.out.println("Contact added");
    }
    
    // Edit contact by name
    public void editContact(String firstName,String lastName,String phone,String email,Address address){
        for(Contact c:contacts){
            if(c.getFirstName().equalsIgnoreCase(firstName)&&c.getLastName().equalsIgnoreCase(lastName)){
                c.setPhone(phone);
                c.setEmail(email);
                c.setAddress(address);
                System.out.println("Contact updated");
                return;
            }
        }
        System.out.println("Contact not found");
    }
    
    // Delete contact by name
    public void deleteContact(String firstName,String lastName){
        Iterator<Contact> it=contacts.iterator();
        while(it.hasNext()){
            Contact c=it.next();
            if(c.getFirstName().equalsIgnoreCase(firstName)&&c.getLastName().equalsIgnoreCase(lastName)){
                it.remove();
                System.out.println("Contact deleted");
                return;
            }
        }
        System.out.println("Contact not found");
    }
    
    // Search contacts by city or state
    public void searchByCityOrState(String value){
        boolean found=false;
        for(Contact c:contacts){
            if(c.getAddress().getCity().equalsIgnoreCase(value)||c.getAddress().getState().equalsIgnoreCase(value)){
                c.display();
                found=true;
            }
        }
        if(!found)System.out.println("No contacts found");
    }
    
    // Display all contacts sorted alphabetically
    public void displayAll(){
        if(contacts.isEmpty()){
            System.out.println("No contacts available");
            return;
        }
        contacts.sort((a,b)->(a.getFirstName()+a.getLastName()).compareToIgnoreCase(b.getFirstName()+b.getLastName()));
        for(Contact c:contacts){
            c.display();
        }
    }
}
