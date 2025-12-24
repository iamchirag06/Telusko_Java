package AdvanceJava.AbstractionAndInterfaces;
// Lambda Expression
//Lambda expressions provide a clear and concise way to represent the
//implementation of a functional interface

//Lambda expressions were introduced in Java SE 8

@FunctionalInterface
interface L84A {
    void show(int i);
}

public class L84 {
    public static void main(String[] args) {
        L84A obj = i -> System.out.println("In Show " + i);

        obj.show(4);
    }
}
