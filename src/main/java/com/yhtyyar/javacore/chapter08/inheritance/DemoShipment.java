package main.java.com.yhtyyar.javacore.chapter08.inheritance;

public class DemoShipment {

    public static void main(String [] args) {

        Shipment shipment1 = new Shipment(10, 20, 15, 10.8, 3.5);
        Shipment shipment2 = new Shipment(2,3,4,0.8,1.3);


        System.out.println("Объем shipment1 равен " + shipment1.volume());
        System.out.println("Вес shipment1 равен " + shipment1.weight);
        System.out.println("Стоимость доставки: " + shipment1.cost + "$");
        System.out.println();

        System.out.println("Объем shipment2 равен " + shipment2.volume());
        System.out.println("Вес shipment2 равен " + shipment2.weight);
        System.out.println("Стоимость доставки: " + shipment2.cost + "$");

    }
}
