package main.java.com.yhtyyar.javacore.chapter18.iterator;

import java.util.ArrayList;

public class ForEachDemo {

    public static void main(String [] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.print("Исходное содержимое списочного массива arrayList: ");
        for( int al : arrayList)
            System.out.print(al + " ");

        System.out.println();

        int sum = 0;
        for(int al : arrayList)
            sum += al;

        System.out.println("Сумма численных значений: " + sum);
    }
}
