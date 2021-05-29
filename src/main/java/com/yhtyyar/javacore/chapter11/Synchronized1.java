package main.java.com.yhtyyar.javacore.chapter11;

public class Synchronized1 {

    public static void main(String [] args) {

        CallMe1 target = new CallMe1();
        Caller1 ob1 = new Caller1(target, "Добро пожаловать ");
        Caller1 ob2 = new Caller1(target, "в синхронизированный");
        Caller1 ob3 = new Caller1(target, "мир!");

        try {
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();

        } catch (InterruptedException e) {
            System.out.println("Прервано.");
        }
    }
}

class CallMe1 {

    void call (String msg) {
        System.out.print("[" + msg);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано.");
        }
        System.out.println("]");
    }
}

class Caller1 implements Runnable {

    String msg;
    CallMe1 target;
    Thread thread;

    public Caller1 (CallMe1 target, String str) {
        this.target = target;
        msg = str;
        thread = new Thread(this);
        thread.start();
    }


    @Override
    public void run() {

        synchronized (target) {
            target.call(msg);
        }
    }

}
