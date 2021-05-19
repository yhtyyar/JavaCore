package main.java.com.yhtyyar.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {

    public static void main (String [] args) {

        ArrayList<String> myList = new ArrayList<>();

        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");

        Stream<String> myStream = myList.stream();

        Spliterator <String> spliterator1 = myStream.spliterator();

        Spliterator<String> spliterator2 = spliterator1.trySplit();

        if (spliterator2 != null) {
            System.out.println("Результат, выводимый итератором spliterator2:");
            spliterator2.forEachRemaining((n) -> System.out.println(n));
        }

        System.out.println("\nРезультат, выводимый итератором spliterator1:");
        spliterator1.forEachRemaining((n) -> System.out.println(n));
    }
}
