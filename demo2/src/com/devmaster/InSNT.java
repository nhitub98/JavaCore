package com.devmaster;


public class InSNT {
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
        System.out.println("La nguyen to");
        return true;
    }
    public static void main(String[] args) {
        InSNT insnt = new InSNT();
//        boolean n =bai4.SNT(7);
        for(int i=2; i<100; i++){
            if(insnt.SNT(i))
                System.out.println(i);

        }
    }
}
