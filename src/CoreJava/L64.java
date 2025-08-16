package CoreJava;

public class L64 {
    public static void main(String[] args) {

        //In Java, "boxing" refers to the automatic conversion of a primitive data type
        // into its corresponding wrapper class object.
        // This process is also known as "autoboxing."

        int num =7;
        Integer num1 = num; //AutoBoxing

        //Unboxing in Java refers to the automatic conversion performed
        // by the Java compiler from a wrapper class object to its
        // corresponding primitive data type.
        // It is the reverse process of autoboxing.

        int num2 = num1; //Auto-Unboxing

        System.out.println(num2 );


        String str = "12";
        int num3 = Integer.parseInt(str);

        System.out.println(num3 * 2);


    }
}
