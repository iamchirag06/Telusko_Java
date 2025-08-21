package AdvanceJava;

//Interfaces
//Interface is not Class

interface L74A {
    int age = 8;     //  by defaultsnFinal and Static
    String area = "Kamesh";

    void show();

    void config();
}

public class L74 {
    public static void main(String[] args) {

        L74A obj;
        obj = new L74B();
        obj.config();
        obj.show();

        System.out.println(L74A.age);

    }
}

class L74B implements L74A {
    public void config() {
        System.out.println("in Config");
    }

    public void show() {
        System.out.println("in Show");
    }
}