package main.java.com.yhtyyar.javacore.chapter08.method_overriding;

public class Figure {

    double dim1;
    double dim2;

    Figure (double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Площадь фигуры не определена.");
        return 0;
    }
}
