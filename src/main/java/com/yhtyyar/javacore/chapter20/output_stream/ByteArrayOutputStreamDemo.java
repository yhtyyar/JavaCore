package main.java.com.yhtyyar.javacore.chapter20.output_stream;


import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {

    public static void main(String [] args) {

        ByteArrayOutputStream byteArrayOutput = new ByteArrayOutputStream();

        String str = "Эти данные должны быть выведены в массив";
        byte [] buf = str.getBytes();

        try {
            byteArrayOutput.write(buf);
        } catch (IOException e) {
            System.out.println("Ошибка записи в буфер");
            return;
        }

        System.out.println("Буфер в виде символьной строки");
        System.out.println(byteArrayOutput.toString());
        System.out.println("В массив");
        byte [] b = byteArrayOutput.toByteArray();

        for (int i = 0; i < b.length; i++) {
            System.out.print((char) b[i]);
        }

        System.out.println("\nВ поток вывода типа OutputStream() ");

        try (FileOutputStream fileOutputStream = new FileOutputStream("test.txt")){

            byteArrayOutput.writeTo(fileOutputStream);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
            return;
        }

        System.out.println("Установка в исходное состояние");
        byteArrayOutput.reset();

        for (int i = 0; i < 3; i++ ) {
            byteArrayOutput.write('X');
        }

        System.out.println(byteArrayOutput.toString());
    }
}
