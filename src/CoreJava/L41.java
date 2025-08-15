package CoreJava;

//Static Variable

//The static keyword ensures that the name variable is shared across all instances of the
//class. Therefore, when the name is changed for one object, it reflects for all objects.

public class L41 {
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
        obj3.brand="Vivo";
        obj3.price=10300;
        Mobile1.name="SmartPhone";

        Mobile1.name="New Phone"; //its changes the name for all objects

        obj1.Show();
        obj2.Show();
        obj3.Show();

    }
}

class Mobile{
    String brand; //Instance variable
    int price;
    static String name; //Static variable

        public void Show(){
            //Local variable
            System.out.println(brand+":"+price+";"+name);
        }

}


