package main.java.com.yhtyyar.javacore.chapter08.keywords;

import main.java.com.yhtyyar.javacore.chapter08.keywords.A;

public class B extends A {

    int i;
    int k;
    int total;

    B (int a, int b) {
       super.i = a;
       i = b;
    }
    B(int a, int b, int c) {
        super(a,b);
        k = c;
    }


    B() {
        System.out.println("В конструкторе B.");
    }

    void show(String msg) {

        System.out.println(msg + k);
    }




    void sum () {
        total = i + j;
    }

    void showk() {
        System.out.println(" k: " + k);
    }
//    void sum(){
//        System.out.println(" i + j + k: " + (i + j + k));
//    }

}
