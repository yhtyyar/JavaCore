package main.java.com.yhtyyar.javacore.chapter10.exception_handling;

public class ChainExcDemo {

    static void demoProc() {

        //создание исключения
        NullPointerException e = new NullPointerException("верхний уровень");

        //добавление причины исключения
        e.initCause(new ArithmeticException("Причина"));
        throw e;
    }

    public static  void main(String [] args) {

        try{
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("Перехвачено исключение: " + e);

            System.out.println("Первопричина: " + e.getCause());
        }
    }
}
