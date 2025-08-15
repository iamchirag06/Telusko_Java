package CoreJava;


//anonymous Object
public class L50 {
    public static void main(String[] args) {
        new A(); //anonymous Object
    }
}
class A{
    public void show(){
        System.out.println("In A Show");
    }
    public A(){
        System.out.println("Object Created");
    }
}