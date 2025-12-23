package AdvanceJava;
// Custom Exception


// create new class -> create constructor
// new class extends Exception
// constructor calling super constructor


class ChiragException extends Exception {
    public ChiragException(String string) {
        super(string);
    }
}

public class L91 {
    public static void main(String[] args) {
        int i = 20;
        int j = 4;

        int arr[] = new int[5];

        try {
            j = 18 / i;
            if (j == 0)
                throw new ChiragException("I don't want to Print Zero"); //Custom Exception
        } catch (ChiragException e) {
            j = 18 / 1;
            System.out.println("That is the default Value..." + e);
        } catch (Exception e) {
            System.out.println("Something went Wrong...");
        }

        System.out.println(j);
        System.out.println("Byeee");
    }
}
