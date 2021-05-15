package main.java.com.yhtyyar.javacore.chapter21.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {

    public static void main(String [] args) {

        Path filePath = Paths.get("\\test1.txt");

        System.out.println("Имя файла: " + filePath.getName(0));
        System.out.println("Путь к файлу: " + filePath);
        System.out.println("Абсолютный путь к файлу: " + filePath.toAbsolutePath());
        System.out.println("Родительский каталог: " + filePath.getParent());

        if (Files.exists(filePath)) {
            System.out.println("Файл существует");
        } else {
            System.out.println("Файл не существует");
        }

        try {
            if(Files.isHidden(filePath)) {
                System.out.println("Файл скрыт");
            } else {
                System.out.println("Файл не скрыт");
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }

        Files.isWritable(filePath);
        System.out.println("Файл доступен для записи");

        Files.isReadable(filePath);
        System.out.println("Файл доступен для чтения");

        try {
            BasicFileAttributes attributes =
                    Files.readAttributes(filePath, BasicFileAttributes.class);

            if (attributes.isDirectory()) {
                System.out.println("Это каталог");
            } else {
                System.out.println("Это не каталог");
            }

            if (attributes.isRegularFile()) {
                System.out.println("Это обычный файл");
            } else {
                System.out.println("Это не обычный файл");
            }

            if (attributes.isSymbolicLink()) {
                System.out.println("Это символическая ссылка");
            } else {
                System.out.println("Это не символическая ссылка");
            }

            System.out.println("Время последней модификации файла: " + attributes.lastAccessTime());

            System.out.println("Размер файла: " + attributes.size() + " байтов");

        } catch (IOException e) {
            System.out.println("Ошибка чтения атрибутов: " + e);
        }
    }
}
