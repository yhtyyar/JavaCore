package main.java.com.yhtyyar.javacore.chapter08.method_overriding;

public class FindAreas {

    public static void main(String [] args) {

        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);

        System.out.println("Площадь равна " + f.area());

        System.out.println("Площадь равна " + r.area());

        System.out.println("Площадь равна " + t.area());
    }
}
