package main.java.com.yhtyyar.javacore.chapter11;

public class NewThread implements Runnable{

    Thread thread;

    NewThread() {
        thread = new Thread(this, "Демонстрационный поток");
        System.out.println("Дочерний поток создан: " + thread);
        thread.start();
    }


    @Override
    public void run() {

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван.");
        }

        System.out.println("Дочерний поток завершен.");
    }
}

class ThreadDemo {
    public static void main(String [] args) {

        new NewThread();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }

        System.out.println("Главный поток завершен.");
    }
}
