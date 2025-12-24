package AdvanceJava.Exception;
//Try with Finally


import java.util.Scanner;

public class L94 {
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = null;
        try
        {
            scanner = new Scanner(System.in);
            num = scanner.nextInt();
            System.out.println(num);
        }
        finally { //This keyword is used,when we have to close the Resource
            System.out.println("Bieee");
            scanner.close();
        }
    }
}
