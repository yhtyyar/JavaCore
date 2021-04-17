package main.java.com.yhtyyar.javacore.chapter08.abstract_classes;


public class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a,b);
    }

    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}
