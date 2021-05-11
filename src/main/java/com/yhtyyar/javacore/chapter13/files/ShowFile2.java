package main.java.com.yhtyyar.javacore.chapter13.files;

import java.io.*;

public class ShowFile2 {

    public static void main(String [] args) {

        int i;

        if(args.length != 1) {
            System.out.println("Использование: ShowFile Test.TXT");
            return;
        }


        try (FileInputStream fin = new FileInputStream(args[0]) ){

            do {
                i = fin.read();
                if(i != -1)
                    System.out.println((char) i);
            } while (i != -1);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
            return;
        }catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }

    }
}
