package AdvanceJava;
//Abstract Keyword

// we cannot create objects of abstract class...
// we can make object of Concrete class only...

public class L70 {
    public static void main(String[] args) {

        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();

    }
}

abstract class Car{ //ABSTRACT CLASS
    public abstract void drive();
    public abstract void fly();

    public  void playMusic(){
        System.out.println("Play Music");
    }
}
//It is compulsory to make a method in extended of abstract class
class WagonR extends Car{ //Concrete class
    public void drive(){
        System.out.println("Driving..");
    }

    public void fly(){
        System.out.println("Flying...");
    }
}