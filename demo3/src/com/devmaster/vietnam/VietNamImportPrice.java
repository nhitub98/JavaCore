package com.devmaster.vietnam;

import com.devmaster.product.Product;

import java.util.Scanner;

public class VietNamImportPrice extends Product {
    private float taxImported;

    public float getTaxImported() {
        return taxImported;
    }

    public void setTaxImported(float taxImported) {
        this.taxImported = taxImported;
    }

    public VietNamImportPrice(String prodId, String prodName, String manufacturer, float producerPrice, float taxImported) {
        super(prodId, prodName, manufacturer, producerPrice);
        this.taxImported = taxImported;
    }
public VietNamImportPrice(){ }
    void input(){
        System.out.println("Thue nhap khau");
        Scanner scanner=new Scanner(System.in);
        taxImported=Float.parseFloat(scanner.nextLine());
    }
    public void xuat(){
        super.display();
        System.out.println(toString());
    }
    public float caculateSalePrice() {
        return super.caculateSalePrice()+taxImported+10*(super.getProducerPrice()+taxImported)/100;
    }
    }

