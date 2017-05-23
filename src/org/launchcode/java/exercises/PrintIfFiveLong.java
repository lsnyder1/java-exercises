package org.launchcode.java.exercises;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lonny on 5/23/2017.
 */
public class PrintIfFiveLong {

    public static void main(String[] args){

        ArrayList<String> words = new ArrayList<String>();
        words.addAll(Arrays.asList("John","Sally","pete","Lonny","Simon","Joe"));

        System.out.println(words);

        for(String name : words){
            if(name.length()==5){
                System.out.println(name);
            }
        }
    }
}
