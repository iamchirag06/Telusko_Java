package AdvanceJava.CollectionInJava;

//Set : No Duplicate values
// Most common Set implementation is Hashset
// But for sorted elements , we use TreeSet

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class L103 {
    public static void main(String[] args) {

        //TreeSet Implementation
        Set<Integer> set = new TreeSet<Integer>();
        set.add(45);
        set.add(80);
        set.add(34);
        set.add(33);
        set.add(87);

        System.out.println("Sorted Values Using TreeSet:");
        System.out.println(set);

        //HashSet Implementation
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(64);
        set1.add(82);
        set1.add(47);
        set1.add(29);
        System.out.println("Random Values Using HashSet:");
        System.out.println(set1);
    }
}
