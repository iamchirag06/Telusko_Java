package CoreJava;

//This KeyWord

public class L45 {
    public static void main(String[] args) {

        Human2 obj1 = new Human2();
        obj1.setAge(18);
        obj1.setName("Chirag");

        System.out.println(obj1.getName()+":"+ obj1.getAge());
    }
}
class Human1 {
    private int age;
    private String name;

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