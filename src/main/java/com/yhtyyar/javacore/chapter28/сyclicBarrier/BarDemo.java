package main.java.com.yhtyyar.javacore.chapter28.сyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarDemo {

    public static void main(String [] args) {

        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

        System.out.println("Запуск потоков");

        new MyThread(cb, "A");
        new MyThread(cb, "B");
        new MyThread(cb, "C");

        new MyThread(cb, "X");
        new MyThread(cb, "Y");
        new MyThread(cb, "Z");
    }
}

class MyThread  implements Runnable {
    CyclicBarrier cbar;
    String name;

    MyThread (CyclicBarrier c, String n) {
        cbar = c;

        name = n;
        new Thread(this).start();
    }

    @Override
    public void run() {

        System.out.println(name);

        try {
            cbar.await();
        } catch (BrokenBarrierException e) {
            System.out.println(e);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}

class BarAction implements Runnable {

    @Override
    public void run() {
        System.out.println("Барьер достигнут!");
    }
}
