package CoreJava;

public class L44 {
    public static void main(String[] args) {

        Human2 obj = new Human2();
        obj.setAge(11);
        obj.setName("Chirag");

        System.out.println(obj.getName()+":"+obj.getAge());
    }
}
class Human{
    private int age;
    private String name;


    public int getAge() {
        return age;
    }
    public void setAge(int a){
        age = a;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}