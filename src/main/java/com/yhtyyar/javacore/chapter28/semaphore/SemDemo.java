package main.java.com.yhtyyar.javacore.chapter28.semaphore;

import java.util.concurrent.Semaphore;

public class SemDemo {

    public static void main (String [] args) {

        Semaphore semaphore = new Semaphore(1);

        new IncThread(semaphore, "A");
        new DecThread(semaphore, "B");

    }
}

class Shared {
    static int count = 0;
}

class IncThread implements Runnable{

    String name;
    Semaphore semaphore;

    IncThread(Semaphore semaphore, String name) {

        this.semaphore = semaphore;
        this.name = name;
        new Thread(this).start();

    }

    public void run() {

        System.out.println("Запуск потока " + name);

        try{

            System.out.println("Поток " + name + " ожидает разрешения");
            semaphore.acquire();
            System.out.println("ПОток " + name + " получает разрешение");

            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + ": " + Shared.count);

                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Ошибка" + e);
        }

        System.out.println("Поток " + name + " освобождает разрешение");
        semaphore.release();
    }
}


class DecThread implements Runnable {

    String name;
    Semaphore semaphore;

    DecThread(Semaphore semaphore, String name) {

        this.semaphore = semaphore;
        this.name = name;
        new Thread(this).start();

    }

    public void run() {

        System.out.println("Запуск потока " + name);

        try{

            System.out.println("Поток " + name + " ожидает разрешения");
            semaphore.acquire();
            System.out.println("ПОток " + name + " получает разрешение");

            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + ": " + Shared.count);

                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Ошибка" + e);
        }

        System.out.println("Поток " + name + " освобождает разрешение");
        semaphore.release();
    }

}

