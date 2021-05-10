package main.java.com.yhtyyar.javacore.chapter10.exception_handling;

public class MultiCatch {

    public static void main(String [] args) {

        int a = 10, b = 0;
        int [] val  = {1, 2, 3};


        try {
           // int result = a / b;

            val [10] = 19;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {

            System.out.println("Исключение перехвачено: " + e);
        }

        System.out.println("После многократного перехвата.");
    }
}
