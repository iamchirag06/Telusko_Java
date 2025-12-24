package AdvanceJava.AbstractionAndInterfaces;
// Functional Interface: which has only one interface in it
//Also called as SAM : Single Abstract Method Interface

@FunctionalInterface // it is declared to make the interface to functional interface
interface L83A{
    void show();
}

class L83B implements L83A{
    public void show(){
        System.out.println("Shows");
    }
}
public class L83 {
    public static void main(String[] args) {
        L83A obj = new L83B();
        obj.show();


    //Using Anonymous Inner Class:
//        L83A obj = new L83A() {
//            public void show() {
//                System.out.println("shows");
//            }
//        };
//        obj.show();

    }
}
