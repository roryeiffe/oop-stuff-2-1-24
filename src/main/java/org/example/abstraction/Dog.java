package org.example.abstraction;

// We want to state that we are implementing an interface:
public class Dog implements Animal {

    public String makeSound() {
        return "Woof!";
    }

    public String eat() {
        return "Eating some dog treats!";
    }

    public void move() {
        System.out.println("Moving on 4 paws.");
    }
}
