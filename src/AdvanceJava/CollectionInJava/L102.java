package AdvanceJava.CollectionInJava;
//List Collection

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class L102 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(4);
        nums.add(6);
        nums.add(7);
        nums.add(6);

//        System.out.println(nums.get(3));

        System.out.println(nums);

        //Print each value one by one....
//        for(int n : nums){
//            System.out.println(n);
//        }
    }
}
