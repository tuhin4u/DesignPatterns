package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject{
    private List<MyObserver> observerList;
    private String msg;

    public MyTopic() {
        observerList=new ArrayList<>();
    }

    @Override
    public void register(MyObserver obj) {
        if (!observerList.contains(obj)){
            observerList.add(obj);
        }
    }

    @Override
    public void unregister(MyObserver obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(x->x.update());
    }
    public void postMessage(String msg){
        System.out.println("message created in topic");
        this.msg=msg;
        notifyObservers();
    }

    public String getMsg() {
        return msg;
    }
}
