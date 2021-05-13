package main.java.com.yhtyyar.javacore.chapter20.file;

import java.io.File;

public class DirList {

    public static void main(String [] args) {

        String dirName = "/file";

        File file = new File (dirName);

        if(file.isDirectory()) {
            System.out.println("Каталог " + dirName);
            String [] str = file.list();


            for (int i = 0; i < str.length; i++) {

                File f = new File(dirName + "/" + str[i]);

                if(f.isDirectory()) {
                    System.out.println(str[i] + " является каталогом");
                } else {
                    System.out.println(str[i] + " является файлом");
                }
            }
        } else {
            System.out.println(dirName + " не является каталогом");
        }
    }
}
