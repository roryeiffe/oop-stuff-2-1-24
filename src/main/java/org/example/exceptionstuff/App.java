package org.example.exceptionstuff;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {


        dummy();
    }

    public static void dummy() throws Exception {
        throw new Exception();
    }

    public static int add() {
        // In this code, there are no checked exceptions
        int x = 2 + 2;
        int y[] = {};
        System.out.println(y[36]);
        return x;
    }

    public static void read() throws IOException {
        // Here, the compiler "checks" these constructors/methods and can see that there is a
        // a possibility that one of these checked exceptions can be thrown
        // creating object of FileReader
        FileReader reader = new FileReader("file.txt");

        // passing FileReader to
        // buffered reader
        BufferedReader br = new BufferedReader(reader);

        // declaring empty string
        String data =null;

        // while loop to read data
        // and printing them
        while ((data = br.readLine()) != null)
        {
            System.out.println(data);
        }

        // closing the object
        br.close();
    }
}
