package AdvanceJava.CollectionInJava;
// Comparator and Comparable

//Comparable: It is used to define the natural ordering of the objects within the class.
//Comparator: It is used to define custom sorting logic externally.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class L105A implements Comparable<L105A>{
    //Class Students
    int age;
    String name;

    public L105A(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "L105A{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(L105A that) {
        if(this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }

}
public class L105 {
    public static void main(String[] args) {
        //Implements Comparator
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 10 > o2 % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(39);
        nums.add(97);
        nums.add(34);
        nums.add(22);
        nums.add(25);

        Collections.sort(nums,comparator);
        System.out.println(nums);

        //Implement Comparator form another Class
        Comparator<L105A> comparator1 = new Comparator<L105A>(){
            public int compare(L105A a, L105A b){
                if(a.age > b.age)
                    return 1;
                else
                    return -1;
            }
        };

        // Implement Comparator Using Lambda Function
        Comparator<L105A> com = (a,b) -> a.age > b.age ? 1:-1;

        List<L105A> student = new ArrayList<>();
        student.add(new L105A(12,"Harsh"));
        student.add(new L105A(13,"Rahul"));
        student.add(new L105A(18,"Vansh"));
        student.add(new L105A(14,"Vikas"));

//      System.out.println(student);

        //used when Doing Comparator
        Collections.sort(student,comparator1);
        student.sort(comparator1); // anyone way to implement

        //used when Doing comparable
        Collections.sort(student);

        //For Lambda Expression
        Collections.sort(student,com);

        for(L105A n : student){
            System.out.println(n);
        }

    }
}
