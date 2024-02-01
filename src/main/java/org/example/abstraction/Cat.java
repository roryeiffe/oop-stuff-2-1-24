package org.example.abstraction;

public class Cat implements Animal{


    @Override
    public String makeSound() {
        return "meow";
    }

    @Override
    public String eat() {
        return "cat food";
    }

    @Override
    public void move() {
        System.out.println("Walking on 4 paws. Using my tail for balance.");
    }
}
