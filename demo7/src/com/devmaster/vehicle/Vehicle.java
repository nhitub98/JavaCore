package com.devmaster.vehicle;

import lombok.Data;

import java.util.Scanner;

@Data
public class Vehicle implements Ivehicle {
    String maker;
    String model;
    double price;
    public static Scanner scanner= new Scanner(System.in);
    @Override
    public void input() {
        System.out.println("Nhap:");
        maker= scanner.nextLine();
        model=scanner.nextLine();
        price=Double.parseDouble(scanner.nextLine());


    }
    @Override
    public void display() {
        System.out.printf("%s %s %.2f", maker, model, price);
    }
}
