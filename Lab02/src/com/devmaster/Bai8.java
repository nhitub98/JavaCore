package com.devmaster;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int thang;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thang: ");
        thang = scanner.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + thang + " co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang" + thang + " co 30 ngay");
                break;
            case 2:
                int nam;
                System.out.println("Nhap nam: ");
                nam = scanner.nextInt();
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                    System.out.println("Thang " + thang + " nam " + nam + " co 29 ngay");
                } else {
                    System.out.println("Thang " + thang + " nam " + nam + " co 28 ngay");
                }
                break;
            default:
                System.out.println("Thang khong hop le");
        }
    }

}
