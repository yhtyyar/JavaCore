package main.java.com.yhtyyar.javacore.chapter28.exchanger;

import java.util.concurrent.Exchanger;

public class ExgrDemo {


    public static void main (String [] args) {

        Exchanger <String> exgr = new Exchanger<>();


        new UseString(exgr);
        new MakeString(exgr);

    }
}

class MakeString implements Runnable {

    Exchanger <String> ex;
    String str;


    MakeString(Exchanger<String> exchanger) {

        ex = exchanger;
        str = new String();
        new Thread(this).start();
    }


    @Override
    public void run() {

        char ch = 'A';

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {

                str += (char) ch++;
            }
            try {
                str = ex.exchange(str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class UseString implements Runnable {

    Exchanger <String> ex;
    String str;

    UseString(Exchanger<String> exchanger) {

        ex = exchanger;
        new Thread(this).start();
    }

    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {

            try {
                str = ex.exchange(new String());
                System.out.println("Получено: " + str);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
