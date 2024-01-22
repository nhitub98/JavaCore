package com.devmaster;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chi so cu:");
        int chisocu = scanner.nextInt();
        System.out.print("Chi so moi");
        int chisomoi = scanner.nextInt();
        int dinhmuc = 50;
        int dongiadinhmuc = 230;
        int tienthuebaodienke = 1000;
        int luongdiensudung = chisomoi - chisocu;
        int phandinhmuc;
        int phanvuotdinhmuc;
        if (luongdiensudung > dinhmuc) {
            phandinhmuc = dinhmuc;
            phanvuotdinhmuc = luongdiensudung - dinhmuc;
        } else {
            phanvuotdinhmuc = 0;
            phandinhmuc = luongdiensudung;
        }
        int dongiavuotdinhmuc;
        if (phanvuotdinhmuc <= 50)
            dongiavuotdinhmuc = 480;
        else if (phanvuotdinhmuc < 100)
            dongiavuotdinhmuc = 700;
        else dongiavuotdinhmuc = 900;
        int tientradinhmuc = phandinhmuc * dongiadinhmuc;
        int tienvuotdinhmuc = phanvuotdinhmuc * dongiavuotdinhmuc;
        int tongtienphaitra = tientradinhmuc + tienvuotdinhmuc + tienthuebaodienke;
        System.out.println("Chi so cu" + chisocu);
        System.out.println("Chi so moi: " + chisomoi);
        System.out.println("Tien tra dinh muc" + tientradinhmuc);
        System.out.println("Tien tra vuot dinh muc" + tienvuotdinhmuc);
        System.out.println("Tong tien phai tra " + tongtienphaitra);
    }
}
