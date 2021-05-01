package main.java.com.yhtyyar.javacore.chapter18.array_list;

import java.util.ArrayList;

public class ArrayListToArray {

    public static void main(String [] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.println("Содержимое списочного массива arrayList: " + arrayList);

        Integer [] integer = new Integer[arrayList.size()];

        integer = arrayList.toArray(integer);

        int sum = 0;

        for(int i : integer)
            sum += i;

        System.out.println("Сумма: " + sum);
    }
}
