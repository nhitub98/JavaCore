package com.devmaster;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap a:");
        float a = sc.nextFloat();
        System.out.println("Nhap b:");
        int b= sc.nextInt();
        System.out.println("a+b= " + (a+b));
        System.out.println("a-b= " + (a-b));
        System.out.println("a*b= " + (a*b));
        System.out.println("a/b= " + (a/b));
    }
}
