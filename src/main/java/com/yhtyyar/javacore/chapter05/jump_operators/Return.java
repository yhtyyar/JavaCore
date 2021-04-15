package main.java.com.yhtyyar.javacore.chapter05.jump_operators;

public class Return {

    public static void main(String [] args) {

        boolean t = true;

        System.out.println("До возврата.");

        if (t) return;        // возврат в вызывающий код

        System.out.println("Этот оператор выполнятся не будет.");
    }
}
