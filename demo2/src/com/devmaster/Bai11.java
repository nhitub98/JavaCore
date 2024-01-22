package com.devmaster;

import java.util.Scanner;

public class Bai11 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap n: ");
            int n = scanner.nextInt();
            System.out.println("Cac so hoan hao tu 1 den" + n + " la:");
            for (int i = 1; i <= n; i++) {
                if (sohoanhao(i)) {
                    System.out.println(i);
                }
            }
            scanner.close();
        }
        static boolean sohoanhao(int num) {
            if (num <= 0) {
                return false;
            }

            int sum = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            return sum == num;
        }
    }

