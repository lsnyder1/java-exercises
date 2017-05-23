package org.launchcode.java.exercises;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lonny on 5/17/2017.
 */
public class ArraySum {

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        int sum = 0;

        for(Integer nums : numbers){
            sum+=nums;
        }

        System.out.println(sum);



    }
}
