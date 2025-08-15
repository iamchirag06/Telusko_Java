package CoreJava;

//Strings are Immutable in JAVA
public class L39 {
    public static void main(String[] args) {

        String name = "Chirag";
        name = name + " Singh";
        System.out.println("hello "+name);


        String s1 = "Navin";
        String s2 = "Navin";

        System.out.println(s1 == s2);

    }
}
