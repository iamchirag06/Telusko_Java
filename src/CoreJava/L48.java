package CoreJava;
//Default and parameterized Constructor
public class L48 {
    public static void main(String[] args) {
        Human3 human3 = new Human3();
        System.out.println(human3.getName()+":"+human3.getAge());
//        System.out.println(human4.getName()+":"+human4.getAge());
    }
}
class Human3{
    private int age;
    private String name;

    public Human3(){ //Default Constructor
        age=12;
        name = "JOhn";
    }

    public Human3(String name, int age) { //parameterized Constructor
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}