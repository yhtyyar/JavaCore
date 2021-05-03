package main.java.com.yhtyyar.javacore.chapter18.comparator;

import java.util.TreeSet;

public class CompDemo2 {

    public static void main(String [] args) {

        TreeSet<String> treeSet = new TreeSet<String>(
                (aStr,bStr) -> bStr.compareTo(aStr));

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
