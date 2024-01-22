package com.skymate8.module3.one;

public class Fibonacci {


    public static int fibonacciTerm(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else if (n >= 3) {
            return fibonacciTerm(n-1) + fibonacciTerm(n-2);
        } else {
            return n;
        }

    }

    public static int fibonnaciSum(int n) {
        return fibonacciTerm(n+2) - 1;
    }

    public static void main(String[] args) {
        System.out.println(fibonnaciSum(5));
        System.out.println(fibonnaciSum(10));
        System.out.println(fibonnaciSum(-1));
    }


}