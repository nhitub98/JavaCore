package com.devmaster;

public class Bai2 {
//    int xuatTongN(int n){
//        int s=0;
//        for (int i = 1; i <= n; i++) {
//            s=s+i;
//        }
//        System.out.printf("Tong tu 1-%d:%d", n,s);
//    }
    int xuatTongN(int n){
        int s=0;
        for (int i = 1; i <= n; i++) {
            s=s+i;
        }
        return s;
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int s=0;
//        System.out.println("Nhap n:");
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            s=s+i;
//        }
//        System.out.println("Tong la " + s);
        Bai2 bai2= new Bai2();
        int s =bai2.xuatTongN(10);
        System.out.printf("Tong tu 1-10: %d",s);
    }
}
