package org.example;

import org.example.encapsulation.Account;
import org.example.encapsulation.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Account account = new Account();

        account.setAccountId(100);
        account.setType("checking");
        account.setBalance(-11100);

        Customer customer = new Customer();
        customer.setAge(20);
        customer.setName("John");
        customer.setBirthday("01-01-2003");

//        System.out.println(account.getAccountId());
//        System.out.println(account.getType());
//        System.out.println(account.getBalance());

        // don't need to explicitly class toString because we are printing it out:
        System.out.println(account.toString());
        System.out.println(account.toStringHideSensitive());
        System.out.println(customer.toString());


        Customer customer2 = new Customer();
        customer2.setAge(20);
        customer2.setName("John");
        customer2.setBirthday("01-01-2003");

        System.out.println(customer2);

        System.out.println(customer == customer2);      // == always compare the reference, meaning if the 2 variables are not referring to the literal same spot in memory, will return false
        System.out.println(customer.equals(customer2)); // This depends on the implementation of the /equals method. By default, it checks using ==. We have to override the .equals method in order for it to check values
        System.out.println(customer.equals("cat"));

        // == works for primitives fine
//        System.out.println(3 == 3);
//        System.out.println('a' == 'a');
//
//        // Strings:
//        System.out.println("cat" == "cat");
//        System.out.println("cat".equals("cat"));


        Customer customer3 = new Customer();
        Customer customer4 = new Customer();

        customer3.setBirthday(null);
        customer4.setBirthday(null);

        System.out.println(customer3.equals(customer4));


    }
}
