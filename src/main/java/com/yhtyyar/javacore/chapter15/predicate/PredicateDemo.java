package main.java.com.yhtyyar.javacore.chapter15.predicate;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicateDemo {

    public static void main(String [] args) {

        Predicate <String> predicateStr1 = s -> s.length() < 2;
        Predicate <String> predicateStr2 = String::isEmpty;
        Predicate <Integer> predicateInt = i -> i >= 9;

        System.out.println(predicateStr1.test("java"));
        System.out.println(predicateStr2.test("  "));
        System.out.println(predicateInt.test(16));
        System.out.println();



        String [] arrayStr = { "as", "a", "the", " ", "d", "on", "and", "" };

        System.out.println(Arrays.stream(arrayStr)
                          .filter(s -> s.length() > 2)
                          .collect(Collectors.toList()));
        System.out.println();


        System.out.println(Arrays.stream(arrayStr).anyMatch(String::isEmpty));
        System.out.println();

        //Возвращает истину, если все объекты потока удовлетворяют условию
        int [] arrayInt = {1, 3, 5, 9, 17, 33, 65 };
        System.out.println(Arrays.stream(arrayInt).allMatch( i -> i >=1 ));
        System.out.println();

        //Возвращает строку которая соотвествует обеим условиям
        System.out.println(Arrays.stream(arrayStr)
                          .filter(((Predicate<String>) s -> s.contains("a")).and( s -> s.contains("n")))
                          .collect(Collectors.toList()));
        System.out.println();


        // Выводит числа которые меньше чем 4 или больше чем 32
        System.out.println(Arrays.stream(arrayInt)
                          .filter(((IntPredicate) i -> i > 32).or( i -> i <4))
                          .boxed()
                          .collect(Collectors.toList()));
        System.out.println();


        // Выводит все строки кроме содержащих 'and'
        System.out.println(Arrays.stream(arrayStr)
                          .filter(((Predicate<String>) s -> s.contains("and")).negate())
                          .collect(Collectors.toList()));
        System.out.println();


        // Выполняется поиск точного совпадения
        System.out.println(Arrays.stream(arrayStr)
                          .filter(Predicate.isEqual("and"))
                          .collect(Collectors.toList()));
        System.out.println();


        BiPredicate<String, Integer> biPredicate = (s, max) -> s.length() <= max;
        System.out.println(biPredicate.test("java",8));



    }
}
