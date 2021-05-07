package com.designpatterns.observer;

public interface Subject {
    public void register(MyObserver obj);
    public void unregister(MyObserver obj);
    public void notifyObservers();
    public String getMsg();
}

