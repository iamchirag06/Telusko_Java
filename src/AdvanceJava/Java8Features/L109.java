package AdvanceJava.Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class L109 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,2,7,8,6,3);

        //Filter
        Predicate<Integer> p = (Integer integer) -> integer%2 ==0;

        //map
        Function<Integer,Integer> function = (Integer n) -> n*2;


        int result = nums.stream()
                        .filter(n->n%2==0)
                        .map(n->n*2)
                        .reduce(0,(c,e) -> c+e);

        System.out.println(result);


        // For Sorted Values as Stream
        Stream<Integer> sortedValues = nums.stream()
                                            .filter(n-> n%2==0)
                                            .sorted();


        sortedValues.forEach(n-> System.out.println(n));
    }
}
