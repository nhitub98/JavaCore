package com.devmaster;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        double a = sc.nextDouble();
        System.out.println("Nhap b:");
        double b = sc.nextDouble();
        System.out.println("Nhap c:");
        double c = sc.nextDouble();
        if(a+b>c && a+c>b && c+b>a) {
            System.out.println("3 canh tao thanh hinh tam giac");
            System.out.println("Nhap chieu cao h cua tam giac:");
            double h = sc.nextDouble();
            System.out.println("Chu vi cua tam giac la:" + (a + b + c));
            System.out.println("Dien tich cua tam giac la:" + (a*h)/2);
        }else
        System.out.println("3 canh khong tao thanh hinh tam giac");
    }
}

