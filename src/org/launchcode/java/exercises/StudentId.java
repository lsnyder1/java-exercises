package org.launchcode.java.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by lonny on 5/23/2017.
 */
public class StudentId {

    public static void main(String[] args){

        Integer newId;
        String newName;
        HashMap<Integer,String> students= new HashMap<>();
        Scanner in = new Scanner(System.in);


            System.out.println("Enter your students (or enter to finish)");

        do{
            System.out.println("Name:");
            newName=in.nextLine();

            if (!newName.equals("")) {
                System.out.println("Id:");
                newId = in.nextInt();

                students.put(newId, newName);

                in.nextLine();
            }
        }

        while(!newName.equals(""));

        System.out.println("Class Roster:\n");

        for (Map.Entry<Integer,String> student :students.entrySet()) {

            System.out.println("Id: " + student.getKey()+"\nName: " +student.getValue() +"\n******************************\n");





        }



    }
}
