package main.java.com.yhtyyar.javacore.chapter20.serealization;

import java.io.*;

public class SerializationDemo {

    public static void main(String [] args) {

        try (ObjectOutputStream objOStrm =
                    new ObjectOutputStream(new FileOutputStream("serial.txt"))) {

            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);

            objOStrm.writeObject(object1);

        } catch (IOException e) {
            System.out.println("Исключение при сериализации: " + e);
        }

        try (ObjectInputStream objIStrm =
                new ObjectInputStream(new FileInputStream("serial.txt"))) {

            MyClass object2 =  (MyClass)objIStrm.readObject();
            System.out.println("object2: " + object2);

        } catch (Exception e) {
            System.out.println("Исключение при десериалицазии: " + e);
            System.exit(0);
        }
    }
}
