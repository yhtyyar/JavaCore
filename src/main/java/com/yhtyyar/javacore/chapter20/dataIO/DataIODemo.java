package main.java.com.yhtyyar.javacore.chapter20.dataIO;

import java.io.*;

public class DataIODemo {

    public static void main(String [] args) {

        try (DataOutputStream dataOutput =
                     new DataOutputStream(new FileOutputStream("Test.dat"))){

            dataOutput.writeDouble(98.6);
            dataOutput.writeInt(1000);
            dataOutput.writeBoolean(true);

        } catch (FileNotFoundException e) {
            System.out.println("Нельзя открыть файл вывода");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        try (DataInputStream dataInput =
                new DataInputStream(new FileInputStream("Test.dat"))) {

            double d = dataInput.readDouble();
            int i = dataInput.readInt();
            boolean b = dataInput.readBoolean();

            System.out.println("Полученные значения: " + d + " " + i + " " + b);

        } catch (FileNotFoundException e) {
            System.out.println("Нельзя открыть файл вывода");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

    }
}
