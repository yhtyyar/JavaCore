package main.java.com.yhtyyar.javacore.chapter11;

public class SuspendResume {

    public static void main(String [] args) {

        NewThread4 ob1 = new NewThread4("Один");
        NewThread4 ob2 = new NewThread4("Два");

        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("Приостановка потока Один");

            Thread.sleep(1000);
            ob1.myResume();
            System.out.println("Возобновление потока Один");

            ob2.mySuspend();
            System.out.println("Приостановка потока Два");

            Thread.sleep(1000);
            ob2.myResume();
            System.out.println("Возобновление потока Два");
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        try {
            System.out.println("Ожидание завершения потоков.");
            ob1.thread.join();
            ob2.thread.join();

        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Главный поток завершен");
    }
}

class NewThread4 implements Runnable{

    String name;
    Thread thread;
    boolean suspendFlag;

    NewThread4 (String nameThread) {
        name = nameThread;
        thread = new Thread(this, name);
        System.out.println("Новый поток: " + thread);
        suspendFlag = false;
        thread.start();
    }

    @Override
    public void run() {

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {

                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }

        System.out.println(name + " завершен.");
    }

    synchronized void mySuspend() {
        suspendFlag = true;
    }

    synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}
