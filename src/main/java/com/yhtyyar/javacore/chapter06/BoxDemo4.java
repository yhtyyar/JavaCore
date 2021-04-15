package main.java.com.yhtyyar.javacore.chapter06;

public class BoxDemo4 {

    public static void main(String [] args) {

        Box  mybox1 = new Box();
        Box  mybox2 = new Box();


        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;


        System.out.println("Объем равен " + mybox1.volume2());


        System.out.println("Объем равен " + mybox2.volume2());
    }
}
