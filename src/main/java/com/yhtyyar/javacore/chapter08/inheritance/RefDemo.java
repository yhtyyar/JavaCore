package main.java.com.yhtyyar.javacore.chapter08.inheritance;

public class RefDemo {
    public static void main(String [] args) {

        BoxWeight weightBox = new BoxWeight(3,5,7,8.4);
        Box plainBox = new Box();

        System.out.println(" Объем weightBox равен " + weightBox.volume());
        System.out.println("Вес weightBox равен " + weightBox.weight);
        System.out.println();

        plainBox = weightBox;

        System.out.println("Объем plainBox равен " + plainBox.volume());


    }
}
