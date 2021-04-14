package main.java.com.yhtyyar.javacore.chapter05.cycles_operators;

public class ForEach2 {

    public static void main(String [] args) {

        int sum = 0;
        int [] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : nums) {
            System.out.println(" значение равно: " + x);
            sum +=x;
            if (x == 5) break;   // прерывает цикл после получения 5 значений с массива
        }
        System.out.println(" Сумма пяти первых элементов равна: " + sum);
    }
}
