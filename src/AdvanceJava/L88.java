package AdvanceJava;

public class L88 {
    public static void main(String[] args) {

        String string = null;
        int i = 2;
        int j = 4;

        int nums[] = new int[5];

        try {

            j = 18 / i;
            System.out.println(string.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);

        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by Zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your Limits");
        } catch (Exception e) { //Parent Exception at the end...
            System.out.println("Something is Wrong..." +  e);
        }

        System.out.println(j);
        System.out.println("Bye Bye");
    }
}
