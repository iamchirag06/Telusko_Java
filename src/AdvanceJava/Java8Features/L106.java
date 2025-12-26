package AdvanceJava.Java8Features;

//Different types of Loops or Need of Stream API

import java.util.Arrays;
import java.util.List;

public class L106 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4,5,7,6,3,2);

        //Simple for Loop
        for(int i = 0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }

        //Enhanced For loop
        for(int i : nums){
            System.out.println(i);
        }

        //For Each Loop
        nums.forEach(n -> System.out.println(n));


    }
}
