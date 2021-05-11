package main.java.com.yhtyyar.javacore.chapter13.read;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        System.out.println("Введите строку текста.");
        System.out.println("Введите 'стоп' для завершения.");

        do{
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("стоп"));
    }
}
