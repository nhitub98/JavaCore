package com.devmaster;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap diem ly thuyet:");
        float lt = sc.nextFloat();
        System.out.println("Nhap diem thuc hanh:");
        float th = sc.nextFloat();
        float dtb= (lt+th)/2;
        if(lt<4) {
            System.out.println("Thi lai ly thuyet");
        }
        if(th<4){
            System.out.println("Thi lai thuc hanh");
        }
        if(dtb<4){
            System.out.println("Sinh vien phai hoc lai");
        }else if(dtb<7){
            System.out.println("Sinh vien dat mon Java");
        }else{
            System.out.println("Sinh vien xuat sac mon Java");
        }
    }
}
