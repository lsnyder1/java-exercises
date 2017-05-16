package org.launchcode.java.studios;
import java.util.Scanner;

/**
 * Created by lonny on 5/16/2017.
 */
public class Area {

    public static void main(String[] args){
        double area;
        double radius;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the radius of your circle:");
        radius = in.nextDouble();

        if (radius > 0) {
            area = (3.14*(Math.pow(radius,2)));
            System.out.println("The area of your circle : " + area);
        } else {
            System.out.println("Your value must be positive");
        }
    }
}
