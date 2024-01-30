package com.devmaster.demoabtract;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Ivehicle{
    @Override
    public void nhap(){
        System.out.println("Xe máy");
    }

    public static void main(String[] args) {
        Ivehicle vehicle = new Vehicle();
        vehicle.nhap();
        List<Ivehicle> ivehicleList = new ArrayList<>();
        ivehicleList.add(new Vehicle());
        ivehicleList.add(new Car());
        ivehicleList.forEach(ivehicle -> ivehicle.nhap());
        Ivehicle vehicile = new Ivehicle() { //lớp nặc danh chỉ sinh ra khi được khởi tạo
            @Override
            public void nhap() {

            }
        };

    }

}
