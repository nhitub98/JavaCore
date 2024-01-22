package com.devmaster;
import java.util.Scanner;
public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so n: ");
        int n = scanner.nextInt();

        System.out.println("Dang luy thua cua " + n + " la");
        primeFactorization(n);
        scanner.close();
    }
    static void primeFactorization(int num) {
        if (num <= 1) {
            System.out.println("So khong co dang luy thua");
            return;
        }

        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
    }
}