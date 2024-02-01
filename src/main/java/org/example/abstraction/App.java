package org.example.abstraction;

import java.util.ArrayList;
import java.util.List;

// Benefits of Abstraction:
// 1. Hides the less important implementations
// 2. Organizes a hierarchy of classes/interfaces
// 3. Loose Coupling... if we change the implementation as long as we are still following the "contract" hopefully shouldn't break the code
public class App {
    public static void main(String[] args) {
        // Declare this variable as an Animal and instantiate a dog
        Animal dog = new Dog();
        dog.move();
        System.out.println(dog.eat());
        System.out.println(dog.makeSound());

        Animal cat = new Cat();


        // Because dog and cat both implement the same interface, we can just declare the array as the interface type and
        // add any animal that implements that interface
        List<Animal> animalList = new ArrayList<>();
        animalList.add(cat);
        animalList.add(dog);

        for(Animal animal: animalList) {
            animal.move();
        }


    }
}
