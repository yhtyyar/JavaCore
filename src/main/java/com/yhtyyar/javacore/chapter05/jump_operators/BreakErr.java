package main.java.com.yhtyyar.javacore.chapter05.jump_operators;

public class BreakErr {

    public static void main(String [] args) {

        one: for (int i = 0; i < 3; i++) {
            System.out.println("Проход " + i + ": ");
        }
        for (int j = 0; j < 100; j++) {
            if (j ==10)
              //  break one; // это блок кода выводить ошибку
            System.out.println(j + " ");
        }
    }
}
