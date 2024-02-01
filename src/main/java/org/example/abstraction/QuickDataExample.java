package org.example.abstraction;

import java.util.List;

// This interface depicts what our data layer should be capable of performing but doesn't get into
// the intracicies of connecting to the database, setting up queries, etc.
public interface QuickDataExample {
    public void insert(Dog dog);
    public List<Dog> getDogs();
    public void delete(int id);
}
