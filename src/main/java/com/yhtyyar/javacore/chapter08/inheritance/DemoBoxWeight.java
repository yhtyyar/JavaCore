package main.java.com.yhtyyar.javacore.chapter08.inheritance;

import main.java.com.yhtyyar.javacore.chapter08.inheritance.BoxWeight;

public class DemoBoxWeight {

    public static void main(String [] args) {

        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.5);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.5);

        System.out.println("Объем mybox1 равен " + mybox1.volume());
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        System.out.println("Объем mybox2 равен " + mybox2.volume());
        System.out.println("Вес mybox2 равен " + mybox2.weight);
    }
}
