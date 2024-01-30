package com.devmaster.vehicle.car;

import com.devmaster.vehicle.Vehicle;
import lombok.Data;

@Data
public class Car extends Vehicle {
    String color;

    @Override
    public void input() {
        super.input();
        color=scanner.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("%s", color);
    }
}
