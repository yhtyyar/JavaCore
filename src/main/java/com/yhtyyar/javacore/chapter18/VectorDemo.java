package main.java.com.yhtyyar.javacore.chapter18;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

    public  static void main(String [] args) {

        Vector<Integer> vector = new Vector<Integer>(3,2);
        System.out.println("Начальный размер вектора: " + vector.size());
        System.out.println("Начальная емкость вектора: " + vector.capacity());

        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);

        System.out.println("Емкость вектора после ввода четырех элементов: " + vector.capacity());

        vector.addElement(5);
        System.out.println("Текущая емкость вектора: " + vector.capacity());

        vector.addElement(6);
        vector.addElement(7);
        System.out.println("Текущая емкость вектора: " + vector.capacity());

        vector.addElement(9);
        vector.addElement(10);
        System.out.println("Текущая емкость вектора: " + vector.capacity());

        vector.addElement(11);
        vector.addElement(12);
        System.out.println("Первый элемент вектора: " + vector.firstElement());
        System.out.println("Первый элемент вектора: " + vector.lastElement());

        if (vector.contains(3)) {
            System.out.println("Вектор содержит 3.");
        }

        Enumeration<Integer> vEnum = vector.elements();

        System.out.println("\nЭлементы вектора: ");
        while (vEnum.hasMoreElements()) {
            System.out.print(vEnum.nextElement() + " ");
        }
        System.out.println();


    }
}
