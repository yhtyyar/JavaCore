package main.java.com.yhtyyar.javacore.chapter13.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile2 {

    public static void main(String [] args) throws IOException {


        int i ;

        if(args.length != 2) {
            System.out.println("Использование: CopyFile First.TXT  Second.TXT");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1])){

            do {
                i = fin.read();
                if(i != -1)
                    fout.write(i);
            } while(i != -1);

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

    }
}
