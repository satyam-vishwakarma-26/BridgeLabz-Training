
package com.annotations.useOverride;
public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
