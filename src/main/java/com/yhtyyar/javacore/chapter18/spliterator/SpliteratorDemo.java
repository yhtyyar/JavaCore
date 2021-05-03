package main.java.com.yhtyyar.javacore.chapter18.spliterator;

import java.util.*;


public class SpliteratorDemo {

    public static void main(String [] args) {

        ArrayList<Double> arrayList = new ArrayList<>();

        arrayList.add(1.0);
        arrayList.add(2.0);
        arrayList.add(3.0);
        arrayList.add(4.0);
        arrayList.add(5.0);

        System.out.print("Содержимое списочного массива arrayList: \n");

        Spliterator<Double> spliterator = arrayList.spliterator();
        while(spliterator.tryAdvance((n) -> System.out.println(n)));
        System.out.println();


        spliterator = arrayList.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while(spliterator.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        System.out.print("Содержимое списочного масства sqrs: \n");
        spliterator = sqrs.spliterator();
        spliterator.forEachRemaining((n) -> System.out.println(n));
        System.out.println();

    }
}
