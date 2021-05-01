package main.java.com.yhtyyar.javacore.chapter09.packages.p2;


import main.java.com.yhtyyar.javacore.chapter09.packages.p1.Protection;

public class OtherPackage {

    OtherPackage() {
        Protection p = new Protection ();
        System.out.println("Конструктор из другого пакета");

        // System.out.println("n = " + p.n);  // n доступен только в пакете где расположен его класс

        // System.out.println("n_pri = " + p.n_pri); //n_pri доступен только в классе где он обьявлен

       // System.out.println("n_pro = " + p.n_pro);  // n_pro доступен только в подклассам своего класса или в пакете где расположен его класс

        System.out.println("n_pub = " + p.n_pub);
        System.out.println();

    }
}
