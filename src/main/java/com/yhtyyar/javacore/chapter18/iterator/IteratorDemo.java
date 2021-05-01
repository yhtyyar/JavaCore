package main.java.com.yhtyyar.javacore.chapter18.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

    public static void main(String [] args) {

        ArrayList<String> arrayList =  new ArrayList<>();

        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");

        System.out.print("Исходное содержимое списочного массива arrayList: ");

        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        ListIterator<String> listIterator = arrayList.listIterator();
        while ((listIterator.hasNext())) {
            String element = listIterator.next();
            listIterator.set(element + "+");
        }

        System.out.print("Измененное содержимое списочного массива arrayList: ");
        iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.print("Измененный в обратном порядке список: ");
        while(listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
