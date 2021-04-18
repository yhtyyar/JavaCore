package main.java.com.yhtyyar.javacore.chapter09.expansion_of_interfaces;

public interface MyIF {

    int getNumber();

    default String getString() {
        return "Объект типа String по умолчанию";
    }

    static int getDefaultNumber () {
        return 0;
    }
}
