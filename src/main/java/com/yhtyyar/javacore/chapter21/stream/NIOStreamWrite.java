package main.java.com.yhtyyar.javacore.chapter21.stream;

import java.io.*;
import java.nio.file.*;

public class NIOStreamWrite {

    public static void main(String [] args) {

        try (OutputStream fout =
                new BufferedOutputStream(
                        Files.newOutputStream(Paths.get("test.txt")))) {

            for (int i = 0;i < 26; i++) {
                fout.write((byte)('A' + i));
            }

        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
