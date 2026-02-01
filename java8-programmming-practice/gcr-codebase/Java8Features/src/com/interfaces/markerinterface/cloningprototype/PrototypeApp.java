package com.interfaces.markerinterface.cloningprototype;
public class PrototypeApp {
    public static void main(String[] args) {

        try {
            PrototypeModel original = new PrototypeModel("InvoiceTemplate", 1);

            PrototypeModel copy1 = (PrototypeModel) original.clone();
            PrototypeModel copy2 = (PrototypeModel) original.clone();

            System.out.println("Original: " + original);
            System.out.println("Clone 1: " + copy1);
            System.out.println("Clone 2: " + copy2);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}