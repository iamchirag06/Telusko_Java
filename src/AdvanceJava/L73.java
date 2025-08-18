package AdvanceJava;

// Implementing Both Abstract class and Anonymous Class


//Abstract class
abstract class L73A{

    public abstract void show();
    public abstract void config();
}

// class L73B extends L73A{
//
//    public void show() {
//        System.out.println("in the Show");
//    }
// }

public class L73 {
    public static void main(String[] args) {
        L73A obj = new L73A(){
            //anonymous inner class
            //More than one method is also applicable
            public void show() {
                System.out.println("in the Show");
            }
            public void config() {
                System.out.println("in the Config");
            }
        };
        obj.show();
    }
}
