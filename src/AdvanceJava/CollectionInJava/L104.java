package AdvanceJava.CollectionInJava;

//Map: key Value pair representation
// Key should be Unique and values maybe repeat

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class L104 {
    public static void main(String[] args) {

        Map<String,Integer> student = new HashMap<String,Integer>();
        student.put("Harsh",3);
        student.put("Rahul",45);
        student.put("Kumkum",54);
        student.put("Navin",67);

//        for(int n : student){
//            System.out.println(student);
//        }

        System.out.println(student); // get key value pairs
        System.out.println(student.get("Kumkum")); // get unique value by specific key

        System.out.println(student.keySet()); // get all key values
        System.out.println(student.values()); // get all values

        for(String key : student.keySet()){
            System.out.println(key + " : " + student.get(key));
        }

        student.remove("Kumkum");
        System.out.println(student);
    }
}
