package main.java.com.yhtyyar.javacore.chapter08.abstract_classes;

abstract class A {

    abstract void callMe();

    final
    void callMeToo() {
        System.out.println("Это конкретный метод.");
    }
}
