package main.java.com.yhtyyar.javacore.chapter09.packages.p1;

public class Derived extends Protection{

    Derived () {
        System.out.println("Конструктор подкласса");
        System.out.println("n = " + n);

       // System.out.println("n_pri = " + n_pri);  // n_pri доступен только в классе где он обьявлен

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
        System.out.println();
    }
}
