package main.java.com.yhtyyar.javacore.chapter05.cycles_operators;

public class ForTick {

    public static void main(String [] args) {

         int n;

         for(n = 10; n > 0; n--)
             System.out.println("такт " + n);

        System.out.println();
         // тоже самое можно написать

         for (int m = 10; m > 0; m--)
             System.out.println(m + " такт");

    }
}
