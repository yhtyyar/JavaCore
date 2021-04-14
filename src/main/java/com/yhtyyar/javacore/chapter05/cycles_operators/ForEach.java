package main.java.com.yhtyyar.javacore.chapter05.cycles_operators;

public class ForEach {

    public static void main(String [] args) {

        int [] nums  = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        for (int x:nums) {
            System.out.println("Значение равно: " + x);
            sum +=x;
        }

        System.out.println("Сумма равно: " + sum);
    }
}
