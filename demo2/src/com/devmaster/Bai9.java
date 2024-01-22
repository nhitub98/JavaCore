package com.devmaster;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int choice;
                do {
                    System.out.println("Cuoi tuan ban muon lam gi");
                    System.out.println("1. Di hoc Java");
                    System.out.println("2. Di choi cong vien ngam gau");
                    System.out.println("3. Di ve nha nghi");
                    System.out.println("4. Ra song hong tam tien");
                    System.out.println("5. Ngu ca ngay");
                    System.out.println("6. Thoat");
                    System.out.print("Nhap lua chon: ");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("1. Di hoc Java");
                            break;
                        case 2:
                            System.out.println("2. Di choi cong vien ngam gau");
                            break;
                        case 3:
                            System.out.println("3. Di ve nha nghi");
                            break;
                        case 4:
                            System.out.println("4. Ra song hong tam tien");
                            break;
                        case 5:
                            System.out.println("5. Ngu ca ngay");
                            break;
                        case 6:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Lua chon khong hop le");
                            break;
                    }
                } while (choice != 0);
                scanner.close();
            }
        }

