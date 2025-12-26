package AdvanceJava.Java8Features;
//Constructor Reference


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class L113A{
    //Student Class

    private String name;
    private int age;

    public L113A(){

    }
    public L113A(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "L113A{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class L113 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Navin","Harsh","John");

        //Normal Way
        List<L113A> student = new ArrayList<>();

        for(String name : names){
            student.add(new L113A(name));
        }
        System.out.println(student);

        //Using Stream : Lambda Expression
        student = names.stream()
                .map(name-> new L113A(name))
                .toList();

        System.out.println(student);


        //Using Method reference
        // (class name ::new)
        student = names.stream()
                .map(L113A::new)
                .toList();

        System.out.println(student);



    }
}
