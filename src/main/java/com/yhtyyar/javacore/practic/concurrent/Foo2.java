package main.java.com.yhtyyar.javacore.practic.concurrent;

import java.util.concurrent.Semaphore;



class Foo2 {

    Semaphore semaphore1 = new Semaphore(1);
    Semaphore semaphore2 = new Semaphore(1);
    Runnable run;

    Foo2 () {

        try {

            semaphore1.acquire();
            semaphore2.acquire();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public synchronized void first(Runnable aThread) {

        run = aThread;
        aThread.run();
        print("first");
        semaphore1.release();
    }


    public synchronized void second(Runnable bThread) {

        run = bThread;
        try {
            semaphore1.acquire();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        bThread.run();
        print("second");
        semaphore2.release();
    }


    public synchronized void third(Runnable cThread) {

        run = cThread;
        try {
            semaphore2.acquire();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        cThread.run();
        print("third");
    }


    public synchronized void print(String str) {
        System.out.print(str);
    }


    public static void main(String [] args) {

        Foo2 foo2 = new Foo2();

        AThread2 aThread2 = new AThread2(foo2);
        BThread2 bThread2 = new BThread2(foo2);
        CThread2 cThread2 = new CThread2(foo2);

    }
}



class AThread2 extends Thread {

    Thread thread;
    Foo2 foo;


    AThread2 (Foo2 foo) {

        this.foo = foo;
        thread = new Thread(this);
        thread.start();
    }


    @Override
    public void run() {

        foo.first(thread);
    }
}


class BThread2 extends Thread{

    Thread thread;
    Foo2 foo;

    BThread2 (Foo2 foo) {

        this.foo = foo;
        thread = new Thread(this);
        thread.start();
    }


    @Override
    public void run() {

        foo.second(thread);
    }
}


class CThread2 extends Thread{

    Thread thread;
    Foo2 foo;



    CThread2 (Foo2 foo) {

        this.foo = foo;
        thread = new Thread(this);
        thread.start();
    }


    @Override
    public void run() {

        foo.third(thread);
    }
}






