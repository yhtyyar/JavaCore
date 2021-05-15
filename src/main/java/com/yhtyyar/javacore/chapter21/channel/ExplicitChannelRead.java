package main.java.com.yhtyyar.javacore.chapter21.channel;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitChannelRead {

    public static void main(String [] args) {

        int count;

        //получаем канал к этому файлу
        try (SeekableByteChannel fChan =
                     Files.newByteChannel(Paths.get("test.txt"))) {

            // выделение памяти под буфер
            ByteBuffer mBuf = ByteBuffer.allocate(128);

            do { //чтение данных из файла в буфер
                count = fChan.read(mBuf);

                //прекращение чтения по жостижению конца файла
                if (count != -1) {

                    mBuf.rewind();

                    for (int i = 0; i < count; i++) {
                        System.out.print((char) mBuf.get());
                    }
                }
            } while (count != -1 );
            System.out.println();

        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
