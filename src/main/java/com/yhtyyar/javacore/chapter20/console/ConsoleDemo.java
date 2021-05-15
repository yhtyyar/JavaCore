package main.java.com.yhtyyar.javacore.chapter20.console;

import java.io.Console;

public class ConsoleDemo {

    public static void main(String [] args) {

        String str;
        Console con;

        con = System.console();

        if( con == null) {
            return;
        }

        str = con.readLine("Введите строку: ");
        con.printf("Выведенная вами строка: %s\n", str);
    }
}
