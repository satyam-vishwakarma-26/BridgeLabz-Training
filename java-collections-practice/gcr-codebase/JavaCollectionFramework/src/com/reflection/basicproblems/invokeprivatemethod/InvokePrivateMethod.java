
package com.reflection.basicproblems.invokeprivatemethod;

import java.lang.reflect.Method;

public class InvokePrivateMethod {

    public static void main(String[] args) {
        try {
        	
            Calculator calc = new Calculator();

            // Get Class object
            Class<?> cls = calc.getClass();

            // Get private method "multiply"
            Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

            // Make private method accessible
            method.setAccessible(true);

            // Invoke method
            Object result = method.invoke(calc, 5, 4);

            // Print result
            System.out.println("Result of multiplication: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
