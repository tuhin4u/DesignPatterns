package com.designpatterns.FactoryMethod;

interface Pizza{
    public default void Pizza() {
        System.out.println("base pizza");
    }
    public default void prepare(){
        System.out.println("preparing pizza");
    }
    public default void box(){
        System.out.println("boxing pizza");
    }
}
class NYCheesePizza implements Pizza{
    public  void Pizza() {
        System.out.println(" NY cheese base pizza");
    }
    public void prepare(){
        System.out.println("NY cheese preparing pizza");
    }
    public void box(){
        System.out.println("NY cheese boxing pizza");
    }
}

class ScVegPizza implements Pizza{
    public  void Pizza() {
        System.out.println(" Sc Veg base pizza");
    }
    public void prepare(){
        System.out.println("Sc veg preparing pizza");
    }
    public void box(){
        System.out.println("sc veg boxing pizza");
    }
}
abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza= createPizza(type);

        //prepare
        pizza.prepare();
        //package
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese"))
            return new NYCheesePizza();
        return null;
    }
}
class SCPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("veg"))
            return new ScVegPizza();
        return null;
    }
}

public class FactoryMethodRunner{
    public static void main(String[] args) {
        PizzaStore pizzaStore=new NYPizzaStore();
        Pizza p=pizzaStore.orderPizza("cheese");


    }
}

