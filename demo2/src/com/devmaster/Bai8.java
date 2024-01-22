package com.devmaster;
import java.util.Scanner;
public class Bai8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        int giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }
        System.out.println("Giai thua cua " + n + " la " + giaiThua);
        scanner.close();
    }
}