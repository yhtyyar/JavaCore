package main.java.com.yhtyyar.javacore.practic.concurrent;

import java.util.concurrent.*;

class Foo2 {

    public static void main(String [] args) {

        ExecutorService ex = Executors.newFixedThreadPool(3);
        Foo2 foo2 = new Foo2();

        ex.execute(new CThread(foo2));
        ex.execute(new BThread(foo2));
        ex.execute(new AThread(foo2));
    }

    public synchronized void first() {

        while (Shared1.count != 1) {

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        print("first");
        Shared1.count++;
        notifyAll();
    }


    public synchronized void second() {


        while (Shared1.count != 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Прерван поток 2");
            }
        }

        print("second");
        Shared1.count++;
        notifyAll();
    }


    public synchronized void third() {

        while (Shared1.count != 3) {

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        print("third");
        Shared1.count++;
        notifyAll();
    }


    public  synchronized void print(String str) {
        System.out.print(str);
    }

}

class Shared1 {

    static int count = 1;
}

class AThread implements Runnable{

    Foo2 foo2;



    AThread(Foo2 foo2) {

        this.foo2 = foo2;
        new Thread(this).start();
    }

    public void run() {

        foo2.first();
    }
}


class BThread implements Runnable {


    Foo2 foo2;

    BThread(Foo2 foo2) {

        this.foo2 = foo2;
        new Thread(this).start();
    }

    public void run() {

        foo2.second();
    }
}


class CThread implements Runnable {

    Foo2 foo2;

    CThread(Foo2 foo2) {

        this.foo2 = foo2;
        new Thread(this).start();
    }


    public void run() {

        foo2.third();

    }
}










