package main.java.com.yhtyyar.javacore.chapter18.tree_set;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String [] args) {

        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("D");

        System.out.println(treeSet);

        //выводит элементы от С до F (сам F не выводиться)
        System.out.println(treeSet.subSet("C","F"));
    }
}
