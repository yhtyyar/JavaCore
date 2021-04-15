package main.java.com.yhtyyar.javacore.chapter06;

public class BoxDemo3 {

    public static void main(String [] args) {

        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box(3,6,9);

        mybox1.width = 15;
        mybox1.height = 25;
        mybox1.depth = 10;


        mybox2.width = 9;
        mybox2.height = 14;
        mybox2.depth = 6;

        mybox1.volume();

        mybox2.volume();
    }
}
