package main.java.com.yhtyyar.javacore.chapter28.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {

    public static void main(String[] args) {

        new AtomThread("A");
        new AtomThread("B");
        new AtomThread("C");

    }
}

class AtomThread implements Runnable {

    String name;

    AtomThread (String name) {

        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {

        System.out.println("Запуск потока " + name);

        for (int i= 1; i <= 3; i++) {
            System.out.println("Поток " + name + " получено: " + Shared.ai.getAndSet(i));
        }

    }
}

class Shared {
    static AtomicInteger ai = new AtomicInteger(0);
}
