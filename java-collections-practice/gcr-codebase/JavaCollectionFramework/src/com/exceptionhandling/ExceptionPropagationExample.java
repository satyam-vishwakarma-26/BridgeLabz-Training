package com.exceptionhandling;

public class ExceptionPropagationExample {

    public static void method1() {
        int result = 10 / 0;   // ArithmeticException
    }

    public static void method2() {
        method1();            // propagates exception
    }

    public static void main(String[] args) {
        try {
            method2();        // handled here
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
