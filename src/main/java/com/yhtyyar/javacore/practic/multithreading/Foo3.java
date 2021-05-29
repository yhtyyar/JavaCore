package main.java.com.yhtyyar.javacore.practic.multithreading;

class Main3 {
    public static void main(String [] args) {

        AThread3 aThread = new AThread3();
        BThread3 bThread = new BThread3();
        CThread3 cThread = new CThread3();


    }
}


class Foo3 {


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

class AThread3 implements Runnable {

    Foo3 fooo = new Foo3();
    Thread thread;

    AThread3() {

        thread = new Thread(this);
        thread.start();

    }

    void notifyA(){
        notify();
    }

    @Override
    public void run() {

        fooo.first();

    }
}

class BThread3 implements Runnable {

    Foo3 fooo = new Foo3();
    Thread thread;
    AThread3 aThread3;


    BThread3() {
        thread = new Thread(this);
        thread.start();

        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
            aThread3.notifyA();
            fooo.second();
    }

    boolean flag() {
        return true;
    }


}

class CThread3 implements Runnable {

    Foo3 fooo = new Foo3();
    Thread thread;
    AThread3 aThread3;


    CThread3() {

        thread = new Thread(this);
        thread.start();

        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void run() {

            aThread3.notifyA();
            fooo.third();

    }
}