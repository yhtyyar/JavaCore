package main.java.com.yhtyyar.javacore.chapter20.reader;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;

public class BufferedReaderDemo {

    public static void main(String [] args) {

        String str = "Это знак авторского права &copy; " +
                ", a &copy - нет.\n";

        char [] buf = new char[str.length()];

        str.getChars(0, str.length(), buf, 0);


        CharArrayReader arrayReader = new CharArrayReader(buf);
        int c;
        boolean marked = false;

        try (BufferedReader bufferedReader = new BufferedReader(arrayReader)){

            while((c = bufferedReader.read()) != -1) {

                switch (c) {

                    case '&':
                        if (!marked) {
                            bufferedReader.mark(32);
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
                            bufferedReader.reset();
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
