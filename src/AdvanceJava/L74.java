package AdvanceJava;

//Interfaces
//Interface is not Class
//It provide us a design for a class, which methods it implements

//Every Variable in interface by default, final and Static

interface L74A {
    int age1 = 8;     //  by default, Final and Static
    String area = "Kamesh";

    void show();
    void config();
}
// implements keyword is used by class for using interface
class L74B implements L75A {
    public void config() {
        System.out.println("in Config");
    }

    public void show() {
        System.out.println("in Show");
    }
}

public class L74 {
    public static void main(String[] args) {

        L75A obj;
        obj = new L75B();
        obj.config();
        obj.show();

        System.out.println(L74A.age1);
    }
}