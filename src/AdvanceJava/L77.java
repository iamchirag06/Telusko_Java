package AdvanceJava;

//enum
//In Java, an enum is essentially a special type of class that contains a fixed set of constants.
enum Status{
    Running, Failed , Pending , Success
}

public class L77 {
    public static void main(String[] args) {
        int i = 5;
        Status s = Status.Running;

        System.out.println(s.ordinal());

        Status[] s1 = Status.values();
//        System.out.println(s1[0]);

        for(Status s2 : s1){
            System.out.println(s2 + ":" + s2.ordinal());
        }
    }
}
