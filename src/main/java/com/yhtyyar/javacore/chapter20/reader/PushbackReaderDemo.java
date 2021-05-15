package main.java.com.yhtyyar.javacore.chapter20.reader;

import java.io.*;

public class PushbackReaderDemo {

    public static void main(String [] args) {

        String str = "if (a == 4) a = 0;\n";
        char [] buf = new char[str.length()];

        str.getChars(0, str.length(), buf, 0);
        CharArrayReader arrayReader = new CharArrayReader(buf);
        int c;

        try(PushbackReader pushbackReader = new PushbackReader(arrayReader)) {

            while((c = pushbackReader.read()) != -1) {

                switch (c) {

                    case '=':
                        if ((c = pushbackReader.read()) == '=') {
                            System.out.print(".eq");
                        } else {
                            System.out.print("<-");
                            pushbackReader.unread(c);
                        }
                        break;
                    default:
                        System.out.print((char) c);
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
