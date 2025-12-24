package AdvanceJava.Exception;

import java.util.Scanner;

public class L93 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter a Number:");


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num);

        sc.close();
    }
}
