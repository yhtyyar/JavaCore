package main.java.com.yhtyyar.javacore.chapter07.access_modifiers;

public class Length {

    public static void main(String [] args) {

        int [] a1 = new int[10];
        int [] a2 = {3, 5, 7, 1, 8, 99, 44, -10};
        int [] a3 = {4, 3, 2, 1};

        System.out.println("длина а1 равна " + a1.length);
        System.out.println("длина а2 равна " + a2.length);
        System.out.println("длина а3 равна " + a3.length);
    }
}
