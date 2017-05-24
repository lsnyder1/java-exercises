package org.launchcode.java.studios;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by lonny on 5/24/2017.
 */
public class countingChars {

    public static void main(String[] args){

       String message="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
       char[] charsInMessage = message.toCharArray();
       ArrayList<Character> uniqueChars= new ArrayList<>();
       HashMap<Character,Integer> letterCount = new HashMap<>();

       for(char letter:charsInMessage){

           if (!uniqueChars.contains(letter)){
               uniqueChars.add(letter);

           }
       Collections.sort(uniqueChars);

       for (char lettersIn:uniqueChars){
           int counter = 0;
           for (char letters : charsInMessage){
               if(lettersIn == letters){
                   counter +=1;
               }
           letterCount.put(lettersIn, counter);
           }
       }
       }


       System.out.println(uniqueChars);
       System.out.println(letterCount);






    }
}
