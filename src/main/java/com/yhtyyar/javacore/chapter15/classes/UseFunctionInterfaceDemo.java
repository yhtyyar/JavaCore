package main.java.com.yhtyyar.javacore.chapter15.classes;

import java.util.function.Function;

public class UseFunctionInterfaceDemo {

    public static void main(String [] args) {

        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("Факториал числа 3 равен " + factorial.apply(3));
        System.out.println("Факториал числа 5 равен " + factorial.apply(5));
    }
}
