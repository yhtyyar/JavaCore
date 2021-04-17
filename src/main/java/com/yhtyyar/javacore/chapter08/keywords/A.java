package main.java.com.yhtyyar.javacore.chapter08.keywords;

public class A {

    int i,j;


    A() {
        System.out.println("В конструкторе А.");
    }

    A(int a, int b) {
        i = a;
        j = b;

    }


    void setij(int x, int y) {
        i = x;
        j = y;
    }


    void show() {
        System.out.println(" i и j: " + i + " и " + j);
    }
}
