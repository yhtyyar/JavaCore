package main.java.com.yhtyyar.javacore.chapter03;

public class Average {

    public static void main (String [] args) {

        double nums[] = { 10.1, 11.2, 12.3, 13.4, 14.5};
        double result  = 0;

        int i;

        for(i = 0; i < 5; i++)  //цикл будет прибавлять к переменной result до числа 5(на 4 он оставновится)
            result = result + nums[i];
        System.out.println("Среднее значение равно " + result / 5);
    }
}
