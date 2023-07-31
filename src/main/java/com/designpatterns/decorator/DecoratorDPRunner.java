package com.designpatterns.decorator;

public class
DecoratorDPRunner {
    public static void main(String[] args) {
        Car sportcar=new SportsCar(new BasicCar());
        sportcar.assemble();

        Car sportLuxurycar=new SportsCar(new LuxuryCar(new BasicCar()));
        sportLuxurycar.assemble();
    }
}
