package main.java.com.yhtyyar.javacore.chapter21.path;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class MyFileVisitor extends SimpleFileVisitor<Path> {

    public FileVisitResult visitResult (Path path,
                                        BasicFileAttributes attributes) throws IOException {

        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

class DirTreeList {
    public static void main(String [] args) {

        String dirName = "\\JavaCore";

        System.out.println("Дерево каталогов, начиная с каталога " + dirName + ":\n");

        try {
            Files.walkFileTree(Paths.get(dirName), new MyFileVisitor());

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
