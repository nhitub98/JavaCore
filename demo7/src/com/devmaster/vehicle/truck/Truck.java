package com.devmaster.vehicle.truck;

import com.devmaster.vehicle.Vehicle;
import lombok.Data;

@Data
public class Truck extends Vehicle {
    int truckload;

    @Override
    public void input() {
        super.input();
        truckload=Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("%d", truckload);
    }
}
