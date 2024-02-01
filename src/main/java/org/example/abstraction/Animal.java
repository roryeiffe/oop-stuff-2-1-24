package org.example.abstraction;

// When creating this interface, it's like we are creating a contract which
// states that any class that implements this interface promises to implement those methods
public interface Animal {
    String makeSound();
    String eat();
    void move();


}
