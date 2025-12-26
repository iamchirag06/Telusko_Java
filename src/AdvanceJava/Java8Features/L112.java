package AdvanceJava.Java8Features;

import java.util.Arrays;
import java.util.List;

//Method Reference
public class L112 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Navin","Harsh","John");

        //Normal way to Change all names to UPPERCASE
        List<String> unames = names.stream()
                                    .map(name -> name.toUpperCase())
                                    .toList();
        System.out.println(unames);

        //Using Method reference
        // (for where it belong :: what method to perform)

        List<String> uname = names.stream()
                .map(String::toUpperCase)  // Method Reference
                .toList();

        uname.forEach(System.out::println);


    }
}
