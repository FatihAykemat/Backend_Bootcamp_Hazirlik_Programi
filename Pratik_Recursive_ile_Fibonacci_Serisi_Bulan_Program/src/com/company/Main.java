package com.company;
import java.util.*;
public class Main {
    public static long fib(long n) {
        if ((n == 0) || (n == 1))
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
	// Fibonacci
        System.out.println("The 0th fibonacci number is: " + fib(0));
        System.out.println("The 7th fibonacci number is: " + fib(7));
        System.out.println("The 12th fibonacci number is: " + fib(12));
    }
}
