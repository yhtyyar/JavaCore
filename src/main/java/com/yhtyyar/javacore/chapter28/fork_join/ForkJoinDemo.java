package main.java.com.yhtyyar.javacore.chapter28.fork_join;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinDemo {

    public static void main(String[] args) {

        ForkJoinPool forkJoinPool = new ForkJoinPool();

        double [] nums = new double[100_000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] =  i;
        }

        System.out.println("Часть исходной последовательности.");

        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");

        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);

        forkJoinPool.invoke(task);

        System.out.println("Часть преобразованной последовательности " +
                " (с точностью до четырех знаков после десятичной точки) :");

        for (int i = 0; i < 10; i++) {
            System.out.format("%.4f ", nums[i]);
        }
        System.out.println();
    }
}


class SqrtTransform extends RecursiveAction {

    final int seqThreshold = 1000;

    double [] data;

    int start, end;

    SqrtTransform(double [] vals, int start, int end) {

        data = vals;
        this.start = start;
        this.end = end;
    }

    protected void compute() {

        // Если количество элементов меньше порогового значения,
        // выполнить дальнейшею обработку последовательно
        if ((end - start) < seqThreshold) {

            for (int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i]);
            }

        } else { // в противнос случае
            // находим середину
            int middle = (start + end) / 2;

            invokeAll(new SqrtTransform(data, start, middle),
                      new SqrtTransform(data, middle, end));
        }
    }
}