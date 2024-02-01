package org.example.encapsulation;

import java.util.Objects;

// The idea of encapsulation here is we're keeping all of our related methods/fields
// encapsulated/contained
// Standard for encapsulating classes: private fields and public methods to access/change those fields
// public getters - public methods that retrieve these values
// public setters - public methods that change/update these values
// Most of the time, if not always, will have a getter and setter for each field
// private - can only be accessed within the class
// public - can be accessed across all classes within the project
// protected - can be accessed within the same package or within any sub-class (any class that extends it)
// default - we don't include an explicit access modifier (don't actually write default, anything without an AM is considered default) - acessible within the same package
public class Account {
    // final means value can't be changed
    //    public final String bankName = "Bank of America";

    // Because these are fields, we want them to be private
    private int accountId;
    private double balance;
    private String type;

    // Simple getter, just returns the accountId
    public int getAccountId() {
        return this.accountId;
    }

    public void setAccountId(int accountId) {
        // taking the value that is passed in to this setter method and
        // assigning it to the instance's field
        this.accountId = accountId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        // if balance is greater than 1000, don't do anything
        if (balance > 1000 || balance < -1000) {
            return;
        }
        else {
            this.balance = balance;
        }
    }

    // technically inheriting this method from the object class and we're changing it
    @Override
    // toString just returns a string representation
    public String toString() {
        return "Account id: " + this.accountId + ", Balance: " + this.balance + ", Account Type: " + this.type;
    }

    public String toStringHideSensitive() {
        return "Balance: " + this.balance + ", Account Type: " + this.type;
    }

    public static void main(String[] args) {
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountId == account.accountId && Double.compare(account.balance, balance) == 0 && Objects.equals(type, account.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, balance, type);
    }
}
