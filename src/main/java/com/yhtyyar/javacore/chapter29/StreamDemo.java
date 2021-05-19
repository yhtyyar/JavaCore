package main.java.com.yhtyyar.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main (String [] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("Исходный список: " + myList);

        // получение потока элементов из списочного массива
        Stream <Integer> myStream = myList.stream();

        // получение минимального и максимального значения
        Optional <Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent()) {
            System.out.println("Минимальное значение: " + minVal.get());
        }

        //нужно получить новый поток данных, потому что
        // предыдущая операция была окнечной(употребивший поток)
        myStream =myList.stream();
        Optional <Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent()) {
            System.out.println("Максимальное значение: " + maxVal.get());
        }

        // сортировка потока данных
        Stream <Integer> sortedStream = myList.stream().sorted();

        System.out.println("Отсортированный поток данных: ");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();


        Stream <Integer> oddVals = myList.stream()
                                         .sorted()
                                         .filter((n) -> (n % 2) == 1);
        System.out.println("Нечетные значения: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        oddVals = myList.stream().filter( (n) -> (n % 2) == 1)
                                 .filter( (n) -> n > 5);
        System.out.println("Нечетные значения больше чем 5: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();





    }
}
