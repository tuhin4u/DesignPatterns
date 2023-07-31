package com.designpatterns.singleton;

import java.io.Serializable;

final class MySingleton implements Cloneable, Serializable {
    private static MySingleton instance;

    private MySingleton(){}

    public static MySingleton getInstance(){
        if (instance==null){
            synchronized(MySingleton.class){
                if(instance==null){
                    instance= new MySingleton();
                }
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }
    public Object readResolve() {
        System.out.println("Executing readResolve");
        return this;
    }
}
public class SingletonEx {
    public static void main(String[] args) throws CloneNotSupportedException {
        MySingleton instance= MySingleton.getInstance();
        MySingleton instance2= MySingleton.getInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        MySingleton instance3= (MySingleton) instance2.clone();
        System.out.println(instance3.hashCode());
    }
}

