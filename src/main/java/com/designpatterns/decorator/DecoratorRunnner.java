package com.designpatterns.decorator;

interface ICar{
    public void assemble();
}
class BaseCarImpl implements ICar{

    @Override
    public void assemble() {
        System.out.println("Basic car");
    }
}

class CarDecorator implements ICar{
    ICar car;

    public CarDecorator(ICar car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
class ElectricCar extends CarDecorator{

    public ElectricCar(ICar car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("adding features of electric car");
    }
}


public class DecoratorRunnner {
    public static void main(String[] args) {
        ElectricCar car= new ElectricCar(new BaseCarImpl());
        car.assemble();
    }
}
