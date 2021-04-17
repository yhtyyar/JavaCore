package main.java.com.yhtyyar.javacore.chapter08.inheritance;

public class Shipment extends BoxWeight{

    double cost;

    Shipment (Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    Shipment(double width, double height, double depth, double m, double c) {
        super(width,height,depth,m);
        cost = c;
    }

    Shipment() {
        super();
        cost = -1;
    }

    Shipment (double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
