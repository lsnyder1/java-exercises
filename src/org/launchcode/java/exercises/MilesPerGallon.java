package org.launchcode.java.exercises;
import java.util.Scanner;
/**
 * Created by lonny on 5/17/2017.
 */
public class MilesPerGallon {
    public static void main(String[] args){
        double miles;
        double gallons;
        Scanner m;
        Scanner g;

        m = new Scanner(System.in);
        g = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        miles = m.nextDouble();

        System.out.println("How many gallons of gas have you used?");
        gallons = g.nextDouble();

        System.out.println("You are getting " +(miles/gallons)+"  miles per gallon.");


    }
}
