
package com.reflection.intermediate.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocation {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            // Create object normally
            MathOperations obj = new MathOperations();

            // Get Class object
            Class<?> cls = obj.getClass();

            // Take method name as input
            System.out.print("Enter method name (add / subtract / multiply): ");
            String methodName = sc.nextLine();

            // Take numbers as input
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // Get method dynamically
            Method method = cls.getMethod(methodName, int.class, int.class);

            // Invoke method
            Object result = method.invoke(obj, a, b);

            // Print result
            System.out.println("Result: " + result);

            sc.close();

        } catch (Exception e) {
            System.out.println("Invalid method name or error occurred.");
        }
    }
}
