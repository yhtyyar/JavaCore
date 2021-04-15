package main.java.com.yhtyyar.javacore.chapter07.overloading_constructors;

public class OverloadCons2 {

    public static void main(String []  args) {
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);

        System.out.println(" Объем mybox1 равен: " + mybox1.volume());

        System.out.println(" Объем mybox2 равен: " + mybox2.volume());

        System.out.println(" Объем mycube равен: " + mycube.volume());

        System.out.println(" Объем клона равен: " + myclone.volume());
    }
}
