package com.devmaster;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x:");
        int x = sc.nextInt();
        System.out.println("Nhap y:");
        int y = sc.nextInt();
        System.out.println("Nhap phep tinh");
        char pheptinh = sc.next().charAt(0);
        switch (pheptinh) {
            case '+':
                System.out.println("x + y = " + (x + y));
                break;
            case '-':
                System.out.println("x - y = " + (x - y));
                break;
            case '*':
                System.out.println("x * y = " + (x * y));
                break;
            case '/':
                if (y == 0) {
                    System.out.println("Khong chia duoc");
                } else {
                    System.out.println("x / y = " + ((double) x / y));
                }
                break;
            default:
                System.out.println("Nhap lai phep tinh hop le");
        }
    }
}