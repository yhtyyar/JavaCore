package main.java.com.yhtyyar.javacore.chapter28.сountDownLatch;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {

    public static void main(String [] args) {

        CountDownLatch cd1 = new CountDownLatch(5);

        System.out.println("Запуск потока исполнения");

        new MyThread(cd1);

        try {
            cd1.await();

        } catch (InterruptedException e) {
            System.out.println("Поток прерван.");
        }

        System.out.println("Завершение потока исполнения");

    }
}

class MyThread implements Runnable {

    CountDownLatch latch;

    MyThread (CountDownLatch latch) {
        this.latch = latch;
        new Thread(this).start();
    }


    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            latch.countDown();
        }

    }
}
