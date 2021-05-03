package main.java.com.yhtyyar.javacore.chapter18.map;

import java.util.*;

public class HashMapDemo {

    public static void main(String []  args) {

        HashMap<String, Double> hashMap = new HashMap<>();

        hashMap.put("Джон Доу", new Double(3434.34));
        hashMap.put("Том Смит", new Double(123.33));
        hashMap.put("Джейн Бейкер", new Double(1378.00));
        hashMap.put("Тод Хилл", new Double(99.22));
        hashMap.put("Ральф Смит", new Double(-19.08));

        // получение множество записей
        Set<Map.Entry<String, Double>> set = hashMap.entrySet();

        // выведение множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();


        double balance = hashMap.get("Джон Доу");
        hashMap.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " + hashMap.get("Джон Доу"));
    }
}
