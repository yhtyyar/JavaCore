package main.java.com.yhtyyar.javacore.chapter20.writer;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {

    public static void main(String [] args) {

        CharArrayWriter charArrayWriter = new CharArrayWriter();
        String str = "Эти данные должны быть выведены в массив";
        char [] buf = new char [str.length()];

        str.getChars(0, str.length(), buf,0);

        try {
            charArrayWriter.write(buf);
        } catch (IOException e) {
            System.out.println("Ошибка записи в буфер");
            return;
        }

        System.out.println("Буфер в виде символьной строки");
        System.out.println(charArrayWriter.toString());
        System.out.println("В массив");
        char [] c = charArrayWriter.toCharArray();

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }

        System.out.println("\nВ поток вывода типа FileWriter() ");

        try (FileWriter fileWriter = new FileWriter("test.txt")){

            charArrayWriter.writeTo(fileWriter);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
            return;
        }

        System.out.println("Установка в исходное состояние");
        charArrayWriter.reset();

        for (int i = 0; i < 3; i++ ) {
            charArrayWriter.write('X');
        }

        System.out.println(charArrayWriter.toString());
    }
}
