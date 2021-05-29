package main.java.com.yhtyyar.javacore.chapter11;

public class Synchronized {

    public static void main(String [] args) {

        CallMe target = new CallMe();
        Caller ob1 = new Caller(target, "Добро пожаловать ");
        Caller ob2 = new Caller(target, "в синхронизированный");
        Caller ob3 = new Caller(target, "мир!");

        try {
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();

        } catch (InterruptedException e) {
            System.out.println("Прервано.");
        }

    }


}

class CallMe {

    synchronized void call (String msg) {
        System.out.print("[" + msg);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано.");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {

    String msg;
    CallMe target;
    Thread thread;

    public Caller (CallMe target, String str) {
        this.target = target;
        msg = str;
        thread = new Thread(this);
        thread.start();
    }


    @Override
    public void run() {

        target.call(msg);
    }
}
