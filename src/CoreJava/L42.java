package CoreJava;

//static method
public class L42 {
    public static void main(String[] args) {

        Mobile1 obj1 = new Mobile1();
        obj1.brand="Apple";
        obj1.price=10000;
        Mobile1.name="IPhone";

        Mobile1 obj2 = new Mobile1();
        obj2.brand="SamSung";
        obj2.price=30000;
        Mobile1.name="Galaxy Fold";

        Mobile1 obj3 = new Mobile1();
        obj3.brand="Viva";
        obj3.price=10300;

        Mobile1.name="New Phone"; //its changes the name for all objects

        obj1.Show();
        obj2.Show();
        obj3.Show();

        Mobile1.show1(obj1);


    }
}

 class Mobile1 {
    String brand; //Instance variable
    int price;
    static String name; //Static variable

     public static void show1(Mobile1 obj) {
         System.out.println("In Static Method");
         System.out.println(obj.brand+":"+obj.price+";"+name);
     }

     public void Show(){
        //Local variable
        System.out.println(brand+":"+price+";"+name);
    }

}