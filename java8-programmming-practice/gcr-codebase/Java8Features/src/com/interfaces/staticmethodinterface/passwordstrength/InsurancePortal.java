package com.interfaces.staticmethodinterface.passwordstrength;
public class InsurancePortal {
    public static void main(String[] args) {

        String password = "Insure@123";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Password is strong");
        } else {
            System.out.println("Password is weak");
        }
    }
}