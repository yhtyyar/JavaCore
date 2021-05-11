package main.java.com.yhtyyar.javacore.chapter13;

public class MyClass {

    int a;
    int b;

    MyClass(int i, int j) {

        a = i;
        b = j;
    }

    MyClass(int i) {

        this(i,1);
    }

    MyClass() {

        this(0);
    }
}


