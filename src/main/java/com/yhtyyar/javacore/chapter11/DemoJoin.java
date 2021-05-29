package main.java.com.yhtyyar.javacore.chapter11;

public class DemoJoin {

    public static void main(String [] args) {

        NewThread3 ob1 = new NewThread3("Один");
        NewThread3 ob2 = new NewThread3("Два");
        NewThread3 ob3 = new NewThread3("Три");

        System.out.println("Поток Один запущен: " + ob1.thread.isAlive());
        System.out.println("Поток Два запущен: " + ob2.thread.isAlive());
        System.out.println("Поток Три запущен: " + ob3.thread.isAlive());


        try {
            System.out.println("Ожидание завершения потоков.");
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();

        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }

        System.out.println("Поток Один запущен: " + ob1.thread.isAlive());
        System.out.println("Поток Два запущен: " + ob2.thread.isAlive());
        System.out.println("Поток Три запущен: " + ob3.thread.isAlive());

        System.out.println("главный поток завершен.");
    }
}
