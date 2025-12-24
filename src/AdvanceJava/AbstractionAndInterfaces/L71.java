package AdvanceJava.AbstractionAndInterfaces;

//Inner Class Concept

public class L71 {
    public static void main(String[] args) {
        L71A obj = new L71A();
        obj.show();

        L71A.L71B obj1 = new L71A.L71B(); // Inner class obj1 is access with Outer class obj as obj.obj1
        obj1.config();
    }
}

// by default Class having non-static methods,
// so we have to declare the inner class as Static to access it directly with the help of Outer Class
// we cannot make the Outer Class as Static...

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