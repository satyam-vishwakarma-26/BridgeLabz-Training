
package com.reflection.intermediate.retrieveannotationsatruntime;

public class RetrieveAnnotation {

    public static void main(String[] args) {

        try {
            // Load annotated class
            Class<?> cls = Class.forName(
                "com.reflection.intermediate.retrieveannotationsatruntime.Book"
            );

            // Check annotation
            if (cls.isAnnotationPresent(Author.class)) {

                Author author = cls.getAnnotation(Author.class);
                System.out.println("Author Name: " + author.name());

            } else {
                System.out.println("Author annotation not found");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}
