package AdvanceJava;

// try catch Exception
public class L87 {
    public static void main(String[] args) {

        int i = 0;
        int j = 4;

    try{
        j = 18 / i;
    }catch (Exception e){
        System.out.println("Something went Wrong");
    }
        System.out.println(j);

    }
}
