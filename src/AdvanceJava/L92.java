package AdvanceJava;
//throws keyword
// Also called Ducking Exception

class L92A{
    public void show() throws ClassNotFoundException{

        Class.forName("Demo");
    }
}
public class L92 {

    static{
        System.out.println("Class Loader");
    }

    public static void main(String[] args) {

            L92A obj = new L92A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
