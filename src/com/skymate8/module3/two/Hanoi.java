package com.skymate8.module3.two;
public class Hanoi {

    public static void move(int n, int first, int sec, int spare) {
        if (n == 1) {
            System.out.println("1 from " + first + " -> " + sec);
        } else {
            move(n - 1, first, spare, sec);
            System.out.println(n + " from " + first + " -> " + sec);
            move(n - 1, spare, sec, first);
        }
    }

    public static void main(String[] args) {
        int height = 4;
        Hanoi.move(height, 1, 2, 3);
    }
}