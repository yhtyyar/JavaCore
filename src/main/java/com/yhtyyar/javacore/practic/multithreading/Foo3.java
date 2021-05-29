package main.java.com.yhtyyar.javacore.practic.multithreading;

class Main3 {

    public static void main (String [] args) {

        ThirdThread thirdThread = new ThirdThread();
        SecondThread secondThread = new SecondThread();
        FirstThread firstThread = new FirstThread();



        try {
            firstThread.thread.join();
            Thread.sleep(500);

        } catch (InterruptedException e) {
            System.out.println("Прервано.");
        }

        secondThread.bThread();

        try {
            secondThread.thread.join();
            Thread.sleep(500);

        } catch (InterruptedException e) {
            System.out.println("Прервано.");
        }

        thirdThread.cThread();




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


class FirstThread implements Runnable{

    Foo3 foo3 = new Foo3();
    Thread thread;


    FirstThread() {

       thread =  new Thread(this);
       thread.start();
    }

    public void run() {

       foo3.first();
    }

}


class SecondThread implements Runnable {

    Thread thread;
    Foo3 foo3 = new Foo3();
    boolean suspendFlag = false;

    void bThread() {
        thread = new Thread(this);
        thread.start();
    }

    public void run() {

            foo3.second();

    }

}


class ThirdThread implements Runnable {

    Foo3 foo3 = new Foo3();
    Thread thread;
    boolean suspendFlag = false;


    void cThread() {
        thread = new Thread(this);
        thread.start();
    }

    public void run() {

        foo3.third();

        try {
            Thread.sleep(500);

        } catch (InterruptedException e) {
            System.out.println("Прервано.");
        }
    }


}