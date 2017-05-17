package org.launchcode.java.exercises;
import java.util.Scanner;

/**
 * Created by lonny on 5/17/2017.
 */
public class RectangleArea {

    public static void main (String[] args){

        double width;
        double height;
        Scanner w;
        Scanner h;


        w= new Scanner(System.in);
        h= new Scanner(System.in);


        System.out.println("What is the width of the rectangle?");
        width= w.nextDouble();

        System.out.println("What is the height of the rectangle?");
        height=h.nextDouble();

        System.out.println("The area of your rectangle is:"+(height*width));
    }
}
