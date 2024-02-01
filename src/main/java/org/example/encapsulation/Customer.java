package org.example.encapsulation;

public class Customer {
    private String name;
    private int age;
    private String birthday;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    // set up .equals method to compare this to any other type of object
    @Override
    public boolean equals(Object other) {
        // first, check the reference, if these 2 objects are occupying the same space in memory, then they're guaranteed to be equal to each other
        if(this == other) return true;
        // if not, we have to check some other things:
        // check type to make sure it is type Customer
        // If we are not checking against a customer object, there is NO WAY for these objects to be equal, so return false:
        if (!(other instanceof Customer)) return false;

        // fields
        // if we've reached this part of the code, it's guaranteed that other is a Customer object
        // So, we cast the object to a Customer object so that we can access its fields:
        // Because Customer is a descendant of Object
        Customer otherCustomer = (Customer) other;

        if (this.age == otherCustomer.age && this.name == otherCustomer.name && this.birthday == otherCustomer.birthday) return true;
        else return false;




        // null
    }


}
