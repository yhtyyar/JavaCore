package main.java.com.yhtyyar.javacore.chapter18.algorithms;

import java.util.*;

public class AlgorithmsDemo {

    public static void main(String [] args) {

        LinkedList <Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(-8);
        linkedList.add(20);
        linkedList.add(-20);
        linkedList.add(8);

        Comparator <Integer> comporator = Collections.reverseOrder();

        Collections.sort(linkedList, comporator);

        System.out.println("Список отсортирован в обртаном порядке: ");

        for(int i : linkedList) {
            System.out.print(i + " ");
        }
        System.out.println();

        Collections.shuffle(linkedList);

        System.out.print("Список перетасован: ");

        for (int i : linkedList) {
            System.out.print(i + " ");
        }



        System.out.println();
        System.out.println("Минимум: " + Collections.min(linkedList));
        System.out.println("Максимум: " + Collections.max(linkedList));


    }
}
