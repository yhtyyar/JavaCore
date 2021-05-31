package main.java.com.yhtyyar.javacore.chapter28.callable_future;

import java.util.concurrent.*;

public class CallableDemo {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<Integer> f1;
        Future<Double> f2;
        Future<Integer> f3;

        System.out.println("Запуск");

        f1 = executorService.submit(new Sum(10));
        f2 = executorService.submit(new Hypot(3, 4));
        f3 = executorService.submit(new Factorial(5));

        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());

        } catch (InterruptedException e) {
            System.out.println(e);
        } catch (ExecutionException ex) {
            System.out.println(ex);
        }


    }
}

class Sum implements Callable<Integer> {

    int stop;

    Sum (int v) {
        stop = v;
    }

    @Override
    public Integer call() {

        int sum = 0;
        for (int i = 0; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}

class Hypot implements  Callable<Double> {

    double side1, side2;

    Hypot(double s1, double s2) {

        side1 = s1;
        side2 = s2;
    }

    @Override
    public Double call() {

        return Math.sqrt((side1 * side1) + (side2 * side2));
    }
}

class Factorial implements Callable<Integer>{

    int stop;

    Factorial(int v) {

        stop = v;
    }


    @Override
    public Integer call() {
        int fact = 1;

        for (int i = 2; i <= stop; i ++) {
            fact *= i;
        }
        return fact;
    }
}
