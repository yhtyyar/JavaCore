package main.java.com.yhtyyar.javacore.chapter09.interfaces;

public interface IntStack {

    void push (int item);
    int pop();


    default void clear () {
        System.out.println("Метод clear() не реализован.");
    }
}
