package com.devmaster;

public class Bai4 {
    boolean SNT(int n) {
        if (n < 2) {
            System.out.println("Khong phai so nguyen to");
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println("Khong phai so nguyen to");
                return false;
            }
        }
        System.out.println("La so nguyen to");
        return true;
    }

    public static void main(String[] args) {
        Bai4 bai4 = new Bai4();
        boolean n =bai4.SNT(7);
        }
    }

