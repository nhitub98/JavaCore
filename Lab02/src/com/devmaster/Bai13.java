package com.devmaster;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so gio lam:");
        float gio = sc.nextFloat();
        System.out.println("Nhap luong/gio:");
        float luong = sc.nextFloat();
        float tong = luong * gio;
        if (gio < 40) {
            System.out.println("So tien luong tong cong la:" + (tong));
        } else {
            float sogiolamdu=gio-40;
            System.out.println("So tien luong tong cong la:" + ((40 * luong) + (sogiolamdu *luong * 1.5)));
        }
    }
}