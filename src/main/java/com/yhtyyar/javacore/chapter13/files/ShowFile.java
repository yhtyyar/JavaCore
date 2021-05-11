package main.java.com.yhtyyar.javacore.chapter13.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {

    public static void main(String [] args) {

        int i;
        FileInputStream fin = null;

        if(args.length != 1) {
            System.out.println("Использование: ShowFile Test.TXT");
            return;
        }


        try {
            fin = new FileInputStream(args[0]);
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
        } finally {
            //закрыть файл в любом случае
            try {
                if(fin != null)
                    fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }



    }
}
