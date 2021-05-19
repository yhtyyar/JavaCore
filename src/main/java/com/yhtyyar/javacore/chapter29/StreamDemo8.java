package main.java.com.yhtyyar.javacore.chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemo8 {

    public static void main(String [] args) {

        ArrayList<String> myList = new ArrayList<>();

        myList.add("Альфа");
        myList.add("Бета");
        myList.add("Гамма");
        myList.add("Дельта");
        myList.add("Кси");
        myList.add("Омега");

        Stream<String> myStream = myList.stream();

        Iterator<String> iterator = myStream.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
