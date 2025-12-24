package AdvanceJava.AbstractionAndInterfaces;
//Need of Interface

class Developer { // Does not depend on laptop or Desktop : Loose Coupling
    public void devApp(Computer lap) {
        lap.code();
    }
}

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Code, Compile and Run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Code, Compile and Run : Faster");
    }

}
public class L76 {
    public static void main(String[] args) {

        Computer lap = new Laptop(); //interface reference
        Computer desk = new Desktop(); // interface reference
        Developer chirag = new Developer();
        chirag.devApp(desk);
        chirag.devApp(lap);
    }
}
