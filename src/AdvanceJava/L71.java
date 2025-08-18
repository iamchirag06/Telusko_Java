package AdvanceJava;

//Inner Class
public class L71 {
    public static void main(String[] args) {
        L71A obj = new L71A();
        obj.show();

        L71A.L71B obj1 = new L71A.L71B();
        obj1.config();
    }
}
class L71A{ //Outer Class
    int age;
    public void show(){
        System.out.println("in show");
    }

    static class L71B{ //Inner Class
        public void config(){
            System.out.println("in config");
        }
    }
}