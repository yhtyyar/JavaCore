package main.java.com.yhtyyar.javacore.chapter04.logical_operations;

public class Ternary {

    public static void main(String args []) {

        int i, k;

        i = 10;
        k = i < 0 ? -i : i;  // получить абсолютное значение переменной i

        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);

        i = - 10;
        k = i < 0 ? -i : i;  // получить абсолютное значение переменной i

        System.out.print("Абсолютное значение ");
        System.out.println(i + " равно " + k);


/*
В зависимости от условия тернарная операция возвращает второй или третий операнд:
если условие равно true, то возвращается второй операнд;
если условие равно false, то третий.
 */
        int x = 3;
        int y = 2;

        int z = x < y ?  (x + y) : (x - y);

        System.out.println(z);





    }
}
