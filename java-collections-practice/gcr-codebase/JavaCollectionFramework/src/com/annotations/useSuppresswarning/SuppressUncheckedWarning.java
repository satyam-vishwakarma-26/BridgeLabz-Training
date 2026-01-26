
package com.annotations.useSuppresswarning;
import java.util.ArrayList;

public class SuppressUncheckedWarning {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // ArrayList without generics
        ArrayList list = new ArrayList();

        // Adding different types of elements
        list.add("Java");
        list.add(100);
        list.add(45.5);

        // Printing elements
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
