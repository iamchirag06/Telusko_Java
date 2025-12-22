package AdvanceJava;

// Anonymous Inner Class
// It is the declared at the time of object creation... within the object of Main Class
// to provide different implementation of Obj

// In this, no class name is needed to declared...separately
class L72A{

    public void show(){
        System.out.println("in A Show");
    }
}

public class L72 {

    public static void main(String[] args) {

        L72A obj = new L72A(){
            //anonymous Inner Class
            public void show(){
                System.out.println("in new Show");
            }
        };
        obj.show();
    }
}
