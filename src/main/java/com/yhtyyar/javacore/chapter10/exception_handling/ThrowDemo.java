package main.java.com.yhtyyar.javacore.chapter10.exception_handling;

public class ThrowDemo {

    static void demoProc() {

        try{
            throw new NullPointerException("демонстрация");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода demoProc() .");

            throw e;  // повторная сгенерирования исключения
        }
    }

    public static void main(String [] args) {

        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: " + e);
        }
    }
}
