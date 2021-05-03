package main.java.com.yhtyyar.javacore.practic.algorithm;

import java.util.*;

public class Logic {


    private static int [] firstArray = new int[7];
    private static int[] secondArray = new int[7];

    private final Scanner input = new Scanner(System.in);


     void inputNumbers() {

        System.out.println("Введите первый набор чисел ");
        for (int i = 0; i < firstArray.length; i++) {
            firstArray [i] = input.nextInt();
        }

         System.out.println();
         System.out.println("Введите второй набор чисел ");
         for (int i = 0; i < secondArray.length; i++) {
             secondArray [i] = input.nextInt();
         }

        System.out.println("Положительные и совподающие числа");
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] > 0) {
                    int first = firstArray[i];
                    if (secondArray[j] > 0) {
                        int second = secondArray[j];
                        if (first == second){
                            System.out.print(first + " ");
                        } else {
                            System.out.print("");
                        }
                    } else if (secondArray[j] <= 0){
                        System.out.print("");
                    }
                } else if (firstArray[i] <= 0) {
                    System.out.print("");
                }
            }
        }
    }
}
