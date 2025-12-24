package AdvanceJava.Exception;

//Exception Throw KeyWord
public class L90 {
    public static void main(String[] args) {

        int i = 20;
        int j = 4;

        int arr[] = new int[5];

        try{
            j = 18/i;
            if(j ==0)
                throw new ArithmeticException("I don't want to Print Zero");
        }catch (ArithmeticException e){
            j = 18/1;
            System.out.println("That is the default Value..." + e);
        }catch (Exception e){
            System.out.println("Something went Wrong...");
        }

        System.out.println(j);
        System.out.println("Byeee");
    }
}
