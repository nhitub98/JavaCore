package com.devmaster.vietnam;

import java.util.Scanner;

public class GeneralManager {
    public static void main(String[] args) {
        System.out.println("1.Nhap");
        System.out.println("2.Xuat");
        System.out.println("3. Gia ban tai Viet Nam:");
        System.out.println("4.Thoat");
        int index;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap gia tri menu");
        VietNamImportPrice vietNamImportPrice= new VietNamImportPrice();
        vietNamImportPrice.input();
        vietNamImportPrice.display();
        System.out.println("Gia tri ban tai VN"+ vietNamImportPrice.caculateSalePrice());
    }
public void input(){
        super.input();
    System.out.println("Thue nhap khau");
    Scanner scanner=new Scanner(System.in);

}
}
