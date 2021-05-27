package main.java.com.yhtyyar.javacore.chapter11;

public class CurrentThreadDemo {

    public static void main(String [] args) {

        Thread thread = Thread.currentThread();

        System.out.println("Текущий поток исполнения: " + thread);

        thread.setName("My Thread");
        System.out.println("После изменения имени потока: " + thread);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }

    }
}
