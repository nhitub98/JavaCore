package com.devmaster;

import java.util.Scanner;

public class Bai3 {
    int UCLN(int x, int y) {
        int UCLN = 1;
        int n = x < y ? x : y;
//        for(int i=1;i<n;i++){
        for (int i = n; i > 0; i--) {
            if (x % i == 0 && y % i == 0) {
                UCLN = i;
                System.out.println("Uoc chung x, y la " + i);
                break;
            }
        }
        return UCLN;
    }

    int BCNN(int x, int y) {
        int BCNN= 1;
        int n=x*y;
        for (int i = 1; i < n; i++) {
            if (i % x == 0 && i % y == 0) {
                System.out.println("Boi chung x, y la " + i);
                break;
            }
        }
        return BCNN;
    }
    public static void main(String[] args) {
        Bai3 bai3= new Bai3();
        int n =bai3.UCLN(20,30);
        int a =bai3.BCNN(20,30);

    }
    }

