package main.java.com.yhtyyar.javacore.chapter18.comparator;

import java.util.TreeSet;

public class CompDemo {

    public static void main(String [] args) {

        TreeSet<String> treeSet = new TreeSet<>(new MyComp());

        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("D");

        for(String element : treeSet)
            System.out.print(element + " ");
        System.out.println();
    }
}
