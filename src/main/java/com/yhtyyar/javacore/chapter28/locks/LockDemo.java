package main.java.com.yhtyyar.javacore.chapter28.locks;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {

    public static void main(String [] args) {
        ReentrantLock lock = new ReentrantLock();

        new LockThread(lock, "A");
        new LockThread(lock, "B");

    }
}

class Shared {
    static int count = 0;
}

class LockThread implements Runnable {

    String name;
    ReentrantLock lock;

    LockThread (ReentrantLock lock, String name) {

        this.lock = lock;
        this.name = name;
        new Thread(this).start();

    }

    @Override
    public void run() {

        System.out.println("Запуск потока " + name);

        try {

            // блокировка счетчика
            System.out.println("Поток " + name + " ожидает блокировки счетчика");
            lock.lock();

            System.out.println("Поток " + name + " блокирует счетчик.");
            Shared.count++;

            System.out.println("Поток " + name + ": " + Shared.count);

            System.out.println("Поток " + name + " ожидает");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Поток прерван");
        } finally {

            //снятие блокировки
            System.out.println("Поток " + name + " разблокирует счетчик");
            lock.unlock();
        }

    }
}
