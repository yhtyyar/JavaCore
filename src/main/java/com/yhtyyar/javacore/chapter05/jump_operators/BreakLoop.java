package main.java.com.yhtyyar.javacore.chapter05.jump_operators;

public class BreakLoop {

    public static void main(String [] args) {

        for(int i = 0; i < 100; i++) {
            if(i == 30)
                break;
            System.out.println("i: " + i);
        }
        System.out.println("Цикл завершен.");
    }
}
