package main.java.com.yhtyyar.javacore.chapter21.path;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {

    public static void main(String [] args) {

        String dirName = "\\main";

        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {

            @Override
            public boolean accept(Path fileName) throws IOException {
                if (Files.isWritable(fileName)) {
                    return true;
                }
                return false;
            }
        };

        try(DirectoryStream<Path> dirStrm =
                    Files.newDirectoryStream(Paths.get(dirName),how)) {

            System.out.println("Каталог " + dirName);

            for(Path entry : dirStrm) {

                BasicFileAttributes attributes =
                        Files.readAttributes(entry, BasicFileAttributes.class);

                if(attributes.isDirectory()) {
                    System.out.print("<DIR> ");
                } else {
                    System.out.println("    ");
                }

                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (NotDirectoryException e) {
            System.out.println(dirName + " не является каталогом.");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода" + e);
        }
    }
}
