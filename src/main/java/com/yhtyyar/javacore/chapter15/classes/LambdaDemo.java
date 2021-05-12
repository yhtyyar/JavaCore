package main.java.com.yhtyyar.javacore.chapter15.classes;

import main.java.com.yhtyyar.javacore.chapter15.interfaces.MyNumber;

public class LambdaDemo {

    public static void main(String [] args) {

        MyNumber myNum;


        myNum = () -> 123.45;

        System.out.println("Фиксированное значение: " + myNum.getValue());

        myNum = () -> Math.random() * 100;

        System.out.println("Случайное значение: " + myNum.getValue());
        System.out.println("Ещё одно случайное значение: " + myNum.getValue());


    }

}
