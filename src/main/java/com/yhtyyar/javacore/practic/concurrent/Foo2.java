package main.java.com.yhtyyar.javacore.practic.concurrent;

class Main2 {

    public static void main(String [] args) {

        AThread2 aThread = new AThread2();

        try {
            aThread.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Первый поток прерван");
        }


        BThread2 bThread = new BThread2();

        try {
            bThread.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Второй поток прерван");
        }



        CThread2 cThread = new CThread2();

        try {
            cThread.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Третий поток прерван");
        }

    }
}


public class Foo2 {
    public void first() {
        System.out.print("first");

    }

    public void second() {
        System.out.print("second");

    }

    public void third() {
        System.out.print("third");

    }

}

class AThread2 implements Runnable {

    Foo2 fooo = new Foo2();
    Thread thread;

    AThread2() {

        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {

        fooo.first();
    }
}

class BThread2 implements Runnable {

    Foo2 fooo = new Foo2();
    Thread thread;

    BThread2() {

        thread = new Thread(this);
        thread.start();

    }

    @Override
    public void run() {

        fooo.second();
    }
}

class CThread2 implements Runnable {

    Foo2 fooo = new Foo2();
    Thread thread;

    CThread2() {

        thread = new Thread(this);
        thread.start();

    }

    @Override
    public void run() {

        fooo.third();
    }
}



