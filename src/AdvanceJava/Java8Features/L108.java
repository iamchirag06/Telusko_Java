package AdvanceJava.Java8Features;


//Stream API
// Once we use it, again we do not reuse it...

import java.util.Arrays;
import java.util.List;

public class L108 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4,5,7,8,6,3);

//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer>s2 = s1.filter(n-> n%2==0);
//        Stream<Integer> s3 = s2.map(n-> n*2);
//        int result = s3.reduce(0,(c,e)-> c+e);

        int result = nums.stream()
                         .filter(n->n%2==0) // separate even number
                         .map(n->n*2) //double the even number
                         .reduce(0,(c,e)-> c+e); // summation


        System.out.println(result);

//      s3.forEach(n-> System.out.println(n));
    }
}
