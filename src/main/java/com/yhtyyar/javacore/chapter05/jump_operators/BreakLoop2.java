package main.java.com.yhtyyar.javacore.chapter05.jump_operators;

public class BreakLoop2 {

    public static void main(String [] args) {

        int i = 0;
        while(i <100) {
            if(i ==10)
                break;
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Цикл завершен.");
    }
}
