package AdvanceJava.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class L110 {
    public static void main(String[] args) {

        int size= 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random random = new Random();

        for(int i = 1;i<=size;i++){
            nums.add(random.nextInt(100));
        }

//        int sum1 = nums.stream()
//                .map(i->i*2)
//                .reduce(0,(c,e)->c+e);

        long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
                .map(i->
                {
                    try{
                        Thread.sleep(1);
                    }catch (Exception e){
                    }
                    return  i*2;
                })
                .mapToInt(i->i)
                .sum();
        long endSeq = System.currentTimeMillis();

        long startParallel = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                .map(i->
                {
                    try{
                        Thread.sleep(1);
                    }catch (Exception e){
                    }
                  return  i*2;
                })
                .mapToInt(i->i)
                .sum();
        long endParallel = System.currentTimeMillis();




        System.out.println(sum2 + " "+ sum3);
        System.out.println("Serial : " + (endSeq - startSeq) );
        System.out.println("Parallel : "+(endParallel -startParallel));
    }
}
