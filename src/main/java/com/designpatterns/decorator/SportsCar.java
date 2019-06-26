package com.designpatterns.decorator;

public class SportsCar extends CarDecoretor {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("adding features of sport car");
    }
}
