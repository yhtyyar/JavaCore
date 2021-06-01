package main.java.com.yhtyyar.javacore.practic.concurrent.solution;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Foo {

    private volatile int flag = 1;
    private volatile ReentrantLock lock = new ReentrantLock();
    private volatile Condition condition2 = lock.newCondition();
    private volatile Condition condition3 = lock.newCondition();


    public static void main(String[] args) {

        Foo foo = new Foo();

        CThread cThread = new CThread(foo);
        AThread aThread = new AThread(foo);
        BThread bThread = new BThread(foo);


    }

    public  void first () {

        lock.lock();

        try {
            print("first");
            flag = 2;
            condition2.signal();
        } finally {
            lock.unlock();
        }
    }

    public  void second() {

       lock.lock();

       try {
           if (flag != 2) {
               try {
                   condition2.await();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }

           print("second");
           flag = 3;
           condition3.signal();
       } finally {
           lock.unlock();
       }
    }

    public  void third() {

       lock.lock();

       try {
           if (flag != 3) {
               try {
                   condition3.await();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }

           }
           print("third");
       } finally {
           lock.unlock();
       }
    }

    private void print(String string) {
        System.out.print(string);
    }
}


