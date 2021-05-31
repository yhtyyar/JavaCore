package main.java.com.yhtyyar.javacore.practic.concurrent;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class Foo {


    public static synchronized void first() {
        print("first");
    }

    public static synchronized void second() {
        print("second");
    }

    public static synchronized void third() {
        print("third");
    }

    private static synchronized void print(String string) {
        System.out.print(string);
    }


    public static void main(String [] args) {

        ABCThread cThread = new ABCThread(() -> third());
        ABCThread bThread = new ABCThread(() -> second());
        ABCThread aThread = new ABCThread(() -> first());


        aThread.nextThread.add(bThread);
        bThread.nextThread.add(cThread);



        // запускаем код с первого потока А
        aThread.start.countDown();
    }
}


class ABCThread implements Runnable {

    CountDownLatch start = new CountDownLatch(1);
    List<ABCThread> nextThread = new ArrayList<>();
    Runnable run;


    ABCThread(Runnable run) {

        this.run = run;
        new Thread(this).start();
    }

    @Override
    public void run() {

        try {
            // ждем пока не запуститься
            start.await();
            run.run();

            for (ABCThread abc : nextThread) {
                abc.start.countDown();
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}











