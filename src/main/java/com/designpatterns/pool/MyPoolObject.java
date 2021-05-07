package com.designpatterns.pool;

public class MyPoolObject {
    static int count=0;
    public MyPoolObject() {
        count++;
        System.out.println("object created "+count);
    }

    private boolean inUse;

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }
}
