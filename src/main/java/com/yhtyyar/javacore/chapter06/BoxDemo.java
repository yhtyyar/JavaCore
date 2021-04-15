package main.java.com.yhtyyar.javacore.chapter06;

public class BoxDemo {

    public static void main(String [] args) {

        Box  mybox = new Box(10,20,15);

        double vol;

        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println(" Объем равен " + vol);
    }
}

class Box {
    double width;
    double height;
    double depth;


    Box(double width, double height, double depth) {
        this.width =  width;
        this.height =  height;
        this.depth = depth;
    }

    void volume() {
        System.out.print("Объем равен ");
        System.out.println( width * height * depth);
    }

    double volume2() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

}
