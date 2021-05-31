package main.java.com.yhtyyar.javacore.chapter28.executor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpExec {

    public static void main(String[] args) {

        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd2 = new CountDownLatch(5);
        CountDownLatch cd3 = new CountDownLatch(5);
        CountDownLatch cd4 = new CountDownLatch(5);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        System.out.println("Запуск потоков");

        executorService.execute(new MyThread(cd1, "A"));
        executorService.execute(new MyThread(cd2, "B"));
        executorService.execute(new MyThread(cd3, "C"));
        executorService.execute(new MyThread(cd4, "D"));

        try {
            cd1.await();
            cd2.await();
            cd3.await();
            cd4.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}

class MyThread implements Runnable{

    String name;
    CountDownLatch latch;

    MyThread(CountDownLatch count, String name) {

        latch = count;
        this.name = name;
        new Thread(this);
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }

    }
}