package AdvanceJava.Java8Features;

//Optional Class in JAVA 8 Feature

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class L111 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Chirag","Akash","Sahil","Varun");

        Optional<String> name = names.stream()
                .filter(str->str.contains("r"))
                .findFirst();

        System.out.println(name.orElse("Not Found"));
    }
}
