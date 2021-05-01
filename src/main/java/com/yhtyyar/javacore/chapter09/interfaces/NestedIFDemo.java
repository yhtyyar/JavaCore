package main.java.com.yhtyyar.javacore.chapter09.interfaces;

public class NestedIFDemo {

    public static void main(String [] args) {

        A.NestedIF nif = new B();

        if(nif.isNotNegative(10)) {
            System.out.println("число 10 неотрицательное");
        }

        if (nif.isNotNegative(-12)){
            System.out.println("Это не будет выведено");
        }
    }
}
