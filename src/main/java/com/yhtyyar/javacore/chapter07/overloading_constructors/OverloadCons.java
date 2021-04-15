package main.java.com.yhtyyar.javacore.chapter07.overloading_constructors;

public class OverloadCons {

    public static void main(String [] args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        System.out.println("Объем mybox1 равен: " + mybox1.volume());

        System.out.println("Объем mybox2 равен: " + mybox2.volume());

        System.out.println("Объем mycube равен: " + mycube.volume());
    }
}
