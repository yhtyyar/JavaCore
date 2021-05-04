package main.java.com.yhtyyar.javacore.practic.algorithm;

import java.util.Arrays;

public class FibonacciNumber {

    public static void main(String [] args) {

        int n = 100;
        long [] mem = new long[n + 1];

        Arrays.fill(mem, -1);
        System.out.println(fibNaive(n, mem));
        System.out.println(fibEffective(100));

    }

    // медленно работающий алгоритм(переделан)
    private static long fibNaive (int n, long [] mem) {

        if (mem[n] != -1)
            return mem[n];
        if (n <= 1)
            return n;

        long result =  fibNaive(n-1, mem) + fibNaive(n-2, mem);
        mem[n] = result;

        return result;
    }

    //эффективный алгоритм
    private static long fibEffective (int n) {

        long [] arr = new long [n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr [i - 1] + arr[i - 2];
        }

        return arr[n];
     }

}
