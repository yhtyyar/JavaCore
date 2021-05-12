package main.java.com.yhtyyar.javacore.chapter15.classes;

import main.java.com.yhtyyar.javacore.chapter15.interfaces.NumericFunc;

public class BlockLambdaDemo {

    public static void main(String [] args) {

        NumericFunc factorial = (n) -> {

            int result = 1;

            for(int i = 1; i <= n; i++) {
                result = i * result;

            }
            return result;
        };

        System.out.println("Факториал числа 3 равен " + factorial.func(3));
        System.out.println("Факториал числа 5 равен " + factorial.func(5));
    }
}
