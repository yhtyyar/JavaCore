package main.java.com.yhtyyar.javacore.chapter20.input_stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

    public static void main(String [] args) {

        int size;

        try (FileInputStream fileInputStream =
                    new FileInputStream("\\FileInputStreamDemo.java")) {

            System.out.println("Общее количество доступных байтов: " + (size = fileInputStream.available()));

            int n = size / 40;
            System.out.println("Первые " + n + " байтов, " +
                    "прочитанных из файла по очереди методом read()");

            for (int i = 0; i < n; i++) {
                System.out.println((char) fileInputStream.read());
            }

            System.out.println("\nВсе еще доступно: " + fileInputStream.available());

            System.out.println("Чтение следующих " + n +
                    " байтов по очереди методом read(b)[]");

            byte [] b = new byte[n];

            if (fileInputStream.read(b) != n){
                System.out.println("Нельзя прочитать " + n + " байтов.");
            }

            System.out.println(new String (b,0,n));
            System.out.println("\nВсе еще доступно: " + (size = fileInputStream.available()));

            System.out.println("пропустить половину оставшихся байтов" +
                    "методом skip()");
            fileInputStream.skip(size / 2);

            System.out.println("Все еще доступно: " + fileInputStream.available());

            System.out.println("Чтение " + n / 2 + " байтов, размещаемых в конце массива");

            if (fileInputStream.read(b,n / 2, n / 2) != n / 2) {
                System.out.println("Нельзя прочитать " + n / 2 + " байтов.");
            }

            System.out.println(new String(b,0,b.length));
            System.out.println("\nВсе еще доступно: " + fileInputStream.available());

        } catch (IOException e) {
            System.out.println("ошибка ввода-вывода: " + e);
        }
    }
}
