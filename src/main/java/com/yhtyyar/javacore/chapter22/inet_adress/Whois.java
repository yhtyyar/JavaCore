package main.java.com.yhtyyar.javacore.chapter22.inet_adress;

import java.io.*;
import java.net.Socket;

public class Whois {

    public static void main(String [] args) {
            int c;


            try(Socket s = new Socket("whois.internic.net", 43)) {

            //получаем потоки ввода и ыввода
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();

            // Формируем строку запроса
            String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";

            //преобразование строки в байты
            byte[] buf = str.getBytes();

            //посылаем запрос
            out.write(buf);

            // прочитать ответ и вывести в консоле
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
                System.out.println("Ошибка ввода-вывода " + e);
            }

    }
}
