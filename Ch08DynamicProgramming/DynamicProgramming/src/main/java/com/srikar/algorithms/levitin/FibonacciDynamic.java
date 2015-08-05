package com.srikar.algorithms.levitin;

import java.util.ArrayList;
import java.util.List;

/*

 f(n) = f(n-1) + f(n-2) if n > 1
 f(0) = 0 and f(1) = 1

 */
public class FibonacciDynamic {

    public static long fibonacci(int n) {
        List<Integer> fibonacciList = new ArrayList<>(n + 1);
        fibonacciList.add(0);
        fibonacciList.add(1);
        for (int i = 2; i <= n; ++i) {
            fibonacciList.add(fibonacciList.get(i - 1) + fibonacciList.get(i - 2));
        }
        return fibonacciList.get(n);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 15; ++i) {
            System.out.println("Fibonacci(" + i +"): " + fibonacci(i));
        }
    }
}
