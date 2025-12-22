package AdvanceJava;

//class - class -> extends
//class - interface -> implements
//interface - interface -> extends

interface L75A {
    void show();
    void config();
}
interface L75X{
    void run();
}
interface L75Y extends  L75X{

}

// one class can implements multiple interfaces
// but in abstract class, we do not do this
class L75B implements L75A,L75Y {
    public void config() {
        System.out.println("in Config");
    }
    public void show() {
        System.out.println("in Show");
    }
    public void run(){
        System.out.println("Running...");
    }
}
public class L75 {
    public static void main(String[] args) {
        L75A obj;
        obj = new L75B();
        obj.config();
        obj.show();

        L75X obj1 = new L75B();
        obj1.run();

    }
}