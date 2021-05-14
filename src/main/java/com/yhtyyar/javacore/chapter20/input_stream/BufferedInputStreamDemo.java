package main.java.com.yhtyyar.javacore.chapter20.input_stream;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {

    public static void main(String [] args) {

        String str = "Это знак авторского права &copy; " +
                       ", a &copy - нет.\n";

        byte [] buf = str.getBytes();

        ByteArrayInputStream inputStream = new ByteArrayInputStream(buf);

        int c;
        boolean marked = false;

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)){

            while((c = bufferedInputStream.read()) != -1) {

                switch (c) {

                    case '&':
                        if (!marked) {
                            bufferedInputStream.mark(32);
                            marked = true;
                        } else {
                            marked = false;
                        }
                        break;

                    case ';':
                        if (marked) {
                            marked = false;
                            System.out.print("(c)");
                        } else {
                            System.out.print((char) c);
                        }
                        break;

                    case ' ':
                        if (marked) {
                            marked = false;
                            bufferedInputStream.reset();
                            System.out.print("&");
                        } else {
                            System.out.print((char) c);
                        }
                        break;
                    default:
                        if (!marked) {
                            System.out.print((char) c);
                        }
                        break;
                }

            }

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
