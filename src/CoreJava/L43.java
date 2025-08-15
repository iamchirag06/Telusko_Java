package CoreJava;

public class L43 {
    public static void main(String[] args) throws ClassNotFoundException {

        Mobile2 obj1 = new Mobile2();
        obj1.brand="Apple";
        obj1.price=10000;
        Mobile1.name="IPhone";

        Mobile2 obj2 = new Mobile2();


    }
}
class Mobile2 {
    String brand; //Instance variable
    int price;
    static String name; //Static variable

    static { //It is only called once , irrespective of how many objects are made!!
        name="Phone";
        System.out.println("In static block");
    }

    public Mobile2(){
        brand="";
        price=100;
        System.out.println("In Constructor");
    }

    public void Show(){
        //Local variable
        System.out.println(brand+":"+price+";"+name);
    }

}