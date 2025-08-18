package AdvanceJava;

// Anonymous Inner Class
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
