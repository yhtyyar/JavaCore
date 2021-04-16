package main.java.com.yhtyyar.javacore.chapter07.arguments;

public class VarArgs2 {

    static void vaTest (String msg, int ... v) {
        System.out.print(msg + v.length + "  Содержимое: ");

        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String [] args) {
        vaTest("Один параметр переменной длины: ",20);
        vaTest("Три параметра переменной длины: ", 1, 2, 3, 4);
        vaTest("Без параметров переменной длины: ");
    }
}
