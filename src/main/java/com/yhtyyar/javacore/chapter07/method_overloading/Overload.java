package main.java.com.yhtyyar.javacore.chapter07.method_overloading;

public class Overload {

    public static void main(String [] main) {

/*
        OverloadDemo od = new OverloadDemo();
        double result;

        od.test();
        od.test(10);
        od.test(10,20);
        result = od.test(123.25);
        System.out.println("Результат вызова od.test(123.25): " + result);


 */


        OverloadDemo od = new OverloadDemo();
        int i = 88;

        od.test();
        od.test(10,20);

        od.test(i);            //  в этом случае вызывается вариант метода test(double)
        od.test(123.2);    //  в этом случае тоже вызывается вариант метода test(double)
                               // Происходит автоматическое преобразвание типа
    }


}
