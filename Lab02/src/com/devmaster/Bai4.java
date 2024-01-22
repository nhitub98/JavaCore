package com.devmaster;

import com.devmaster.Main;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        float a = sc.nextFloat();
        System.out.println("Nhap b:");
        float b = sc.nextFloat();
        System.out.println("Nhap c:");
        float c = sc.nextFloat();
        if (a == 0) {
            if (c == 0) {
                System.out.println("x=0");
            } else {
                System.out.printf("x= %.2f", -b / c);
            }
        }
        else{
            float delta = b * b - 4 * a * c;
            if (delta < 0)
                System.out.println("Phuong trinh vo nghiem");
            else if (delta == 0)
                System.out.printf("x=%.2f", + (-b / (2 * a)));
            else {
                System.out.printf("x1=%.2f", + (-b + Math.sqrt(delta)) / (2 * a));
                System.out.printf("x2=%.2f", + (-b - Math.sqrt(delta)) / (2 * a));
            }
        }
    }
}




