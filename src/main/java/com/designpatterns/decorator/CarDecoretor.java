package com.designpatterns.decorator;

public class CarDecoretor  implements Car{
    Car car;

    public CarDecoretor(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
