package main.java.com.yhtyyar.javacore.chapter15.classes;

import main.java.com.yhtyyar.javacore.chapter15.interfaces.StringFunc;

public class BlockLambdaDemo2 {

    public static void main(String [] args) {

        StringFunc reverse = (str) -> {

            String result = "";
            int i;

            //изменился порядок следолвания символов в строке(наоборот)
            for (i = str.length() -1; i >= 0; i--) {

                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Лямбда обращается на " + reverse.func("Лямбда"));
        System.out.println("Выражение обращается на" + reverse.func("Выражение"));
    }
}
