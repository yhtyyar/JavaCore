package main.java.com.yhtyyar.javacore.practic.concurrent.solution;

class AThread implements Runnable{

    Foo foo;

    AThread(Foo foo) {

        this.foo = foo;
        new Thread(this).start();
    }

    public void run() {

        foo.first();
    }
}


class BThread implements Runnable {


    Foo foo;

    BThread(Foo foo) {

        this.foo = foo;
        new Thread(this).start();
    }

    public void run() {

        foo.second();
    }
}


class CThread implements Runnable {

    Foo foo;

    CThread(Foo foo) {

        this.foo = foo;
        new Thread(this).start();
    }


    public void run() {

        foo.third();

    }
}