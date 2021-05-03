package main.java.com.yhtyyar.javacore.chapter18.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String [] args) {

        TreeMap <String, Double> treeMap = new TreeMap<>();

        treeMap.put("Джон Доу", new Double(3434.34));
        treeMap.put("Том Смит", new Double(123.33));
        treeMap.put("Джейн Бейкер", new Double(1378.00));
        treeMap.put("Тод Хилл", new Double(99.22));
        treeMap.put("Ральф Смит", new Double(-19.08));

        // получение множество записей
        Set<Map.Entry<String, Double>> set = treeMap.entrySet();

        // выведение множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();


        double balance = treeMap.get("Джон Доу");
        treeMap.put("Джон Доу", balance + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " + treeMap.get("Джон Доу"));
    }
}
