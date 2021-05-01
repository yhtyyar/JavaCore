package main.java.com.yhtyyar.javacore.chapter18.hash_set;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String [] args) {

        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("Бета");
        hashSet.add("Альфа");
        hashSet.add("Эта");
        hashSet.add("Гамма");
        hashSet.add("Эпсилон");
        hashSet.add("Омега");

        System.out.println(hashSet);
    }
}
