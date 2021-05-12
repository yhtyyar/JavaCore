package main.java.com.yhtyyar.javacore.chapter15.links_on_methods;

import main.java.com.yhtyyar.javacore.chapter15.interfaces.StringFunc;

public class MethodRefDemo2 {

    static String stringOp(StringFunc sf, String str) {

        return sf.func(str);
    }

    public static void main(String [] args) {

        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        MyStringOps strOps = new MyStringOps();

        outStr = stringOp(strOps :: strReverse2, inStr);

        System.out.println("Исходная строка: " + inStr);
        System.out.println("Обращенная строка: " + outStr);
    }
}
