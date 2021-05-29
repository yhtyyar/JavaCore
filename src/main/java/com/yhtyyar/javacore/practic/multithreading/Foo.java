package main.java.com.yhtyyar.javacore.practic.multithreading;

class Main {

    public static void main(String [] args) {

        CThread cThread = new CThread();
        AThread aThread = new AThread();
        BThread bThread = new BThread();
    }
}


public class Foo {


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

class AThread implements Runnable {

    Foo fooo = new Foo();
    Thread thread;

    AThread() {

        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {

        fooo.first();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Прерван.");
        }
    }
}

class BThread implements Runnable {

    Foo fooo = new Foo();
    Thread thread;

    BThread() {

        thread = new Thread(this);
        thread.start();

    }

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прерван.");
        }

        fooo.second();
    }
}

class CThread implements Runnable {

    Foo fooo = new Foo();
    Thread thread;

    CThread() {

        thread = new Thread(this);
        thread.start();

    }

    @Override
    public void run() {

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("Прерван.");
        }

        fooo.third();
    }
}







