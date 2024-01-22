package com.devmaster.product;

import java.util.Scanner;

public class Product {
    private String prodId;
    private String prodName;
    private String manufacturer;
    private float producerPrice;

    public Product(String prodId, String prodName, String manufacturer, float producerPrice) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.manufacturer = manufacturer;
        this.producerPrice = producerPrice;
    }

    public Product() {
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getProducerPrice() {
        return producerPrice;
    }

    public void setProducerPrice(float producerPrice) {
        this.producerPrice = producerPrice;
    }

     void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ma san pham:");
        prodId = scanner.nextLine();
        System.out.println("Ten san pham:");
        prodName = scanner.nextLine();
        System.out.println("Nha san xuat:");
        manufacturer = scanner.nextLine();
        System.out.println("Gia san xuat:");
        producerPrice = Float.parseFloat(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId='" + prodId + '\'' +
                ", prodName='" + prodName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", producerPrice=" + producerPrice +
                '}';
    }

     void display() {
        System.out.println(this);
    }
   public   float calculateSalePrice() {
        float price=producerPrice+(producerPrice*5)/100;
        return price;
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.input();
        product.display();
        System.out.println("Gia ban la: " + product.calculateSalePrice());
    }


}