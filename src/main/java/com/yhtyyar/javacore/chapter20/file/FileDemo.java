package main.java.com.yhtyyar.javacore.chapter20.file;

import java.io.File;

public class FileDemo {

    static void p (String s) {
        System.out.println(s);
    }

    public static void main(String [] args) {

        File file = new File("main/java/com/yhtyyar/javacore/chapter20/file/File.text");
        p("Имя файла: " + file.getName());
        p("Путь: " + file.getPath());
        p("Абсолютный путь: " + file.getAbsolutePath());
        p("Родительский каталог: " + file.getParent());
        p(file.exists() ? "существует" : "не существует");
        p(file.canWrite() ? "доступен для записи" : "не доступен для записи");
        p(file.canRead() ? "доступен для чтения" : "не доступен для чтения");
        p(file.isDirectory() ? "является каталогом" : "не является каталогом");
        p(file.isFile() ? "является обычным файлом" : "может быть именованным каналом");
        p(file.isAbsolute() ? "является абсолютным" : "не является абсолютным");
        p("Последнее изменение в файле: " + file.lastModified());
        p("Размер: " + file.length() + " байт" );
    }

}
