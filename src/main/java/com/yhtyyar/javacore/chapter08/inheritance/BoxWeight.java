package main.java.com.yhtyyar.javacore.chapter08.inheritance;

import main.java.com.yhtyyar.javacore.chapter08.inheritance.Box;

public class BoxWeight extends Box {

    double weight;

    BoxWeight(double width, double height, double depth, double weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }
}
