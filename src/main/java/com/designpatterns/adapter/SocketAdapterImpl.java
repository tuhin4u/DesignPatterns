package com.designpatterns.adapter;

public class SocketAdapterImpl extends Socket implements SocketAdapter {

    //here we can make a composition of  Socket class instead of inheritance
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v=getVolt();
        return new Volt(v.getVolts()/10);
    }

    @Override
    public Volt get3Volt() {
        Volt v=getVolt();
        return new Volt(v.getVolts()/40);
    }
}
