package AdvanceJava.Java8Features;

//for each method

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class L107 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,4,6,2,7);

        //Implement Using Anonymous inner class
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        //Implement Using Lambda Expression
        Consumer<Integer> consumer1 = ( integer) -> System.out.println(integer);


        //Actual ForEach Method

        nums.forEach(n -> System.out.println(n));

    }
}
