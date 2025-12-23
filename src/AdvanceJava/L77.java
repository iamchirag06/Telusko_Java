package AdvanceJava;

//enum
//In Java, an enum is essentially a special type of class that contains a fixed set of constants.
enum Status{
    Running, Failed , Pending , Success //Named Constants
}

public class L77 {
    public static void main(String[] args) {

        Status s = Status.Running;
        System.out.println(s.ordinal()); // Provide the index number of Constants

        Status[] s1 = Status.values(); // Provide the values of name constants
        for(Status s2 : s1){
            System.out.println(s2 + ":" + s2.ordinal());
        }
    }
}
