package com.devmaster;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap a:");
        int a = sc.nextInt();

        System.out.println("Nhap b:");
        int b = sc.nextInt();

        System.out.println("Nhap c:");
        int c = sc.nextInt();

        System.out.println("Nhap d:");
        int d = sc.nextInt();

        int x, y;

        if (a > b) {
            x = a;
            System.out.println("So lon nhat x la:" + a);
        } else {
            x = b;
            System.out.println("So lon nhat x la:" + b);
        }

        if (c > d) {
            y = c;
            System.out.println("So lon nhat y la:" + c);
        } else {
            y = d;
            System.out.println("So lon nhat y la:" + d);
        }
        if (x > y) {
            System.out.println("So lon nhat la x: " + x);
        } else {
            System.out.println("So lon nhat la y: " + y);
        }
    }
}