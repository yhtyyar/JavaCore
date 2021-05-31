package main.java.com.yhtyyar.javacore.chapter28.phaser;

import java.util.concurrent.Phaser;

public class PhaserDemo {

    public static void main(String[] args) {

        Phaser phaser = new Phaser(1);

        int curPhase;

        System.out.println("Запуск потоков");

        new MyThread(phaser, "A");
        new MyThread(phaser, "B");
        new MyThread(phaser, "C");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + curPhase + " завершена");


        phaser.arriveAndAwaitAdvance();

        if(phaser.isTerminated()) {
            System.out.println("Синхронизатор фаз завершен");
        }

    }
}

class MyThread implements Runnable {

    Phaser phaser;
    String name;

    MyThread(Phaser phaser, String name) {

        this.phaser = phaser;
        this.name = name;
        phaser.register();
        new Thread(this).start();
    }


    @Override
    public void run() {

        System.out.println("Поток " + name + " начинает первую фазу");
        phaser.arriveAndAwaitAdvance();  //известить о достижении фазы

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Поток " + name + " начинает вторую фазу");
        phaser.arriveAndAwaitAdvance(); //известить о достижении фазы

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Поток " + name + " начинает третью фазу");
        phaser.arriveAndAwaitAdvance(); //известить о достижении фазы

    }
}
