package main.java.com.yhtyyar.javacore.chapter15.function;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class FunctionDemo {

    public static void main(String [] args) {

        Function <String, Integer> fun1 = s -> s.length();  // String to Integer

        Function <Integer, String> fun2 = i -> Integer.toBinaryString(i); // Integer to String


        String [] arrayStr = { "as", "a", "the", "d", "on", "and", };

        int [] arrayInt = {1, 3, 5, 9, 17, 33, 65 };


        // выводит длину строки
        System.out.println(Arrays.stream(arrayStr)
                          .map(s -> s.length())
                          .collect(Collectors.toList()));
        System.out.println();



        // Сначала цифру переводят в двоичный код и потом
        // опредлеляется длина этого двоичного кода и выводится
        System.out.println(Arrays.stream(arrayInt)
                          .boxed()
                          .map(fun1.compose(i -> Integer.toBinaryString(i)))
                          .collect(Collectors.toList()));
        System.out.println();



        //в первую очередь вызывается функция fun1 а потом  fun2
        System.out.println(fun1.andThen(fun2).apply("Java"));
        System.out.println();



        //та же работа, что и сверху но уже с массивом строк
        System.out.println(Arrays.stream(arrayStr)
                          .map(fun1.andThen(fun2))
                          .collect(Collectors.toList()));
        System.out.println();



        //тот же код, что и сверху но уже без использования ссылок
        System.out.println(Arrays.stream(arrayStr)
                .map(((Function <String, Integer>) s -> s.length())
                        .andThen(i -> Integer.toBinaryString(i)))
                .collect(Collectors.toList()));
        System.out.println();



        UnaryOperator<Integer> operator = i -> ++i;
        System.out.println(operator.apply(1));
        System.out.println();



        BiFunction<Double, String, Integer> biFunction = (d,s) -> (Double.toString(d) + s).length();
        int length = biFunction.apply(1.23, "Java");
        System.out.println(length);



        BinaryOperator<String> binaryOperator = (s1,s2) -> s1 + s2.toUpperCase();
        System.out.println(binaryOperator.apply("oracle", "java"));

    }
}
