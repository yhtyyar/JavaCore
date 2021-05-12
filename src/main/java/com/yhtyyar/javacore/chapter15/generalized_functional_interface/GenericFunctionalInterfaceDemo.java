package main.java.com.yhtyyar.javacore.chapter15.generalized_functional_interface;

public class GenericFunctionalInterfaceDemo {

    public static void main(String [] args) {

        SomeFunc<String> reverse = (str) -> {

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


        SomeFunc<Integer> factorial = (n) -> {

            int result = 1;

            for(int i = 1; i <= n; i++) {
                result = i * result;

            }
            return result;
        };

        System.out.println("Факториал числа 4 равен " + factorial.func(4));
        System.out.println("Факториал числа 10 равен " + factorial.func(10));
    }
}
