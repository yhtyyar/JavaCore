package main.java.com.yhtyyar.javacore.chapter20.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

    public static void main(String [] args) {

        // читается всё содержимое из файла text.txt
        try(FileReader fileReader = new FileReader("test.txt")) {

            int c;

            while((c = fileReader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
