package com.mindera.school;

import java.util.List;

/**
 * Used to calculate the Fibonacci sequence
 *
 * https://en.wikipedia.org/wiki/Fibonacci_number
 * https://youtube.com
 */
public class FibonacciCalculator {

    public String fibonacciSequence(final Integer n){

        int n1 = 0;
        int n2 = 1;
        int fn = 2;

        for (int i = 1; i > 0; i ++){
            System.out.print(n1 + " , ");
            int fib = n1 + n2;
            n1 = n2;
            n2 = fib;
        }

        return fibonacciSequence(n);

    }


    public List<String> sequences(List<Integer> entries)  {

        // TODO you should use threads for this
        return List.of("");
    }
}
