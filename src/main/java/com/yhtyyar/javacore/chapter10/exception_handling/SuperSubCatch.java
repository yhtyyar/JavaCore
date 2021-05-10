package main.java.com.yhtyyar.javacore.chapter10.exception_handling;

public class SuperSubCatch {

    public static void main(String [] args) {

        try{
            int a = 0;
            int b = 42 / a;
        }  catch (Exception e) {
            System.out.println("Перехват исключений общего класса Exception.");
        }
//        catch (ArithmeticException e) {  // ОШИБКА  код недостижим потому что является производным Exception
//            System.out.println("Этот код вообще недостижим");
//
//        }

    }
}
