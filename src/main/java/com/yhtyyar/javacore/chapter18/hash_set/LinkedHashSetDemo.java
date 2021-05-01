package main.java.com.yhtyyar.javacore.chapter18.hash_set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String [] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        linkedHashSet.add("Бета");
        linkedHashSet.add("Альфа");
        linkedHashSet.add("Эта");
        linkedHashSet.add("Гамма");
        linkedHashSet.add("Эпсилон");
        linkedHashSet.add("Омега");

        System.out.println(linkedHashSet);
    }
}
