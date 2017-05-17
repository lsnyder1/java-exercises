package org.launchcode.java.exercises;
import java.util.Scanner;

/**
 * Created by lonny on 5/17/2017.
 */
public class HelloWorld {
    public static void main(String[] args){
        String name;
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("What is your name?");

        name = in.next();

        if (name != "") {
            System.out.println("Hello " +name+".");

        }else {
            System.out.println("Hello noname.");
        }




    }
}
