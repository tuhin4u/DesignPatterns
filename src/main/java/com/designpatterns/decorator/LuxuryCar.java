package com.designpatterns.decorator;

public class LuxuryCar extends CarDecoretor {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("adding features of luxury car");

    }
}
