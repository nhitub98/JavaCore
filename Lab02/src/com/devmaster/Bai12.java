 package com.devmaster;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem toan:");
        float toan = sc.nextFloat();
        System.out.println("Nhap diem ly:");
        float ly = sc.nextFloat();
        System.out.println("Nhap diem hoa:");
        float hoa = sc.nextFloat();
        float tong = toan + ly + hoa;
        if((tong>=15) && (toan>=4) && (ly>=4) && (hoa>=4)){
            System.out.println("Thi dau");
            if((toan>5) && (ly>5) && (hoa>5)){
                System.out.println("Hoc deu cac mon");
            }else{
                System.out.println("Hoc chua deu cac mon");
            }
        }else{
            System.out.println("Thi hong");
        }
    }
}

