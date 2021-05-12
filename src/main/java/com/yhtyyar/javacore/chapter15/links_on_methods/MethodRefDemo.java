package main.java.com.yhtyyar.javacore.chapter15.links_on_methods;

import main.java.com.yhtyyar.javacore.chapter15.interfaces.StringFunc;

public class MethodRefDemo {

    static String stringOp(StringFunc sf, String str) {

        return sf.func(str);
    }

    public static void main(String [] args) {

        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        outStr = stringOp(MyStringOps :: strReverse, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
