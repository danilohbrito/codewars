package org.CaixaVerso;

import java.util.Arrays;

public class FibonacciMemo {
    public static long fib(int n, long[] memo) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 40;
        long[] memo = new long[n + 1];
        Arrays.fill(memo, -1);
        System.out.println(fib(n, memo)); // 102334155
    }
}







