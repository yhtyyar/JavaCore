package main.java.com.yhtyyar.javacore.chapter08;

public class Acces {

    public static void main(String [] args) {
        B subOb = new B();

        subOb.setij(10,12);

        subOb.sum();
        System.out.println("Сумма равна " + subOb.total);
    }
}
