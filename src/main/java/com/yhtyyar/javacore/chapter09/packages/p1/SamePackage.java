package main.java.com.yhtyyar.javacore.chapter09.packages.p1;

public class SamePackage {

    SamePackage() {

        Protection p = new Protection();
        System.out.println("Конструктор этого же пакета");
        System.out.println("n = " + p.n);

       // System.out.println("n_pri = " + p.n_pri); // n_pri доступен только в классе где он обьявлен

        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
        System.out.println();
    }
}
