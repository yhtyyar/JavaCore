package main.java.com.yhtyyar.javacore.chapter05.cycles_operators;

public class NoChange {

    public static void main(String [] args) {

        int nums [] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int x : nums) {
            System.out.print(x + " ");
            x = x * 10; // этот оператор не оказывает никакого влияния на массив nums
        }

        System.out.println();

        for (int x: nums)
            System.out.print( x + " ");
        System.out.println();
    }
}
