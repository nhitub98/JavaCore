package com.devmaster;
import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu cao tam giac: ");
        int height = scanner.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= 2 * height - 1; j++) {
                if (i == height || j == height - i + 1 || j == height + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}