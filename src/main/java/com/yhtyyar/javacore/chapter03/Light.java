package main.java.com.yhtyyar.javacore.chapter03;

public class Light {

    public static void main(String [] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

        //Прибилизительная скорость света, миль в секунду
        lightSpeed = 186000;

        days = 1000;

        seconds = days * 24 * 60 * 60;

        distance = lightSpeed * seconds;

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль. ");
    }
}
