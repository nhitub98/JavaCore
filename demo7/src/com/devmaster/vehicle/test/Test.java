package com.devmaster.vehicle.test;

import com.devmaster.vehicle.Vehicle;
import com.devmaster.vehicle.car.Car;
import com.devmaster.vehicle.truck.Truck;

import java.util.*;

public class Test {
    List<Vehicle> vehicles = new ArrayList<>();
    int n;
    void nhap() {

        for(int i=0;i<2;i++){
            System.out.println("Nhap car" + i + ":");
            Car car= new Car();
            car.input();
            vehicles.add(car);

            System.out.println("Nhap truck" + i + ":");
            Truck truck = new Truck();
            truck.input();
            vehicles.add(truck);

        }
    }
    void xuat(){
        for (Vehicle vehicle:vehicles){
            vehicle.display();
            System.out.println();
        }
    }
    void sapxep(){
        vehicles.sort((o1,o2)->(int)(o1.getPrice()-o2.getPrice()));
    }
    public static void main(String[] args) {
//        Car car= new Car();
//        car.input();
//        car.display();
//        Truck truck= new Truck();
//        truck.input();
//        truck.display();
        Test test=new Test();
        test.nhap();
        test.xuat();
        System.out.println("Sau khi sap xep");
        test.sapxep();
        test.xuat();
        }
    }

