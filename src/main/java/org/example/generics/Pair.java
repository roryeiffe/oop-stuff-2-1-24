package org.example.generics;

import java.util.List;

// Just encapsulates 2 items
// We want this to be generic in that we don't know what types the items will be
// When use this syntax, we're saying that when we create an instance of this Pair class,
// we need to explicitly state what types we will be storing in the class
// Use upper-case letters for best practice
// Parametric Polymorphism
public class Pair <T,V> {
    private T item1;
    private V item2;

    public Pair(T t, V v) {
        this.item1 = t;
        this.item2 = v;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "item1=" + item1 +
                ", item2=" + item2 +
                "}";
    }

    public static void main(String[] args) {
        // The List class is generic because it can store any type
        List<String> names;

        Pair<String, String> first_last_names = new Pair<>("George", "Washington");
        System.out.println(first_last_names);

        Pair<String, Integer> names_to_year = new Pair<>("George Washington", 1732);

        System.out.println(names_to_year);
    }
}
