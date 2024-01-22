package com.devmaster;

import java.util.Scanner;

public class Bai12 {
    public static int findFibonacci(int n) {
        if (n == 0||n == 1) {
            return 1;
        }
        return findFibonacci(n - 2) + findFibonacci(n - 1);
    }
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap n: ");
        try (Scanner scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(findFibonacci(i)>100)
                break;
            System.out.print(Bai12.findFibonacci(i)+" ");
        }
    }
}