package main.java.com.yhtyyar.javacore.chapter07.overloading_constructors;

public class CallByValue {

    public static void main(String [] args) {

        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("a и b до вызова: " + a + " " + b);

        ob.meth(a,b);

        System.out.println("a и b после вызова: " + a + " " + b);
    }
}
