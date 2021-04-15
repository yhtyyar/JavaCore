package main.java.com.yhtyyar.javacore.chapter06;

public class BoxDemo6 {

    public static void main(String [] args) {

        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box(3,6,9);

        System.out.println("Объем равен " + mybox1.volume2());

        System.out.println("Объем равен " + mybox2.volume2());

    }
}
