package com.devmaster;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap N:");
        int N = sc.nextInt();
        if(N%2==0)
            System.out.println(N+" la so chan");
        else
            System.out.println(N+" la so le");
    }
}
