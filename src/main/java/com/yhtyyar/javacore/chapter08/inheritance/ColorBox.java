package main.java.com.yhtyyar.javacore.chapter08.inheritance;

public class ColorBox extends Box{

    int color;

    ColorBox(double width, double height, double depth, int color) {
        super(width, height, depth);
        this.color = color;
    }
}
