package main.java.com.yhtyyar.javacore.chapter15.consumer;

import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String [] args) {


        String str = "as a - the - d - on and";
        String regex = "-";

        // преобразование строки на основе разделителя в массив строк
        Consumer<String> consumer = s ->
                System.out.println(Arrays.toString(s.split(regex)));
        consumer.accept(str);
        System.out.println();



        String regex2 = "\\s";
        // Результат после изменения разделителя
        Consumer<String> consumer2 = s ->
                System.out.println(Arrays.toString(s.split(regex2)));
        consumer2.accept(str);
        System.out.println();



        String regex3 = "a";

        Consumer<String> consumer3 = consumer2.andThen( s ->
                System.out.println(Arrays.toString(s.split(regex3))));
        consumer3.accept(str);


    }
}
