package main.java.com.yhtyyar.javacore.chapter05.cycles_operators;

public class NoBody {

    public static void main (String [] args) {

        int i, j;

        i = 100;
        j = 200;

        while (++i < --j);  // цикл без тело

        System.out.println("Среднее значение равно " + i);
    }
}
