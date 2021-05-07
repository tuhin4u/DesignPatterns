package com.designpatterns.observer;

public class ObserverDPRunner {
    public static void main(String[] args) {
        MyTopic topic=new MyTopic();

        MyObserver observer1=new Subscriber("observer1");
        observer1.setSubject(topic);
        MyObserver observer2=new Subscriber("observer2");
        observer2.setSubject(topic);
        MyObserver observer3=new Subscriber("observer3");
        observer3.setSubject(topic);

        topic.register(observer1);
        topic.register(observer2);
        topic.register(observer3);
        topic.postMessage("message1");
    }
}
