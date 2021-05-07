package com.designpatterns.observer;

public class Subscriber implements MyObserver{
    private String name;
    private Subject topic;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg=topic.getMsg();
        System.out.println(name+"--consume-->"+msg);
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic=subject;
    }
}
