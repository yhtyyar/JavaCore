package main.java.com.yhtyyar.javacore.chapter18.array_list;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String [] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        System.out.println("Начальный размер списочного массива arrayList: " + arrayList.size());
        System.out.println();

        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        arrayList.add(1, "A2");

        System.out.println("Размер списочного массива arrayList после ввода элементов: " + arrayList.size());

        System.out.println("Содержимое списочного массива arrayList: " + arrayList);
        System.out.println();

        arrayList.remove("F");
        arrayList.remove(2);

        System.out.println("Размер списочного массива arrayList после удаления элементов: " + arrayList.size());

        System.out.println("Содержимое списочного массива arrayList: " + arrayList);

    }
}
