package main.java.com.yhtyyar.javacore.chapter07.classes;

public class StringDemo2 {

    public static void main(String [] args) {

        String strOb1 = "Первая строка";
        String strOb2 = "Вторая строка";
        String strOb3 = strOb1;

        System.out.println("Длина строки strOb1: " + strOb1.length());

        System.out.println("Символ по индексу 3 в строке strOb1: " + strOb1.charAt(3));
        // из-за того что у меня стоит UTF-8 будет выводиться буква "в"  а если бы всё стояло по умолчанию выводилась бы буква "s"

        if(strOb1.equals(strOb2)) {
            System.out.println("strOb1 == strOb2");
        } else {
            System.out.println("strOb1 != strOb2");
        }

        if (strOb1.equals(strOb3)) {
            System.out.println("strOb1 == strOb3");
        } else {
            System.out.println("strOb1 != strOb3");
        }
    }
}
