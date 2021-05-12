package main.java.com.yhtyyar.javacore.chapter15.links_on_methods;

public class MyClass2<T> {

    private T val;

    MyClass2(T v) {
        val = v;
    }

    MyClass2() {
        val = null;
    }

    T getVal() {
        return val;
    }
}
