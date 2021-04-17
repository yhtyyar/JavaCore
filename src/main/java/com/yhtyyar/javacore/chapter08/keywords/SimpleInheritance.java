package main.java.com.yhtyyar.javacore.chapter08.keywords;

import main.java.com.yhtyyar.javacore.chapter08.keywords.A;
import main.java.com.yhtyyar.javacore.chapter08.keywords.B;

public class SimpleInheritance {

    public static void main(String [] args) {

        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
      //  superOb.j = 20;
        System.out.println("Содержимое объекта superOb: ");
        superOb.show();
        System.out.println();

        subOb.i = 7;
     //   subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое объекта subOb: ");
        subOb.show();
        subOb.showk();

        System.out.println();
        System.out.println("Сумма i, j, k в объекте subOb: ");
        subOb.sum();

    }
}
