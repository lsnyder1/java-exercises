package org.launchcode.java.exercises;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by lonny on 5/23/2017.
 */
public class ArrayPrintLoops {

    public static void main(String[] args){

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.addAll(Arrays.asList(1,1,2,3,5,8));

        for(Integer num : nums){
            System.out.println(num);
        }
    }
}
