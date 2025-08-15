package CoreJava;

//Constructor

class Human2 {
    private int age;
    private String name;

    public Human2(){  //Constructor
        age = 12;
        name = "John";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class L47 {
    public static void main(String[] args) {
        Human2 obj2 = new Human2();

        System.out.println(obj2.getName()+":"+ obj2.getAge());

        obj2.setAge(18);
        obj2.setName("Chirag");


    }
}
