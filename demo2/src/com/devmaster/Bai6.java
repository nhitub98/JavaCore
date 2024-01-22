package com.devmaster;
import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {

        int height, width;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai:");
        height = sc.nextInt();

        System.out.print("Nhap chieu rong:");
        width = sc.nextInt();
        for(i = 1; i <= height; i++){
            for(int j = 1; j <= width; j++) {
                if(i == 1 || i == height || j == 1 || j == width)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.println("");
        }
        sc.close();
    }
}