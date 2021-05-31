package main.java.com.yhtyyar.javacore.chapter28.phaser;

import java.util.concurrent.Phaser;

public class PhaserDemo2 {

    public static void main(String [] args) {

        MyPhaser myPhaser = new MyPhaser(1,4);

        System.out.println("Запуск потоков \n");

        new MyThread2(myPhaser, "A");
        new MyThread2(myPhaser, "B");
        new MyThread2(myPhaser, "C");

        // ожидать до завершения определенного количества фаз
        while(!myPhaser.isTerminated()) {
            myPhaser.arriveAndAwaitAdvance();
        }

        System.out.println("Синхронизатор фаз завершен");

    }
}

class MyPhaser extends Phaser {

    int numPhases;

    MyPhaser (int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount - 1;
    }

    protected boolean onAdvance(int p, int regParties) {

        System.out.println("Фаза " + p + " звершена.\n");

        if (p == numPhases || regParties == 0) {
            return true;
        }

        return false;
    }
}

class MyThread2 implements  Runnable{

    Phaser phaser;
    String name;

    MyThread2(Phaser phaser, String name) {

        this.phaser = phaser;
        this.name = name;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {

        while(!phaser.isTerminated()) {
            System.out.println("Поток " + name + " начинает фазу " + phaser.getPhase());
            phaser.arriveAndAwaitAdvance();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }



}
