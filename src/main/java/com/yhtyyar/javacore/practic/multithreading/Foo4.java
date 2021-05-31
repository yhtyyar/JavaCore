package main.java.com.yhtyyar.javacore.practic.multithreading;

import java.util.concurrent.locks.ReentrantLock;

class Main4 {

    public static void main(String [] args) {

        ReentrantLock lock = new ReentrantLock();

        Foo4 foo = new Foo4();

        new CThread4(lock,foo);
        new BThread4(lock,foo);
        new AThread4(lock,foo);

    }
}


class Shared {
    static int count = 0;
}


public class Foo4 {

    public synchronized void first() {

        print("first");
    }

    public synchronized void second() {

        print("second");
    }

    public synchronized void third() {

        print("third");
    }

    private synchronized void print(String str) {

        System.out.print(str);
    }

}


class AThread4 implements Runnable{

    ReentrantLock lock;
    Thread thread;
    Foo4 foo;



    AThread4 (ReentrantLock lock, Foo4 foo) {

        this.lock = lock;
        this.foo = foo;
        thread = new Thread(this);
        thread.start();

    }


    @Override
    public void run() {

        try {

            lock.lock();

            Shared.count++;

            if (Shared.count == 1) {
                foo.first();
                new BThread4(lock, foo);
            } else {
                Shared.count--;
            }

            Thread.sleep(500);

        } catch (InterruptedException e) {
            System.out.println("Прерван.");
        } finally {
            lock.unlock();
        }


    }
}


class BThread4 implements Runnable{

    ReentrantLock lock;
    Thread thread;
    Foo4 foo;

    BThread4 (ReentrantLock lock, Foo4 foo) {

        this.lock = lock;
        this.foo = foo;
        thread = new Thread(this);
        thread.start();

    }


    @Override
    public void run() {

        try {

            lock.lock();

            Shared.count++;

            if (Shared.count == 2) {
                foo.second();
                new CThread4(lock, foo);
            } else {
                new AThread4(lock, foo);
                Shared.count--;
            }

            Thread.sleep(500);

        } catch (InterruptedException e) {
            System.out.println("Прерван.");
        } finally {
            lock.unlock();
        }
    }
}


class CThread4 implements Runnable{

    ReentrantLock lock;
    Thread thread;
    Foo4 foo;



    CThread4 (ReentrantLock lock, Foo4 foo) {

        this.lock = lock;
        this.foo = foo;
        thread = new Thread(this);
        thread.start();

    }


    @Override
    public void run() {

        try {

            lock.lock();

            Shared.count++;

            if (Shared.count == 3) {
                foo.third();
            } else {
                new BThread4(lock, foo);
                Shared.count--;
            }

            Thread.sleep(500);

        } catch (InterruptedException e) {
            System.out.println("Прерван.");
        } finally {
            lock.unlock();
        }

    }
}



