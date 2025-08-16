package CoreJava;

//Polymorphism Polymorphism Means
//poly: many
//morphism: behaviour

//Two Types:
//1. Compile Time : Behaviour at Compile Time
//method Overloading

//2. Run Time: Behaviour at Run Time
//method Overriding

public class L60 {
    public static void main(String[] args) {
        L60a obj = new L60a();
        obj.show();

        obj = new L60b();
        obj.show();

        obj = new L60c();
        obj.show();
    }
}

//Dynamic Method DisPatch
// Works only when class Extends Parents Class
class L60a{
    public void show(){
        System.out.println("in A Show");
    }
}
class L60b extends L60a{
    public void show(){
        System.out.println("in B Show");
    }
}
class L60c extends L60a{
    public void show(){
        System.out.println("in C Show");
    }
}
