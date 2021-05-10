package main.java.com.yhtyyar.javacore.chapter10.exception_handling;

public class ThrowsDemo {

    static void throwOne () throws IllegalAccessException{

        System.out.println("в теле метода ThrowOne().");
        throw new IllegalAccessException("демонстрация");
    }

    public static void main(String [] args) {

        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
