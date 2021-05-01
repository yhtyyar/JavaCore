package main.java.com.yhtyyar.javacore.chapter09.packages.p2;

import main.java.com.yhtyyar.javacore.chapter09.packages.p1.Protection;

public class Protection2 extends Protection {

    Protection2() {

        System.out.println("Конструктор, унаследованный из другого пакета");

       // System.out.println("n = " + n);  // n доступен только в пакете где расположен его класс

       // System.out.println("n_pri = " + n_pri); //n_pri доступен только в классе где он обьявлен

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
        System.out.println();

    }
}
