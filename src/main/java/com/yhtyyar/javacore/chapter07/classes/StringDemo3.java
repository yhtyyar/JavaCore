package main.java.com.yhtyyar.javacore.chapter07.classes;

public class StringDemo3 {

    public static void main(String [] args) {

        String [] str = { "один", "два", "три", "четыре", "пять" };

        for(int i = 0; i < str.length; i++)
            System.out.println("str[" + i + "]" + str[i]);
    }
}
