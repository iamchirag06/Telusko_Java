package CoreJava;

public class L55 {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
//super Class
// Means: Call thr Constructor of a Super Class

class Aa {
    public Aa(){
        super();
        System.out.println("In A");
    }

    public Aa(int n){
        super();
        System.out.println("In int A");
    }
}

//Sub Class
class B extends Aa{
    public B(){
        super();
        System.out.println("In B");
    }

    public B(int n){
        this();
        System.out.println("In int B");
    }
}
