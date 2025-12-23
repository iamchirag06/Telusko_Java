package AdvanceJava;

//Lambda Expression with Return Values
@FunctionalInterface
interface L85A {
    int add(int i, int j);
}

public class L85 {
    public static void main(String[] args) {
        //Normal implementation
        L85A obj = new L85A() {
            //Anonymous Inner Class
            public int add(int i, int j) {
                return i + j;
            }
        };
        System.out.println("Using Anonymous inner class: " + obj.add(3, 5));

        // Using Lambda Expression
        L85A obj1 = (int i, int j) -> i + j;
        System.out.println("Using Lambda Expression: " + obj1.add(3, 4));
    }
}
