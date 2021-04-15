package main.java.com.yhtyyar.javacore.chapter05.jump_operators;

public class ContinueLabel {

    public static void main (String [] args) {

        outer: for (int i = 0; i < 10; i++) {
                 for (int j = 0; j < 10; j ++) {
                    if (j > 1) {
                      System.out.println();
                      continue outer;
                }
                System.out.print(" " + (i * j));   // не совсем рабочий код
            }
        }
        System.out.println();
    }
}
